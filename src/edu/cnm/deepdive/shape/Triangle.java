package edu.cnm.deepdive.shape;

import edu.cnm.deepdive.base.ShapeBase;

public class Triangle extends ShapeBase {

  public Triangle(String name, int width, int height) {
    super(name, width, height);
  }

  public int calculateArea() {
    return (width * height) / 2;
  }
}
