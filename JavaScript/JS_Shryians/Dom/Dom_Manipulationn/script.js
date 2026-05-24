//  TO ADD CLASS IN HTML TAG THROUGH 
let h1 = document.querySelector('h1');
h1.classList.add("hulu"); // IT WRITES THE CLASS NAME IS HULU;


// IT BYDEFAULT CLASS WAS THERE IN HTML TAG THEN YOU WANT TO REMOVE THEN 
h1.classList.remove('hulu');

// TOGGLE DOING THAT IF CLASS WAS THERE THEN IT REMOVE AND IF NOT THERE ITS ADD:
h1.classList.toggle('hulu');



let lis = document.querySelectorAll('li');
lis.forEach(function (val) {
    console.log(val.textContent);
    
})

// or can be written as
for(let i = 0; i < lis.length; i++) {
    console.log(lis[i].textContent);
    
}