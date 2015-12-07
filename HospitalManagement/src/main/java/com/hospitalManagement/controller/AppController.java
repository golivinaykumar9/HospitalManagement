package com.hospitalManagement.controller;

import java.util.Date;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hospitalManagement.model.HmsDoctMaster;
import com.hospitalManagement.service.DoctorService;

@Controller
@RequestMapping("/")
@SessionAttributes("roles")
public class AppController {

	@Autowired
	DoctorService doctorService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

		List<HmsDoctMaster> hmsDoctMaster = doctorService.findAllHmsDoctMaster();
		model.addAttribute("hmsDoctMaster", hmsDoctMaster);
		return "userslist";
	}

	@RequestMapping(value = { "/newuser" }, method = RequestMethod.GET)
	public String newUser(ModelMap model) {
		HmsDoctMaster hmsDoctMaster = new HmsDoctMaster();
		model.addAttribute("hmsDoctMaster", hmsDoctMaster);
		model.addAttribute("edit", false);
		return "registration";
	}

	@RequestMapping(value = { "/newuser" }, method = RequestMethod.POST)
	public String saveUser(@Valid HmsDoctMaster hmsDoctMaster, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}

		hmsDoctMaster.setCurrentDate(new Date());
		hmsDoctMaster.setAuthBy("admin");
		doctorService.saveUser(hmsDoctMaster);
		model.addAttribute("success", "Doctor  " + hmsDoctMaster.getDocName() + " registered successfully");
		return "registrationsuccess";
	}

	@RequestMapping(value = { "/edit-user-{DOC_CODE}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable int DOC_CODE, ModelMap model) {
		HmsDoctMaster hmsDoctMaster = doctorService.findById(DOC_CODE);
		model.addAttribute("hmsDoctMaster", hmsDoctMaster);
		model.addAttribute("edit", true);
		return "registration";
	}

	@RequestMapping(value = { "/edit-user-{DOC_CODE}" }, method = RequestMethod.POST)
	public String updateUser(@Valid HmsDoctMaster hmsDoctMaster, BindingResult result, ModelMap model,
			@PathVariable int DOC_CODE) {

		if (result.hasErrors()) {
			return "registration";
		}
		hmsDoctMaster.setCurrentDate(new Date());
		doctorService.updateUser(hmsDoctMaster);
		model.addAttribute("success", "Doctor  " + hmsDoctMaster.getDocName() + " updated successfully");
		return "registrationsuccess";
	}

	@RequestMapping(value = { "/delete-user-{DOC_CODE}" }, method = RequestMethod.GET)
	public String deleteUser(@PathVariable int DOC_CODE) {
		doctorService.deleteUserById(DOC_CODE);
		return "redirect:/list";
	}

}
