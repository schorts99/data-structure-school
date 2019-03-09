public class Prueba {
  public static void main(String[] args) {
    switch(args[0]) {
      case "girarDerecha":
        turnRightTest();
        break;
      case "girar180":
        turn180Test();
        break;
      case "retroceder":
        goBackTest();
        break;
      case "avanzarColores":
        goForwardWithColorsTest();
        break;
      case "retrocederColores":
        goBackwardWithColorsTest();
        break;
      case "borrarPasos":
        eraseSteps();
        break;
      case "dejarPintar":
        jumpStepsTest();
        break;
      case "moverA":
        jumpToTest();
        break;
      default:
        System.err.println("La prueba indicada no existe");
    }
  }
  
  public static void turnRightTest() {
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

  public static void turn180Test() {
    var turtle = new Turtle(0.5, 0.5, 0);
    turtle.goForward(0.3);
    turtle.setPenColor(StdDraw.RED);
    turtle.turnAround();
    turtle.goForward(0.5);
    StdDraw.text(0.7, 0.6, "Regresa sobre sus propios pasos");
  }

  public static void goBackTest() {
    var turtle = new Turtle(0.5, 0.5, 0);
    turtle.goBackward(0.4);
    StdDraw.text(0.7, 0.6, "Dirección inicial ->");
  }

  public static void goForwardWithColorsTest() {
    var turtle = new Turtle(0.5, 0.5, 0);
    StdDraw.setPenRadius(0.1);
    turtle.goForwardWithColors(0.4);
    StdDraw.text(0.7, 0.6, "Dibuja una línea de colores");
  }

  public static void goBackwardWithColorsTest() {
    var turtle = new Turtle(0.5, 0.5, 0);
    StdDraw.setPenRadius(0.1);
    turtle.goBackwardWithColors(0.4);
    StdDraw.text(0.7, 0.6, "Dirección inicial ->");
  }

  public static void eraseSteps() {
    var turtle = new Turtle(0, 0.5, 0);
    turtle.goForward(1);
    turtle.eraseSteps(0.5);
    StdDraw.text(0.5, 0.6, "Se ha borrado la mitad de la línea");
  }

  public static void jumpStepsTest() {
    var turtle = new Turtle(0, 0.5, 0);
    turtle.goForward(0.33);
    turtle.jumpSteps(0.33);
    turtle.goForward(0.33);
    StdDraw.text(0.5, 0.6, "Salta 1/3 línea");
  }

  public static void jumpToTest() {
    var turtle = new Turtle(0, 0.4, 0);
    turtle.goForward(0.5);
    turtle.jumpTo(0.5, 0.6);
    turtle.goForward(0.5);
    StdDraw.text(0.5, 0.3, "Salta unos pasos hacía abajo");
  }
}