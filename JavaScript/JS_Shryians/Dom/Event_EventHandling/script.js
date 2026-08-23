/* 
FOR MAKING THE CUSTOM FILE UPLOAD

let cusDiv = document.querySelector("#btn");
let impDile = document.querySelector("#fileinp");

cusDiv.addEventListener("click", function() {
    impDile.click();
});

impDile.addEventListener("change", function(e) {
    const file = e.target.files[0];

    if (file) {
        cusDiv.textContent = file.name;
    }

    // cusDiv.textContent = e.target.files[0].name;
});

*/


// FOR MAKING - WHEN THE BUTTON SUBMIT AND DISPLAY CARD

// TELL THE FORM TO NOT RELOAD
let form = document.querySelector("form");
let inputs = document.querySelectorAll("input");

form.addEventListener("submit", function (e) {

    e.preventDefault();


    // CREATE CARD
    let card = document.createElement("div");
    card.classList.add("card");


    // CREATE PROFILE
    let profile = document.createElement("div");
    profile.classList.add("profile");


    // CREATE IMAGE
    let img = document.createElement("img");

    img.setAttribute("src", inputs[0].value);


    // CREATE H3
    let h3 = document.createElement("h3");
    h3.textContent = inputs[1].value;


    // CREATE H5
    let h5 = document.createElement("h5");
    h5.textContent = inputs[2].value;


    // CREATE PARAGRAPH
    let p = document.createElement("p");
    p.textContent = inputs[3].value;


    // APPEND IMAGE INSIDE PROFILE
    profile.appendChild(img);


    // APPEND PROFILE INSIDE CARD
    card.appendChild(profile);


    // APPEND H3, H5 AND P INSIDE CARD
    card.appendChild(h3);
    card.appendChild(h5);
    card.appendChild(p);


    // APPEND CARD INSIDE MAIN
    main.appendChild(card);


    inputs.forEach(function (inp) {
        if (inp.type !== "submit") {
            inp.value = "";
        }
    })
});