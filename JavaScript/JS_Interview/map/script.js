// MAP

const nums = [1, 2, 3, 4];

const result = nums.map((num) => {
    return num * 2;
});

console.log(result);



// FILTER

const nums1 = [1, 2, 3, 4];
const moreThanTwo = nums.filter((num) => {
    return num > 2;
});
console.log(moreThanTwo);


// REDUCE
const nums2 = [1, 2, 3, 4];

const sum = nums2.reduce((acc, num) => {
    return acc + num;
}, 0);

console.log(sum);