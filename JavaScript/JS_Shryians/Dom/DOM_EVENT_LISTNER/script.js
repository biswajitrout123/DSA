// let input = document.querySelector('input');
// input.addEventListener('input', function(evt){
//     if(evt.data !== null) {
//         console.log(evt.data);
//     }

// })



let sel = document.querySelector('select');

let device = document.querySelector('#device');

sel.addEventListener('change', function(evt) {
    // device.textContent = "Dvice"
    device.textContent = `${evt.target.value} is Selected`
})

