public class LinkedList {
  private Item head;

  class Item {
    Object data;
    Item child;

    Item(Object data) {
      this.data = data;
      child = null;
    }
  }

  public void add(Object data) {
    Item item = new Item(data);
    item.child = null;
    if (head == null) head = item;
    else {
      Item last = head;
      while (last.child != null) last = last.child;
      last.child = item;
    }
  }

  public void setHeadChildToNull() {
    head.child = null;
  }

  public String toString() {
    String string = "";
    Item current = head;
    while (current != null) {
      string += current.data + " ";
      current = current.child;
    }
    return string;
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("Hola");
    list.add("mundo");
    System.out.println(list);
  }
}