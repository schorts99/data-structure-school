public class Prueba {
  public static void main(String[] args) {
    var prueba = new Prueba();

    switch(args[0]) {
      case "tamaño":
        prueba.changeWindowSizeTest();
        break;
      case "escala":
        prueba.changeScale();
        break;
      default:
        System.err.println("La prueba indicada no existe");
    }
  }

  private void changeWindowSizeTest() {
    StdDraw.setCanvasSize(600, 600);
    StdDraw.text(0.5, 0.5, "Nuevo tamaño de ventana");
  }

  private void changeScale() {
    StdDraw.square(0.5, 0.5, 0.3);
    StdDraw.text(0.5, 0.5, "Escala normal");
    StdDraw.setScale(0, 10);
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.square(0.5, 0.5, 0.3);
    StdDraw.text(2.5, 0.5, "Escala actualizada");
  }
}