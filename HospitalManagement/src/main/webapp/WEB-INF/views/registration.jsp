<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Doctor Application</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>

 	<div class="generic-container">
	<div class="well lead">Doctor Application</div>
 	<form:form method="POST" modelAttribute="hmsDoctMaster" class="form-horizontal">
		<form:input type="hidden" path="DOC_CODE" id="DOC_CODE"/> 
			
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="docName">Doctor Name</label>
				<div class="col-md-7">
					<form:input type="text" path="docName" id="docName" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="docName" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="docQual">Doctor Qualification</label>
				<div class="col-md-7">
					<form:input type="text" path="docQual" id="docQual" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="docQual" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="docDesig">Doctor Designation</label>
				<div class="col-md-7">
					<form:input type="text" path="docDesig" id="docDesig" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="docDesig" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="docType">Doctor Type</label>
				<div class="col-md-7">
					<form:input type="text" path="docType" id="docType" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="docType" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="docSpec">Doctor Specialties</label>
				<div class="col-md-7">
					<form:input type="text" path="docSpec" id="docSpec" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="docSpec" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="deptCode">Department Code</label>
				<div class="col-md-7">
					<form:input type="text" path="deptCode" id="deptCode" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="deptCode" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="docAddr">Doctor Address</label>
				<div class="col-md-7">
					<form:input type="text" path="docAddr" id="docAddr" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="docAddr" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="phoneOff">Phone Office</label>
				<div class="col-md-7">
					<form:input type="text" path="phoneOff" id="phoneOff" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="phoneOff" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="phoneRes">Phone Resident</label>
				<div class="col-md-7">
					<form:input type="text" path="phoneRes" id="phoneRes" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="phoneRes" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="docIpFees">Doctor IP Fees</label>
				<div class="col-md-7">
					<form:input type="text" path="docIpFees" id="docIpFees" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="docIpFees" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="docOpFees">Doctor OP Fees</label>
				<div class="col-md-7">
					<form:input type="text" path="docOpFees" id="docOpFees" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="docOpFees" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
<%-- 
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="ssoId">SSO ID</label>
				<div class="col-md-7">
					<c:choose>
						<c:when test="${edit}">
							<form:input type="text" path="ssoId" id="ssoId" class="form-control input-sm" disabled="true"/>
						</c:when>
						<c:otherwise>
							<form:input type="text" path="ssoId" id="ssoId" class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="ssoId" class="help-inline"/>
							</div>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div> --%>


		<div class="row">
			<div class="form-actions floatRight">
				<c:choose>
					<c:when test="${edit}">
						<input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
					</c:when>
					<c:otherwise>
						<input type="submit" value="Register" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</form:form>
	</div>
</body>
</html>