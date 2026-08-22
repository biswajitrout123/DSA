// console.log(x === undefined); // true
// var x = 3;

// (function () {
//   console.log(x); // undefined
//   var x = "local value";
// })();

// -------------------------------------------------------------
// console.log(x); // ReferenceError
// const x = 3;

// console.log(y); // ReferenceError
// let y = 3;

// -------------------------------------------------------------
let answer = 42;
answer = "Thanks for all the fish!";
console.log(answer);


// --------------------------------------------------------------
let a = "37" - 7; // 30
let b = "37" * 7; // 259

// --------------------------------------------------------------

let c = parseInt("101", 2); // 5
console.log(c);



let num = [10, 20, 30, 40, 50, 60];
num.forEach(function(num) {
    console.log(num);    
})


let ul = document.querySelector("ul");
let li = document.createElement("li");
li.textContent = " hello" ;

ul.appendChild(li);


let h1 = document.querySelector("h1");
h1.addEventListener("click", function() {
    h1.style.color = "red";
})

let p = document.querySelector("p");
p.addEventListener("mouseover", function() {
    p.style.backgroundColor = "pink";
})

let button = document.querySelector("button");
button.addEventListener("dblclick", function() {
    button.style.color = "purple";
})

