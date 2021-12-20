/**
 * Sum OF Multiples For 3 and %
 * @param {*} number 
 * @returns 
 */
function sumOfMultiples(number) {
    let sum = 0;
    for(let i = 1; i < number; i++){
       if(i % 3 === 0 || i % 5 === 0){
        sum += i;
       }
    }   
    return sum;
 }


 /**
 * To Get The Value
 */
function run(){
    val = document.getElementById("val").value;
    document.getElementById("results").innerHTML=val+": "+sumOfMultiples(val)
    }