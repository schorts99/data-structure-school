public class Prueba {
  public static void main(String[] args) {
    try {
      var ngon = new Ngon(Byte.parseByte(args[0]));
    } catch(Ngon.Validaciones.NumeroFigurasInvalido err) {
      err.printStackTrace();
    }
  }
}