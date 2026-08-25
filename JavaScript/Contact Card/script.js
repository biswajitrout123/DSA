let addNote = document.querySelector("#add-note");

let formContainer = document.querySelector(".form-container");

let closeForm = document.querySelector(".closeForm");

let closeButton = document.querySelector(".close-btn");

const form = document.querySelector("form");

const cardsContainer = document.querySelector("#cards-container");


/* Inputs */

const imageUrlInput = form.querySelector(
    "input[placeholder='https://example.com/photo.jpg']"
);

const fullNameInput = form.querySelector(
    "input[placeholder='Enter full name']"
);

const homeTownInput = form.querySelector(
    "input[placeholder='Enter home town']"
);

const purposeInput = form.querySelector(
    "input[placeholder='e.g., Quick appointment note']"
);

const categoryRadios = form.querySelectorAll(
    "input[name='category']"
);


/* Open Form */

addNote.addEventListener("click", function () {

    formContainer.style.display = "flex";

});


/* Close Form */

closeForm.addEventListener("click", function () {

    formContainer.style.display = "none";

});


closeButton.addEventListener("click", function () {

    formContainer.style.display = "none";

});


/* Form Submit */

form.addEventListener("submit", function (event) {

    event.preventDefault();


    /* Get Values */

    let imageUrl = imageUrlInput.value.trim();

    let fullName = fullNameInput.value.trim();

    let homeTown = homeTownInput.value.trim();

    let purpose = purposeInput.value.trim();


    /* Find Selected Category */

    let selectedCategory = "";

    categoryRadios.forEach(function (radio) {

        if (radio.checked) {

            selectedCategory = radio.value;

        }

    });


    /* Validation */

    if (
        imageUrl === "" ||
        fullName === "" ||
        homeTown === "" ||
        purpose === "" ||
        selectedCategory === ""
    ) {

        alert("Please fill all the fields.");

        return;

    }


    /* Create Card */

    let card = document.createElement("div");

    card.classList.add("card");


    card.innerHTML = `

        <div class="profile">

            <img
                src="${imageUrl}"
                alt="Profile"
            >

            <h2>${fullName}</h2>

        </div>


        <div class="info">

            <div class="info-row">

                <span>Home Town</span>

                <span>${homeTown}</span>

            </div>


            <div class="info-row">

                <span>Category</span>

                <span>${selectedCategory}</span>

            </div>

        </div>


        <div class="purpose">

            ${purpose}

        </div>


        <div class="card-buttons">

            <button class="call-btn">

                ☎ Call

            </button>


            <button class="message-btn">

                Message

            </button>

        </div>


        <button class="delete-btn">

            Delete

        </button>

    `;


    /* Add Card */

    cardsContainer.appendChild(card);


    /* Delete Card */

    let deleteButton = card.querySelector(".delete-btn");


    deleteButton.addEventListener("click", function () {

        card.remove();

    });


    /* Reset Form */

    form.reset();


    /* Close Form */

    formContainer.style.display = "none";

});
