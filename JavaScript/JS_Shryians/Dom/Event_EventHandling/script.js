let cusDiv = document.querySelector("#btn");
let impDile = document.querySelector("#fileinp");

cusDiv.addEventListener("click", function() {
    impDile.click();
})

impDile.addEventListener("change", function(e) {
    const file = e.target.files[0];
    if(file) {
        cusDiv.textContent = file.name;
    }
    // cusDiv.textContent = e.target.files[0].name;
})