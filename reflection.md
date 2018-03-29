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


###Critique of Eesha Agarwal's code:

You did a great job in implementing the ```Square```,```Repeat``` and ```SleepIn``` function. Your response is mostly the same as mine. And the tests you added to test the 
```SleepIn``` function are complete and correct. 

For the picture program, you did an excellence job too! You modified the functions so that it pass in a ```BufferedImage``` type and return a ```BufferedImage``` type, and your implementation is just the same as mine. One thing you did better than me is that you even added three more methods modifying the picture. I actually learnt a lot from your coding. Especially, I learnt to blur an image, as you did in your Picture library. 

For your reflection, I agreed to most of your ideas. Yes, it is much more fluent to modify a image within a single line of code. But I think it would be more clearer and easier for the user if you separate those lines of code into three steps. Second, you talked about it was inconvenient to type out the entire path to load an image. Maybe you can try the function ```loadImage()``` and implement it like this:
```var picture = Picture.loadImage(resource("/image.png"))```
This code worked on my computer well.


