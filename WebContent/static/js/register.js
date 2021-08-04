$(document).ready(function(){
    console.log("From Register");
    /*$("#phoneNo").CcPicker({
      "countryCode":"IN",
      dataUrl: "/static/ccpicker/data.json"
    });*/
    $('#dob').datepicker({
      format: 'dd/mm/yyyy',
      todayHighlight: true
    });
  }); 
function doRegistration(){ 
	f_name=$("#fName").val();
	l_name=$("#lName").val();
	gender=$("#gender").val();
	dob=$("#dob").val();
	address=$("#address").val();
	state=$("#state").val();
	pinNo=$("#pinNo").val();
	phoneNo=$("#phoneNo").val();
	emerPhoneNo=$("#emerPhoneNo").val();
	email=$("#email").val();
	userAcces=$("#userAcces").val();
    password=$("#password").val();
    cnfrmPassword=$("#cnfrmPassword").val();
    if(password!=cnfrmPassword){
    	toastr.error("You must enter same Password again....");
      return false;
    }
    var data={};
    data['f_name']=f_name;
    data['l_name']=l_name;
    data['gender']=gender;
    data['dob']=dob;
    data['address']=address;
    data['state']=state;
    data['pinNo']=pinNo;
    data['phoneNo']=phoneNo;
    data['emerPhoneNo']=emerPhoneNo;
    data['email']=email;
    data['userAcces']=userAcces;
    data['password']=password;
    console.log(data);
    $.ajax({
        type: "POST",
        url: "http://127.0.0.1:8080/PharmaSYS/doRegistration",
        data: data,
        dataType: "json",
        success: function (result) {
            console.log(result['response']);
            if(result['response'] == "success"){
            	toastr.success("Registration Succesful");
            }else{
            	toastr.error("Registration Failed");
            }     
        },
        error: function (result) {
        	toastr.error("System Failure.");
            console.log(result);
        }
    });
    return false;
  }