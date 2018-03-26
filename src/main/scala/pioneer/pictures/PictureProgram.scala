package pioneer.pictures

import pioneer.resource
import java.awt.Color
import java.awt.image.BufferedImage
import java.io._

import javax.imageio.ImageIO
import pioneer.pictures.Picture.loadImage

object PictureProgram extends App {
  // flip a picture horizontally, grayscale it, and rotate it left
  /*
  Picture.flipHorizontal(resource("/image.png"), "output0.png")
  Picture.grayScale("output0.png", "output1.png")
  Picture.rotateLeft("output1.png", "output2.png")
*/
  var picture = Picture.loadImage(resource("/image.png"))
  Picture.flipHorizontal(picture)
  Picture.grayScale(picture)
  Picture.rotateLeft(picture)
  Picture.saveImage(picture,"try.png")



  // The final picture is now in the top folder of this project's directory,
  // in a file called "output2.png".
}
