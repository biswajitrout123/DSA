// var

// if(true){
//    var a = 5;
// }
// console.log(a); // 5 (accessible outside block)




// let

// if(true){
//    let a = 5;
// }
// console.log(a); // ❌ error



// const

// const obj = { name: "Biswa" };
// obj.name = "JS";  // ✅ allowed
// obj = {}; ❌ error




//-----------------------------------------
let u = 10;
u = 20;   // ✅ Reassignment
//----------------------------------

let w = 10;
let w = 20;   // ❌ Redeclaration (Error)
