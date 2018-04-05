package CodingTestList;

/** sk
* Created by changwooj111@gmail.com on 2018. 2. 12.
* Blog : http://woo-repository.tistory.com/
* Github : https://github.com/changwoojang
*/
// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(S) {
// write your code in JavaScript (Node.js 8.9.4)

    var input = S.split("\n");
    var phoneMap = new Map();

    for(i=0; i < input.length; i++){
        var log = input[i].split(",");
        var temp = log[0];
        var totalSecond = temp.split(":");
        var second = 0;
        second = totalSecond[0]*360 + totalSecond[1]*60 + totalSecond[2]*1;
        if(phoneMap.has(log[1])){
            phoneMap.set(log[1],second+phoneMap.get(log[1]));
        }else{
            phoneMap.set(log[1],second);
        }
}

    var result;
    var cents;

    phoneMap.forEach(function(value,key){
        result = cents;
        if(value <= 300){
            cents = value * 3;
        }else if(value > 300){
            cents = Math.floor(value/60) * 150;
        }
    if(result < cents){
        result =cents;
    }
        phoneMap.set(key,cents);
    });

    return result;
}


// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(A) {
    // write your code in JavaScript (Node.js 8.9.4)
    var headCount=0;
    var tailCount=0;
    for(i=0; i<A.length;i++){
        if(A[i] == 0){
            headCount++
        }else{
            tailCount++
        }
    }
    if(headCount>tailCount){
        return tailCount;
    }
}
