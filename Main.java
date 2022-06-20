class Main {
  public static void main(String[] args) {
    DoublyLinkedList dll=new DoublyLinkedList();
    dll.createDLL(1);
    System.out.println(dll.head.value);
    dll.insertNode(2,0);
    dll.insertNode(3,1);
    dll.insertNode(0,10);
    System.out.println(dll.head.value);
  
    dll.traverseDLL();
  
  }
}