class Prueba {
  public static void main(String[] args) {
    var turtle = new Turtle(0, 0, 0);
    turtle.setXscale(-100, 100);
    turtle.setYscale(-100, 100);
    turtle.goForward(20);
    turtle.turnLeft(90);
    turtle.goForward(20);
    turtle.turnRight(90);
    turtle.goForward(20);
    turtle.goBackward(40);
  }
}