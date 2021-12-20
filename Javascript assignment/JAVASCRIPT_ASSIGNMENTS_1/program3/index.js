/**
 * Find Whether The Number is Even Or Odd
 * @param {*} num 
 * @returns 
 */
function solution(num) {
    return num % 2 === 0 ? 'Even' : 'Odd'
}


/**
 * To Get The Value
 */
 function run(){
    val = document.getElementById("val").value;
    document.getElementById("results").innerHTML=val+": "+solution(val)
    }