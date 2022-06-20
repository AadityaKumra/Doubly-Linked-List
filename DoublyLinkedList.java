public class DoublyLinkedList{
  doublyNode head;
  doublyNode tail;
  int size;

  public doublyNode createDLL(int nodeValue){
    head =new doublyNode();
    doublyNode newNode=new doublyNode();
    newNode.value=nodeValue;
    newNode.next=null;
    newNode.prev=null;
    head=newNode;
    tail=newNode;
    size=1;
    return head;
  }
}