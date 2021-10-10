var img = null;
var imgGray =  null;
var imgRed = null;
var imgBnW = null;
var imgRainbow = null;
var imgBlur = null;
function UploadImage()
{
  var x = document.getElementById("c1");
  var y = document.getElementById("fileOne");
  img = new SimpleImage(y);
  imgGray = new SimpleImage(y);
  imgRed = new SimpleImage(y);
  imgBnW = new SimpleImage(y);
  imgRainbow = new SimpleImage(y);
  img.drawTo(x);
}
function checkImage()
{
   if (img==null || ! img.complete())
   {
    alert("Image not loaded");
    return;
   }
}
function makeGray()
{
  checkImage(imgGray);
 
    for(var pix of imgGray.values())
    {
        var x = (pix.getBlue() + pix.getRed() + pix.getGreen() )/ 3;
        pix.setBlue(x);
        pix.setGreen(x);
        pix.setRed(x);
    }
  var imgCanvas = document.getElementById("c1");
  imgGray.drawTo(imgCanvas);
}
function makeRed()
{
    checkImage(imgRed);
    for(var pix of imgRed.values())
    {
      var x = (pix.getRed() + pix.getBlue() + pix.getGreen()) / 3;
      if(x < 128)
      {
          var xx = x*2;
          pix.setRed(xx);
          pix.setGreen(0);
          pix.setBlue(0);
      }
      else 
      {
          pix.setRed(255);
          pix.setGreen(xx - 255);
          pix.setBlue(xx - 255);
      }
    }
    var imgCanvas = document.getElementById("c1");
    imgRed.drawTo(imgCanvas);
  }
  function makeBlackWhite()
  {
    checkImage(imgBnW);
    for(var pix of imgBnW.values())
    {
      var x = pix.getRed();
      var y = pix.getBlue() ;
      var z = pix.getGreen();
      
      if(x >= 127.5 && y<= 127.5 && z<=127.5)
      {
        pix.setRed(255);
        pix.setBlue(255);
        pix.setGreen(255);      
      }
      else
      {
        pix.setRed(0);
        pix.setBlue(0);
        pix.setGreen(0);
      }
    }
    var imgCanvas = document.getElementById("c1");
    imgBnW.drawTo(imgCanvas);
  }

  function resetImage()
  {
    if(img.complete)
    {
      var x = document.getElementById("c1");
      img.drawTo(x);
    }
  }

  function makeRainbow()
  {
    checkImage(imgRainbow);
    for(var pix of imgRainbow.values())
    {
      var avg = (pix.getRed() + pix.getBlue() + pix.getGreen())/3;
      if(pix.getY() <= imgRainbow.getHeight()/7)
      { 
   	    if(avg < 128)
        {        
          pix.setRed(2*avg);       
          pix.setBlue(0);      
          pix.setGreen(0);
        }
        if(avg >= 128 )
        {         
          pix.setRed(255); 
          pix.setGreen((1.2*avg)-51); 
          pix.setBlue((2*avg) - 255);   
        } 
      }   
      if (pix.getY() > imgRainbow.getHeight()/7 && pix.getY() <= imgRainbow.getHeight() /3.5)
      {
        if(avg < 128)
        {    
          pix.setRed(2*avg);  
          pix.setGreen(0.8*avg);    
          pix.setBlue(0);      
        }      
        if(avg >= 128)
        {    
          pix.setRed(255);  
          pix.setGreen((1.2*avg)-51);  
          pix.setBlue((2*avg)-255);     
        }
      } 
    if(pix.getY() > imgRainbow.getHeight()/3.5 && pix.getY() <= imgRainbow.getHeight() /2.33)
    {
      if(avg < 128)
      {      
        pix.setRed(2*avg);      
        pix.setGreen(2*avg);     
        pix.setBlue(0);       
      }       
      if(avg >= 128)
      { 
         pix.setRed(255);
         pix.setGreen(255);
        pix.setBlue((2*avg)-255);  
      }
    }  
  if(pix.getY() > imgRainbow.getHeight()/2.33 && pix.getY() <= imgRainbow.getHeight() /1.75)
  { 
      if(avg < 128)
      {     
        pix.setRed(0);    
        pix.setGreen(2*avg);
        pix.setBlue(0);   
   }   
    if(avg >= 128){        
    pix.setRed((2*avg)-255);
         pix.setGreen(255); 
       pix.setBlue((2*avg)-255); 
    } 
   }  
  if(pix.getY() > imgRainbow.getHeight()/1.75 && pix.getY() <= imgRainbow.getHeight() /1.4)
  {  
     if(avg < 128)
     {     
        pix.setRed(0);      
        pix.setGreen(0);     
        pix.setBlue(2*avg);   
     }   
    if(avg >= 128)
    {     
       pix.setRed((2*avg)-255);      
      pix.setGreen((2*avg)-255);      
       pix.setBlue(255);       
    }   
 }  
  if(pix.getY() > imgRainbow.getHeight()/1.4 && pix.getY() <= imgRainbow.getHeight() /1.166){   
     if(avg < 128){     
        pix.setRed(0.8*avg);       
      pix.setGreen(0);       
      pix.setBlue(2*avg);    
      }     
    if(avg >= 128){    
        pix.setRed((1.2*avg)-51);     
       pix.setGreen((2*avg)-255);    
       pix.setBlue(255);     
    }
}   
 if(pix.getY() > imgRainbow.getHeight()/1.166 && pix.getY() <= imgRainbow.getHeight()){   
       if(avg < 128){       
    pix.setRed(1.6*avg);     
       pix.setGreen(0);      
      pix.setBlue(1.6*avg);    
     }   
     if(avg >= 128){   
       pix.setRed((0.4*avg) +153);     
       pix.setGreen((2*avg)-255);    
      pix.setBlue((0.4*avg) +153);    
    } 
 }
}
  var imgCanvas = document.getElementById("c1");
  imgRainbow.drawTo(imgCanvas);
}

    function makeBlur()
    {
        checkImage(imgBlur);
        var Blur = new SimpleImage(imgBlur.getWidth(), imgBlur.getHeight());
        for (var pixel of imgBlur.values()) {
            var x = pixel.getX();
            var y = pixel.getY();
            var newX = x + (Math.floor(Math.random() * 10));
            var newY = y + (Math.floor(Math.random() * 10));
    
            if ((newX > imgBlur.getWidth() -1) || (newY > imgBlur.getHeight() -1 )){
                newX = x;
                newY = y;
            }
            else if ((newX < 0) || (newY < 0)){
                newX = x;
                newY = y;
            }
            var newPixel = imgBlur.getPixel(newX, newY);
    
            if (Math.random() < 0.5) {
                Blur.setPixel(x, y, pixel);
            } else {
                Blur.setPixel(x, y, newPixel);
            }
        }
        var imgCanvas = document.getElementById("c1");
        imgBlur.drawTo(imgCanvas);
}

