<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Header Demo</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0">
		
	</head>
	<body>
	<div class ="box-area">
	<header>
	<div class ="wrapper">
	<div class ="logo">
	<a href ="#">Apollo Pharmacy</a>
	</div>
	<nav>
	<a href = "#">Home</a>
	<a href = "#">About Us</a>
	<a href = "#">Career</a>
	<a href = "#">Services</a>
	<a href = "#">Contact</a>
	</nav>
	</div>
	</div>
	</header>
	<div class ="banner-area">
	<h1>Login</h1>
	<form method ="post">
	<div class ="txt_field">
	<input type ="text" required>
	<label>UserName</label>
	</div>
	<div class ="txt_field">
	<input type ="password" required>
	<label>Password</label>
	</div>
	<div class ="pass">Forgot Password</div>
	<input type="submit" value ="Login">
	<div class ="signup_link">
	Not a member? <a href ="${pageContext.request.contextPath}/register">SignUp</a>
	</div>
	</form>
	
	</div>
	<div class ="content-area">
	<div class = "wrapper">
	<h2 class = "content-area-h2" >Content area</h2>
	<p>Many medical experts did experiments with various chemicals on treating human health. It was also the time when there were widespread diseases without any cures. Once people started mixing chemicals and herbal medicines, they started achieving better results. It was in the 19th century, that the bacteria was discovered and microscopes started coming up. A lot of researches also understood the fact that a lot of diseases are caused because of bacteria. So, the researches felt that in order to cure bacterial diseases we have to study the bacteria to know how they function and what are their preventions.

This was a huge shift in the field of pharmacy, earlier people were trying medicine in trial and error basis which we consider inhumane today. After people started to study the diseases and the bacteria causing these diseases, the trial and error methods started fading away. Researches today created medicines for almost all bacterial diseases.

But in history, there were a lot of instances where people would die from cold and fever due to a lack of proper treatment and health care facilities. Sciences took over the responsibility of treating the people with proper methods and application procedures of pharmaceuticals. Earlier, people had no knowledge of the dosages that one has to take to avoid other side effects of the medicine. Today, we know how every medicine will work according to the age group and medical history of the patient. 

One of the best know antibiotics in the history of mankind is known as Penicillin. It was discovered by Sir Alexander Fleming in 1928. It is not a myth that more than 75% of today's population must thank penicillin. Without it, a majority of our parents and grandparents would get infections and the population would have never reached the numbers which it has reached right now. Penicillin is an antibiotic that cures humans of a wide range of diseases. This was the pharmacy's single answer to many questions and cures. 

The pharmacy also deals with various synthetic chemicals, that can be used as painkillers and disease curing drugs. These drugs are manufactured using various chemicals mixing them with herbal extracts. These combinations are done based on individual chemical behaviors on humans. Until now we have exclusively discussed the history of pharmacy of the entire world. Let us now look into the history of pharmacy in India.</p>
	</div>
	</div>

	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css"> 
			
	</body>
</html>