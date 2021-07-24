<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method="POST" action="" onsubmit="return doRegistration()" autocomplete="off" >
<div class ="txt_field">
    <input type="text" id="fName" name="fName" placeholder="First Name" maxlength="30" required /><br>
    <input type="text" id ="lName" name="lName" placeholder="Last Name" maxlength="30" required /><br>
    Gender</br>
    <input type="radio" id="male" name="gender" value="M" required ><label >Male</label>
    <input type="radio" id="female" name="gender" value="F"><label >Female</label>
    <input type="radio" id="other" name="gender" value="O"><label >Other</label><br>
    <input type="text" id="dob" name="dob" placeholder="D.O.B" required /><br>
    <textarea  id="address" name="address" placeholder="Address" maxlength="200" required ></textarea> <br>
    <input type="text" id="state" name="state" placeholder="State" maxlength="30" required /><br>
    <input type="text" id="pinNo" name="pinNo" placeholder="Pin No" maxlength="10" required /><br>
    <input type="text" id="phoneNo" name="phoneNo" placeholder="Phone No"  required /><br>
    <input type="email" id ="email" name="email" placeholder="Email" maxlength="50" required /><br>
    <input type="password" id ="password" name="password" placeholder="Password" required /><br>
    <input type="password" id ="cnfrmPassword" name="cnfrmPassword" placeholder="Confirm Password" required /><br>
    <input type="submit" value="Register" /><br>
    </div>
</form>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css"> 
</body>
</html>