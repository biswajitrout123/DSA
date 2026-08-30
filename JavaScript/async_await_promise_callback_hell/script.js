// PROMISE

// const getPromise = () => {
//     return new Promise((resolve, reject) => {
//         console.log("I am a promise");
//         // resolve("success");
//         reject("error");
//     });
// };
// let promise = getPromise();
// promise.then((res) => {
//     console.log("Promise Fullfilled", res);
// })

// promise.catch((err) => {
//     console.log("rejected", err);
// })

// --------------------------------------------------------------------------------

// PROMISE CHAIN
// function asyncFun1(params) {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       console.log("data1");
//       resolve("success");
//     }, 4000);
//   });
// }
// function asyncFun2(params) {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       console.log("data2");
//       resolve("success");
//     }, 4000);
//   });
// }

// console.log("Fetching data1....");
// asyncFun1().then((res) => {
//   console.log("Fetching data2....");
//   asyncFun2().then((res) => {});
// });

// ---------------------------------------------------------------

// function getData(dataId, getNextData) {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       console.log("data", dataId);
//       resolve("success");
//       if (getNextData) {
//         getNextData();
//       }
//     }, 2000);
//   });
// }

// callback hell
// getData(1, () => {
//     console.log("getting data2 ....");
//     getData(2, () => {
//         console.log("getting data3 ....");
//         getData(3, () => {
//             console.log("getting data4 ....");
//             getData(4);
//         });
//     });
// });

// PROMISE CHAIN
// console.log("getting data1 ....");
// getData(1).then((res) => {
//   console.log("getting data2 ....");
//   return getData(2);
// }).then((res) => {
//   console.log("getting data3 ....");
//   return getData(3);
// }).then((res) => {
//   console.log(res);
// })

// ASYNC FUNCTION
async function hello(params) {
  console.log("hello");
}

function getData(dataId) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("data", dataId);
      resolve("success");
    }, 2000);
  });
}
// Async-await
async function getAllData() {
  console.log("getting data1.....");
  await getData(1);

  console.log("getting data2.....");
  await getData(2);

  console.log("getting data3.....");
  await getData(3);

  console.log("getting data4.....");
  await getData(4);

  console.log("getting data5.....");
  await getData(5);
}
