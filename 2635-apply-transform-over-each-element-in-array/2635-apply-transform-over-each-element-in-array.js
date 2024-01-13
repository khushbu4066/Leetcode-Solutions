var map = function(arr, fn) {
    let newarr = []
    for(let i=0; i<arr.length; i++){
        newarr.push(fn(arr[i],i));
    }
    return newarr;
};
