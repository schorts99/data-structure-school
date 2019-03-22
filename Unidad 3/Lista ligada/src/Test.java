public class Test {
  public static void main(String[] args) {
    System.out.println("Último elemento apuntando a null:\n");
    LinkedList list = new LinkedList();
    list.add("Hola");
    list.add("mundo");
    list.add("en");
    list.add("una");
    list.add("lista");
    list.add("ligada");
    System.out.println(list);
    System.out.println("\nPrimer elemento apuntando a null:\n");
    list = new LinkedList();
    list.add("Fin");
    list.add("esto");
    list.add("no");
    list.add("esta");
    list.add("ligado");
    list.add("al");
    list.add("primer");
    list.add("elemento");
    list.setHeadChildToNull();
    System.out.println(list);
  }
}