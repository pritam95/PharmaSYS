<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="" onsubmit="return doRegistration()"
		autocomplete="off">
		<div class="wrapper_1">
			<div class="title">Registration Form</div>
			<div class="form">
				<div class="input_field">
					<label>First Name </label> <input type="text" class="input" id="fName" name="fName"
						required>
				</div>
				<div class="input_field">
					<label>Last Name </label> <input type="text" class="input" id ="lName" name="lName" required>
				</div>
				<div class="input_field">
					<label>Gender</label>
					<div class="custom_select">
						<select id="gender" name="gender">
							<option value="">Select</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
							<option value="O">Other</option>
						</select>
					</div>
				</div>
				<div class="input_field">
					<label>D.O.B </label> <input type="text" class="input" id="dob" name="dob" required>
				</div>
				<div class="input_field">
					<label>Address </label>
					<textarea class="textarea" id="address" name="address" required></textarea>
				</div>
				<div class="input_field">
					<label>State </label> <input type="text" class="input" id="state" name="state" required>
				</div>
				<div class="input_field">
					<label>PIN No </label> <input type="text" class="input" id="pinNo" name="pinNo" required>
				</div>
				<div class="input_field">
					<label>Phone No </label> <input type="text" class="input" id="phoneNo" name="phoneNo" required>
				</div>
				
				<div class="input_field">
					<label>Emergency No </label> <input type="text" class="input" id="emerPhoneNo" name="emerPhoneNo" required>
				</div>
				<div class="input_field">
					<label>Email Id </label> <input type="text" class="input" id ="email" name="email" required>
				</div>
				
				<div class="input_field">
					<label>User Acces</label>
					<div class="custom_select">
						<select id ="userAcces" name="userAcces">
							<option value="">Select</option>
						</select>
					</div>
				</div>

				<div class="input_field">
					<label>Password </label> <input type="password" class="input" id ="password" name="password"
						required>
				</div>

				<div class="input_field">
					<label>Confirm Password </label> <input type="text" class="input" id ="cnfrmPassword" name="cnfrmPassword"
						required>
				</div>
				<div class="input_field terms">
					<label class="check"> <input type="checkbox"> <span
						class="checkmark"></span>
					</label>
					<p>Agreed to terms and conditions</p>
				</div>
				<div class ="input_field_submit">
					<input type="submit" value="Register" class ="btn">
				</div>

			</div>
		</div>
	</form>

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	 <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">	
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
	<!-- link for datepicker -->
	<link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.css" rel="stylesheet" type="text/css" />
	<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.js"></script>
	<!-- link for toatser -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css">
    <script src="${pageContext.request.contextPath}/static/js/toastrSettings.js"></script>
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css"> 
	<script src="${pageContext.request.contextPath}/static/js/register.js"></script>
</body>
</html>