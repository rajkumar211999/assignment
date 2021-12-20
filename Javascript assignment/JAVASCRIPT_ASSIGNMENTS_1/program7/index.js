var usd,inr,yen,euro,pound;

function init()
{
    usd = document.getElementById("USD");
    inr = document.getElementById("INR");
    yen = document.getElementById("YEN");
    euro = document.getElementById("EURO");
    pound = document.getElementById("POUND");
}

function usdfunc()
{
    inr.value = parseFloat(usd.value) * 76.01;
    yen.value = parseFloat(usd.value) * 113.68;
    euro.value = parseFloat(usd.value) * 0.89;
    pound.value = parseFloat(usd.value) * 0.75;
}

init();