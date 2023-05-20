var cnt = 5; 
var star = "";

for(i=0; i<cnt; i++){
    for(j=0; j<i; j++){
        star += '&nbsp';
    }
    for(k=0; k<=((cnt-(i+1))*2); k++){
        star += '*';
    }
    star += '<br>';
}

document.write(star);