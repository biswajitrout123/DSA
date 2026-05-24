// Write a program to select an element by ID and change its text.
let heading = document.querySelector("#root");
heading.innerText = "Hello";



// Write a program to select elements by class name and change their color.
let div = document.querySelector(".root");
div.style.color = "green";


// Write a program to select elements using querySelector.
let hello = document.querySelector("#div");




// Write a program to select all elements using querySelectorAll and loop through them.
let selectAllElements = document.querySelectorAll();




// Write a program to change the background color of a div using DOM.
let changeColor = document.querySelector("div");
changeColor.style.backgroundColor = "pink";



// Write a program to create a new element and add it to the page.
let createElement = document.createElement("p");
createElement.innerText = "Hey i am new element welcome me";
document.body.appendChild(createElement);



// Write a program to remove an element from the page.
let removeElement = document.querySelector("div");
removeElement.remove();



// Write a program to add a class to an element using classList.
let box = document.getElementById("box");
box.classList.add("highlight")



// Write a program to remove a class from an element using classList.
let head = document.getElementById("root");
head.classList.remove("hello");




// Write a program to toggle a class on button click.
box.classList.toggle("active");






// Write a program to change an image source using DOM.
function changeImage() {
    let img = document.getElementById("myImage");
    img.src = "image2.jpg";
}





// Write a program to get and set attributes of an element.
function changeImage() {
    // get attribute
    let img = document.getElementById("myImg");
    let oldSrc = img.getAttribute("src");
    console.log("Old src:", oldSrc);

    // set attribute
    img.setAttribute("src", "image2.jpg");
    img.setAttribute("alt", "New Image");
}






// Write a program to read input value from a text box and display it.

function showValue() {
    let value = document.getElementById("myInput").value;
    document.getElementById("output").innerText = value;
}




// Write a program to create a list dynamically using an array.
        let items = ["Apple", "Banana", "Mango", "Orange"];

        let ul = document.createElement("ul");

    items.forEach(item => {
            let li = document.createElement("li");
        li.innerText = item;
        ul.appendChild(li);
    });

    document.getElementById("listContainer").appendChild(ul);
    


// Write a program to change text content using innerText and innerHTML.
let divs = document.getElementById("div");
divs.innerText = "Hello"
divs.innerHTML = "<h1>Hello<h1>"


