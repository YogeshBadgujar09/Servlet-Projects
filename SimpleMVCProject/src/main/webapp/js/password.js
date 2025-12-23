/**
 * 
 */


/**
 function matchPassword(){
	 
	 var pass = document.getElementsByName("txtPassword")[0].value
	 var confirmPass = document.getElementsByName("txtConfirmPassword")[0].value
	 
	 console.log(pass + " " + confirmPass);
	 
	 console.log("Hello");
	 
 }*/
 
 function matchPassword() {
    var pass = document.getElementsByName("txtPassword")[0].value;
    var confirmPass = document.getElementsByName("txtConfirmPassword")[0].value;

    console.log(pass, confirmPass);

    if (pass !== confirmPass) {
        alert("Passwords do not match");
        return false;   // stop submit
    }

    return true;        // allow submit
}
