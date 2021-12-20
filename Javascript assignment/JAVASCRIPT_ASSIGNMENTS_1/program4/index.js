function coinFlip() {
    return (Math.floor(Math.random() * 2) == 0) ? 'heads' : 'tails';
}

/**
 * To Get The Value
 */
 function run(){
    val = document.getElementById("val").value;
    document.getElementById("results").innerHTML=val+": "+coinFlip(val)
    }