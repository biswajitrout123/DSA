let promise = new Promise((resolve, reject) => {
    resolve("success");
});

promise.then(result => {
    console.log(result);
});


// Promise states
// PENDING - FULLFILED - REJECTED


// let promise = new Promise((resolve, reject) => {
//     resolve("Success");
// });

// promise.then(result => {
//     console.log(result);
// });




// PROMISE CHAINING
promise
    .then(result => {
        return result;
    })
    .then(result => {
        console.log(result);
    })
    .catch(error => {
        console.log(error);
    });