<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Users List</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<div style="width:1400px" class="generic-container">
		<div  class="panel panel-default">
			  <!-- Default panel contents -->
		  	<div class="panel-heading"><span class="lead">List of Doctor </span></div>
			<table style="width:4000px" class="table table-hover">
	    		<thead>
		      		<tr>
				        <th>Doctor Name</th>
				        <th>Doctor Qualification</th>
				        <th>Doctor Designation</th>
				        <th>Doctor Type</th>
				        <th>Doctor Specialties</th>
				        <th>Department Code</th>
				        <th>Doctor Address</th>
				        <th>Phone Office</th>
				        <th>Phone Resident</th>
				        <th>Doctor Ip Fees</th>
				        <th>Doctor Op Fees</th>
				       	<th width="150"></th>
				       	<th width="150"></th>
					</tr>
				</thead>
	    		<tbody>
				<c:forEach items="${hmsDoctMaster}" var="hmsDoctMaster">
					<tr>
						<td>${hmsDoctMaster.docName}</td>
						<td>${hmsDoctMaster.docQual}</td>
						<td>${hmsDoctMaster.docDesig}</td>
						<td>${hmsDoctMaster.docType}</td>
						<td>${hmsDoctMaster.docSpec}</td>
						<td>${hmsDoctMaster.deptCode}</td>
						<td>${hmsDoctMaster.docAddr}</td>
						<td>${hmsDoctMaster.phoneOff}</td>
						<td>${hmsDoctMaster.phoneRes}</td>
						<td>${hmsDoctMaster.docIpFees}</td>
						<td>${hmsDoctMaster.docOpFees}</td>
						<td><a href="<c:url value='/edit-user-${hmsDoctMaster.DOC_CODE}' />" class="btn btn-success custom-width">edit</a></td>
						<td><a href="<c:url value='/delete-user-${hmsDoctMaster.DOC_CODE}' />" class="btn btn-danger custom-width">delete</a></td>
					</tr>
				</c:forEach>
	    		</tbody>
	    	</table>
		</div>
	 	<div class="well">
	 		<a href="<c:url value='/newuser' />">Add New Doctor</a>
	 	</div>
   	</div>
</body>
</html>