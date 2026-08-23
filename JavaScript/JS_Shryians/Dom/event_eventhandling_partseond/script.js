// let abcd = document.querySelector("#abcd");
// abcd.addEventListener("mouseover", function() {
//     abcd.style.backgroundColor = "yellow";
// })
// abcd.addEventListener("mouseout", function() {
//     abcd.style.backgroundColor = "pink";
// })




// MOUSE DIV WITH MOUSE

/*
let abcd = document.querySelector("#abcd");




window.addEventListener("mousemove", function(e) {
    abcd.style.top = e.clientY + "px";
    abcd.style.left = e.clientX + "px"
    console.log(e.clientX, e.clientY);
    

})
*/



// -----------------------------------
// let ul = document.querySelector("ul");

// ul.addEventListener("click", function(e) {
//     e.target.classList.toggle("lt");

// })


// ------------------------------
let input = document.querySelector("input");
let span = document.querySelector("span");

input.addEventListener("input", function (e) {
    // span.textContent = input.value.length;

    let left = 20 - input.value.length;
    span.textContent = left;

    if (left < 0) {
        span.style.color = "red";
    } else {
        span.style.color = "purple";
    }
})