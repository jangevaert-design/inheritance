package edu.cnm.deepdive.test;

import edu.cnm.deepdive.base.ShapeBase;
import edu.cnm.deepdive.shape.Rectangle;
import edu.cnm.deepdive.shape.Triangle;

public class Test {

  private static void displayArea(ShapeBase base) {
    System.out.println("Display the area for a shape named: " + base.getName() + "\nwidth: " + base.getWidth()
    + "\nheight: " + base.getHeight() + "\nThe area is: " + base.calculateArea());
  }

  public static void main(String[] args) {
    ShapeBase[] shapes = new ShapeBase[2];
    shapes[0] = new Rectangle("Rectangle",10 ,20);
    shapes[1] = new Triangle("Triangle",10 ,20);

    for (int i = 0; i < shapes.length; i++) {
      displayArea(shapes[i]);
    }
  }

}
