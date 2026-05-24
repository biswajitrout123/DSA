// let h1 = document.querySelector("h1");

// window.addEventListener("keydown", function (dets) {
//     // console.log(dets.key);
    
//     // h1.textContent = dets.key;

//     if(dets.key === " ") {
//         h1.textContent = "SPC";
//     }
//     else {
//         h1.textContent = dets.key;
//     }

// });



let btn = document.querySelector("#btn");
let fileinp = document.querySelector("#fileinp");

btn.addEventListener("click", function() {
    fileinp.click();
})

fileinp.addEventListener("change", function(dets) {
    // console.log(dets.target.files[0].name);

    // if(dets.target.files) {
    //     btn.textContent = dets.target.files[0].name;
    // }


    const file = dets.target.files[0];
    if(file) {
        btn.textContent = file.name;
    }
    
})


