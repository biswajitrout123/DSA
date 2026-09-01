// const URL = "https://jsonplaceholder.typicode.com/posts/1";

// let promise = fetch(URL);
// console.log(promise);





const URL = "https://jsonplaceholder.typicode.com/posts/1";

// let promise = fetch(URL);
// console.log(promise);
// promise.then((response) => {
//     console.log(response);
// });

const getFacts = async () => {
    console.log("getting data .....");
    let response = await fetch(URL);
    console.log(response);
    let data = await response.json();
    console.log(data);
}