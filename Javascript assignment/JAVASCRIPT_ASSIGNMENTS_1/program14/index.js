var el_up = document.getElementById("GFG_UP");
var el_down = document.getElementById("GFG_DOWN");
el_up.innerHTML = 
  "Click on the button to generate the array.";

function gfg_Run() {
    el_down.innerHTML = Array.from({
        length: 100
    }, () => Math.floor(Math.random() * 10));
}