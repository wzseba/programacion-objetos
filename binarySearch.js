const binarySearch = (arr, n, result = []) => {
  if (!arr.length) return "Value not found";

  //   let middleIndex = Math.floor(arr.length / 2) - (arr.length % 2 ? 0 : 1);
  let middleIndex = Math.floor(arr.length / 2) - Number(!(arr.length % 2));

  result.push(arr[middleIndex]);

  if (arr[middleIndex] == n) return result;

  return n < arr[middleIndex]
    ? binarySearch(arr.slice(0, middleIndex), n, result)
    : binarySearch(arr.slice(middleIndex + 1), n, result);
};

const testArray = [
  0, 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
  23, 49, 70,
];

console.log(binarySearch(testArray, 0)); // [13, 5, 2, 0]

console.log(binarySearch(testArray, 1)); // [13, 5, 2, 0, 1]

console.log(binarySearch(testArray, 70)); // [13, 19, 22, 49, 70]

console.log(binarySearch(testArray, 6)); // Value Not Found
