// let abcd = document.querySelector("#abcd");
// abcd.addEventListener("mouseover", function() {
//     abcd.style.backgroundColor = "yellow";
// })
// abcd.addEventListener("mouseout", function() {
//     abcd.style.backgroundColor = "pink";
// })




// MOUSE DIV WITH MOUSE

let abcd = document.querySelector("#abcd");




window.addEventListener("mousemove", function(e) {
    abcd.style.top = e.clientY + "px";
    abcd.style.left = e.clientX + "px"
    console.log(e.clientX, e.clientY);
    

})