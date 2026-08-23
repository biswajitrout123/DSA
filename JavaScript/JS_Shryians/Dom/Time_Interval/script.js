/*

let oneTimeRun = setTimeout(function() {
    console.log("Run for once");
    
}, 2000);

clearTimeout(oneTimeRun);// NOTHING WILL DISPLAY


let continuoslyRun = setInterval(function() {
    console.log("RUN CONTINUOSLY");
}, 2000);

clearInterval(continuoslyRun);//NOTHING WILL DISPLAY


let count = 10;
let interval = setInterval(function() {
    if(count >= 1) {
        console.log(count);
        count--;
    }
    else {
        clearInterval(interval);
    }
}, 1000);

*/


let downloadBox = document.querySelector(".download-box");
let title = document.querySelector(".download-box h3");
let progressBar = document.querySelector(".progress-bar");
let percentage = document.querySelector(".percentage");

let count = 0;

let interval = setInterval(function () {

    count++;

    percentage.textContent = count;
    progressBar.style.width = count + "%";

    if (count >= 100) {
        clearInterval(interval);

        title.textContent = "Downloaded";
    }

}, 50);