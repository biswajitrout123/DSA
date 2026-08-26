let products = document.querySelector("#products");

fetch("https://dummyjson.com/products")
    .then((response) => {
        return response.json();
    })
    .then((data) => {

        data.products.forEach((product) => {

            products.innerHTML += `
                <div>
                    <h2>${product.title}</h2>
                    <p>Price: $${product.price}</p>
                    <img src="${product.thumbnail}" width="150">
                </div>
            `;

        });

    })
    .catch((error) => {
        console.log("Error:", error);
    });