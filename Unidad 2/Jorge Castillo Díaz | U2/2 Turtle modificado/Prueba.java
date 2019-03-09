public class Prueba {
  public static void main(String[] args) {
		var prueba = new Prueba();
    switch(args[0]) {
      case "girarDerecha":
        prueba.turnRightTest();
        break;
      case "girar180":
        prueba.turn180Test();
        break;
      default:
        System.err.println("La prueba indicada no existe");
    }
  }
  
  public void turnRightTest() {
    var turtleL = new Turtle(0, 0.5, 0);
    turtleL.goForward(0.5);
    turtleL.turnLeft(90);
    turtleL.setPenColor(StdDraw.RED);
    turtleL.goForward(0.5);
    var turtleR = new Turtle(0, 0.5, 0);
    turtleR.setPenColor(StdDraw.BLACK);
    turtleR.goForward(0.5);
    turtleR.turnRight(90);
    turtleR.setPenColor(StdDraw.BLUE);
    turtleR.goForward(0.5);
    StdDraw.setPenColor(StdDraw.RED);
    StdDraw.text(0.7, 0.6, "90° Izquierda");
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.text(0.7, 0.4, "90° Derecha");
  }

  public void turn180Test() {
    var turtle = new Turtle(0.5, 0.5, 0);
    turtle.goForward(0.3);
    turtle.setPenColor(StdDraw.RED);
    turtle.turnAround();
    turtle.goForward(0.5);
    StdDraw.text(0.7, 0.6, "Regresa sobre sus propios pasos");
  }
}