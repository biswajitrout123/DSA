// (function() {
//     let hello = 50;
//     console.log(hello);
//     console.log("Hey");
    
    
// })();

// Debouncing

function debounce(fn, delay) {

    let timer;

    return function () {

        clearTimeout(timer);

        timer = setTimeout(() => {
            fn();
        }, delay);

    };
}


function search() {

    console.log("API call");

}

const debouncedSearch = debounce(search, 500);

document.querySelector("#search").addEventListener(
    "input",
    debouncedSearch
);