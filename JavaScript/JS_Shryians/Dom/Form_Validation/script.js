let email = document.querySelector("#email");
let password = document.querySelector("#password");

let form = document.querySelector("#form");

let emailError = document.querySelector("#emailError");
let passwordError = document.querySelector("#passwordError");

let success = document.querySelector("#success");


form.addEventListener("submit", function (e) {

    e.preventDefault();


    // EMAIL REGEX
    const emailRegex =
        /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;


    // PASSWORD REGEX
    // Minimum 8 characters
    // At least one lowercase
    // At least one uppercase
    // At least one number
    // At least one special character

    const passwordRegex =
        /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;


    // CHECK EMAIL
    let emailans = emailRegex.test(email.value);


    // CHECK PASSWORD
    let passwordans = passwordRegex.test(password.value);


    // EMAIL VALIDATION
    if (!emailans) {

        emailError.textContent = "Email is incorrect";
        emailError.style.display = "block";

    } else {

        emailError.style.display = "none";

    }


    // PASSWORD VALIDATION
    if (!passwordans) {

        passwordError.textContent = "Password must contain 8+ characters, uppercase, lowercase, number and special character";
        passwordError.style.display = "block";

    } else {

        passwordError.style.display = "none";

    }


    // SUCCESS
    if (emailans && passwordans) {

        success.style.display = "block";

    } else {

        success.style.display = "none";

    }

});