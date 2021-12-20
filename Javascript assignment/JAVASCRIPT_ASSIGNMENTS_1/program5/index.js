Date.prototype.getDOY = function() 
{ 
    var onejan = new Date(this.getFullYear(),0,1);
    return Math.ceil((this - onejan) / 86400000);
}

function list20LeapYears() {
    var nd, ld, ly = [], yr = document.getElementById('beginYear').value*1;
      while (ly.length < 20) 
      {
        nd = new Date(yr,11,31);
        ld = nd.getDOY();
        if (ld == 365) 
        { 
            ly.push(yr); 
        } 
        yr++;
      }
      document.getElementById('debug').innerHTML = ly.join('<br>')+'<hr>';
    }
    