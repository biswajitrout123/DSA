// ternary operator
// let score = 75;

// let grade = score >= 90 ? "A" : score >= 75 ? "B" : score >= 60 ? "C" : "fail";

// console.log(grade);

// Q-1
// function getGrade(score) {
//     if (score >= 0 && score <= 32) {
//         console.log("Fail");
//     }
//     else if (score >= 33 && score <= 59) {
//         console.log("D");
//     }
//     else if (score >= 60 && score <= 69) {
//         console.log("C");
//     }
//     else if (score >= 70 && score <= 79) {
//         console.log("B");
//     }
//     else if (score >= 80 && score <= 90) {
//         console.log("A");
//     }
//     else if (score >= 90 && score <= 100) {
//         return 'A+'
//     }
//     else {
//         console.log("NOT MATCH");
//     }
// }
// console.log((getGrade(99)));

// -----------------------------------------------------------
// HOF- HIGH ORDER FUNCTION
// 1️⃣ Function Taking Another Function as Argument

function greet(name, callback) {
    console.log("Hello " + name);
    callback();
}

function sayBye() {
    console.log("Goodbye!");
}

greet("Biswajit", sayBye);  

// --------------------------------------

// 2️⃣ Function Returning Another Function
function multiplyBy(x) {
    return function(y) {
        return x * y;
    };
}

let double = multiplyBy(2);

console.log(double(5));

// -------------------------------------------


// IIFE - Immediately Invoked Function Expression
(function() {
    console.log("i am IIFE");
})();


// -------------------------------------------------------

abcd();
abcde();
// HOISTING
function abcd() {
    console.log("I am the function which call first : this is called Hoisting");
    
}
// ----------------------------
// BUT THIS IS NOT WORK ON FUNCTION EXPRESSION
let abcde = function() {
    console.log("HOISTING is not work on function expression");   //SHOE ERROR
    
}

// -----------------------------------------------------------------------------------

let a = 100;
function huii() {
    a++;
}
huii();
console.log(a);
