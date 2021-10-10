  var BlurImage = new SimpleImage ('1.jpg'); 
  var Blur = new SimpleImage(BlurImage.getWidth(), BlurImage.getHeight());
  for (var pixel of BlurImage.values()) {
    var x = pixel.getX();
    var y = pixel.getY();
    var newX = x + (Math.floor(Math.random() * 10));
    var newY = y + (Math.floor(Math.random() * 10));
    
    if ((newX > BlurImage.getWidth() -1) || (newY > BlurImage.getHeight() -1 )){
      newX = x;
      newY = y;
    }
    else if ((newX < 0) || (newY < 0)){
      newX = x;
      newY = y;
      }

    var newPixel = BlurImage.getPixel(newX, newY);
    
    if (Math.random() < 0.5) {
      Blur.setPixel(x, y, pixel);
    }
    else {
      Blur.setPixel(x, y, newPixel);
    } 
  }

  BlurImage = Blur;
  print (Blur);

