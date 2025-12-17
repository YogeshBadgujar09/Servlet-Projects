/**
 * 
 */

 function confirmPasswordMatch(){
	 
	 var password = document.getElementsByName("txtPassword")[0].value
	 var confirmPassword = document.getElementsByName("txtConfirmPassword")[0].value
	 
	 console.log(password + " " + confirmPassword);
	 
	 if (password === confirmPassword) {
       // console.log("Password matched");
        return true;   // allow form submit
    } else {
     	alert("Confirm Password Not match")
        //console.log("Password not matched");
        return false;  // stop form submit
    }
	 
 }