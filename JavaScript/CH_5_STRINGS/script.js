// Write a program to replace a word in a string.
let str = "hello rout";
let newReplace = str.replace("hello" , "biswajit");
console.log(newReplace);

// Write a program to remove spaces from a string.
let strr = "  hell o  ";
let removeSpace = strr.replaceAll(" ", "");
console.log(removeSpace);



// Write a program to split a string into an array of words.
let str2 = "hello world";
let splitingWords = str2.split(" ");
console.log(splitingWords);


// Write a program to join an array of words into a string.
let arr = ["hello", "rout"];
let result = arr.join(" ");
console.log(result);



// Write a program to count occurrences of a character in a string.
let str5 = "hello";
let char = "l";
let count = 0;
for(let i = 0; i < str5.length; i++) {
    if(str5[i] === char){
        count++;
    }
}
console.log(count);

// Write a program using template literals to print a sentence. -->
let name = `name: ${"Happy"}, Age: ${50}`;
console.log(name);


