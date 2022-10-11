let photos = [];
photos[0] = '<img src="./images/miniproj/ghost1.gif" width = "60">';
photos[1] = '<img src="./images/miniproj/ghost2.gif" width = "60">';
photos[2] = '<img src="./images/miniproj/ghost3.gif" width = "60">';
photos[3] = '';
photos[4] = '<img src="./images/miniproj/pac-man.gif" width = "60">';

function start(){
    // alert(photos[0]);
    for(let i=0; i<photos.length; i++) {
        document.write("<div id='area" + i + "' style='position: absolute; top:0; left:" + i*90 + "px'>");
        document.write(photos[i]);
        document.write("</div>");
    }
    
    setTimeout(scroll, 1500);
}; // start() end

function scroll(){
    for(let i=0; i<photos.length; i++){
        let tmp = document.getElementById("area"+i).style;
        tmp.left = parseInt(tmp.left) + 10 + "px";

        if(parseInt(tmp.left)>=500){
            tmp.left = (photos.length-1) + "px"
        }
    }

    timer2 = setTimeout(scroll, 200);

} // scroll() end

let timer2;

function ktime(){
    clearTimeout(timer2);
} // ktime() end