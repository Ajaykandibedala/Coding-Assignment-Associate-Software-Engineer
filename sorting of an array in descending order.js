let n = [2,4,6,7,8,3,5,9,10,11,1];
n.sort(function(a, b) {
return b - a;
});
console.log("Sorted Array in Descending Order:", n);

// Output:Sorted Array in Descending Order: [11,10,9,8,7,6,5,4,3,2,1]