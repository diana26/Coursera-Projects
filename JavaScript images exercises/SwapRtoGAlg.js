var img = new SimpleImage('rodger.png');
print (img);

function swapGreentoRed (pix)
{      
       var oneGreen = pix.getRed();
       var oneRed = pix.getGreen();   
       pix.setGreen(oneGreen);
       pix.setRed(oneRed);
  
       return (pix);
}

 
for (var pix of img.values()){
 
   swapGreentoRed (pix);

}
   
 print (img);
