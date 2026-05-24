//Q-1 // WHAT's the difference between function declaration and expression in terms of hoisting?

// ANS:
// FUNCTION DECLARATION CAN BE POSSIBLE BY HOISTIONG MEANS : THE FUNCTION CAN BE CALLED BEFORE THE FUNCTION
// BUT THE FUNCTION EXPRESSION NOT POSSIBLE BY HOSTING MANS :  THE FUNCTION CAN NOT BE CALLED BEFORE THE FUNCTION

// Q-2 CONVERT THIS INTO ARROW FUNCTION
/*
    function multiply(a, b) {
    return a * b;
    }
*/
// ANS:
// let multiply = (a, b) => {
//     return a * b;
// }

// Q-3 - OUTPUT
function sayHi(name = "Guest") {
    console.log("Hi", name);
}

sayHi();

// Q-4 WHAT DOES THE ... OPERATOR MEAN IN PARAMETER
function abcd(...val) {
    console.log(val); //ARRAY - [1, 2, 3, 4, 5, 6]
}
abcd(1, 2, 3, 4, 5, 6);  

// Q-5 -------------
function abcd(a, b, c, ...val) {
    console.log(a, b, c, val); //ARRAY - 1 2 3 [4, 5, 6]
}
abcd(1, 2, 3, 4, 5, 6);  


// Q-6 - USE REST PARAMETER TO ACCEPT ANY NUMBER OF SCORES AND RETURN THE TOTAL
function getScore(...scores) {
    console.log(scores);        // [10, 12, 14, 16, 18, 20]
    
}

getScore(10, 12, 14, 16, 18, 20);

// ------------
function getScore(...scores) {
    let total = 0;
    scores.forEach(function (val) {
        total = total + val;
    });

    return total;
}

console.log(getScore(10, 12, 14, 16, 18, 20));


function abcd() {
    return function() {
        console.log("HOF");
    };
}
abcd()()


// --------------------------  CLOSURES FUNCTIONS
function checkAge(age) {
    if(age < 18) return "Too Young";
    return "Allowed";
}

console.log(checkAge(10));


// --------------------------
function f() {
    return;
}
console.log(f());   //UNDEFINED


// ------------------------------------
// PASS A FUNCTION INTO ANOTHER FUNCTION AND EXECUTE IT INSIDE:
function abcd(val) {
    val()
}

abcd(function () {
    console.log("Hey i am inside another function");
})

// -------------------------------------------------------------
// HOF
// FUNCTION WHICH RETURN FUNCTION
function abcd() {
    return function() {

    }
}
// EXCEPT A FUNCTION AT PARAMETER
function abcd(val) {
    val();
}
abcd(function() {

})
// -----------------------------------------------------------

