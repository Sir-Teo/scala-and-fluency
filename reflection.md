The goal of our redesigned Picture library was to make it easer to compose
operations without having to load and save an image each time. We accomplished
that goal, now it's time for critique. In this round of critique we're focusing
on the following question:

Is there anything that is still annoying or difficult about the operations we
have in the library (i.e., flipping, rotating, and grayscaling)?

One thing annoying is that I have to repeat the name of the object everytime I call into use a method. For example
```Picture.flipHorizontal(picture)
  Picture.grayScale(picture)
  Picture.rotateLeft(picture)
  Picture.saveImage(picture,"tryagain.png")
  ```
  It is quite annoying to repeat the key word ```Picture``` everytime.
  
  It is also quite annoying to load the picture by calling```loadImage(resource("/image.png"))```. The user of this program might be confused with this feature.


