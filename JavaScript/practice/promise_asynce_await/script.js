// PROMISE
function getData() {
    return new Promise((resolve, reject) => {
        resolve("Data received");
    });
}

getData().then(data => console.log(data))
.catch(error => console.log(error))



// ASYNC AWAIT
async function getData() {
    try{
        let data = await Promise.resolve("Data received");
        console.log(data);

    }catch(err) {
        console.log(err);
    }
}

getData();