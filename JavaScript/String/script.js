// Write a program to find the index of a character in a string.

// let str = "helloGit";
// let search = "G";
// let index = -1;
// for(let i = 0; i < str.length; i++) {
//     if(str[i] == search) {
//         index = i;
//         break;
//     }
// }
// if(index !== -1) {
//     console.log("found at: " + index);
// }
// else{
//     console.log("Not found");
// }



// Write a program to replace a word in a string.
// let str = "hello JavaScript";
// let oldNum = "Script";
// let newNum = "Biswa";
// let result = str.replace(oldNum, newNum);
// console.log(result);

// Write a program to remove spaces from a string.
// let str = "Hello I am Practicing JavaScript";

// 1ST METHOD:
// let result = str.replaceAll(" ", "");
// console.log(result);

// 2ND METHOD: REMOVE SPACES FROM START AND END:
// let strr = "    Biswajit Rout Saying Hello To All    ";
// let result = strr.trim();
// console.log(result);


// Write a program to split a string into an array of words.
// let str = "Hello Github"; 
// let result = str.split(" ");
// console.log(result);


// Write a program to join an array of words into a string.
let words = ["I", "am", "learning", "JavaScript"];
let result = words.join(" ");

console.log(result);



// Write a program to count occurrences of a character in a string.
// let str = "javascript";
// let search = "c";
// let count = 0;
// for(let i = 0; i < str.length; i++) {
//     if(str[i] == search){
//         count++;
//     }
// }
// console.log(count);

// Write a program using template literals to print a sentence.
let name = "Biswajit";
let language = "JavaScript";
let level = "beginner";

let sentence = `My name is ${name}. I am learning ${language} as a ${level}.`;

console.log(sentence);


