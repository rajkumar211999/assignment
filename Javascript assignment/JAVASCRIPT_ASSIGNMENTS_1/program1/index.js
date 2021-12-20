/**
 * Function For Sum 1 To N
 * @param {} N 
 * @returns 
 */
function printNum(N) {
  var total = 0;
    for(var i = 1; i <= N; i++){
      total += i;
    }
    return total;
}

/**
 * To Get The Value
 */
function run(){
  val = document.getElementById("val").value;
  document.getElementById("results").innerHTML=val+": "+printNum(val)
  }
