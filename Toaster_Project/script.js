const toast = document.querySelector("#toast");
const showToast = document.querySelector("#showToast");
const closeToast = document.querySelector("#closeToast");
const toastMessage = document.querySelector("#toastMessage");

let toastTimer;

function showNotification(message) {
    toastMessage.textContent = message;

    toast.classList.remove("hidden");
    toast.classList.add("flex");

    clearTimeout(toastTimer);

    toastTimer = setTimeout(() => {
        hideNotification();
    }, 3000);
}

function hideNotification() {
    toast.classList.add("hidden");
    toast.classList.remove("flex");
}

showToast.addEventListener("click", function () {
    showNotification("Your changes have been saved successfully!");
});

closeToast.addEventListener("click", function () {
    hideNotification();
});