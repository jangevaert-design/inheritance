package edu.cnm.deepdive.base;

public class ShapeBase implements ShapeInterface {

  protected String name;
  protected int width, height;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public ShapeBase(String name, int width, int height) {
    this.name = name;
    this.width = width;
    this.height = height;
  }

  @Override
  public int calculateArea() {
    return 0;
  }


}
