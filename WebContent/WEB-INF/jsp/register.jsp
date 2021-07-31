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
					<label>First Name </label> <input type="text" class="input"
						required>
				</div>
				<div class="input_field">
					<label>Last Name </label> <input type="text" class="input" required>
				</div>
				<div class="input_field">
					<label>Gender</label>
					<div class="custom_select">
						<select>
							<option value="">Select</option>
							<option value="male">Male</option>
							<option value="female">Female</option>
							<option value="female">Other</option>
						</select>
					</div>
				</div>
				<div class="input_field">
					<label>D.O.B </label> <input type="text" class="input" required>
				</div>
				<div class="input_field">
					<label>Address </label>
					<textarea class="textarea" required></textarea>
				</div>
				<div class="input_field">
					<label>State </label> <input type="text" class="input" required>
				</div>
				<div class="input_field">
					<label>PIN No </label> <input type="text" class="input" required>
				</div>
				<div class="input_field">
					<label>Phone No </label> <input type="text" class="input" required>
				</div>
				
				<div class="input_field">
					<label>Emergency No </label> <input type="text" class="input" required>
				</div>
				<div class="input_field">
					<label>Email Id </label> <input type="text" class="input" required>
				</div>
				
				<div class="input_field">
					<label>User Acces</label>
					<div class="custom_select">
						<select>
							<option value="">Select</option>
						</select>
					</div>
				</div>

				<div class="input_field">
					<label>Password </label> <input type="password" class="input"
						required>
				</div>

				<div class="input_field">
					<label>Confirm Password </label> <input type="text" class="input"
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
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css"> 
</body>
</html>