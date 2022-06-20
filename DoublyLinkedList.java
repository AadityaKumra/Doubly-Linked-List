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
  //insert node

  public void insertNode(int nodeValue,int location){
    doublyNode newNode=new doublyNode();
    newNode.value=nodeValue;
    if(head==null){
      createDLL(nodeValue);
      return;
    }
    else if(location==0){
      newNode.prev=null;
      newNode.next=head;
      head.prev=newNode;
      head=newNode;
    }
    else if(location>=size){
      tail.next=newNode;
      newNode.prev=tail;
      tail=newNode;
      newNode.next=null;
    }
    else{
      doublyNode tempNode=head;
      for(int i=0;i<location-1;i++){
        tempNode.next=tempNode;
      }
      newNode.prev=tempNode;
      newNode.next=tempNode.next;
      tempNode.next=newNode;
      newNode.next.prev=newNode;      
    }
    size+=1;
  }
  //traverse dll
  public void traverseDLL(){
    if(head!=null){
      doublyNode tempNode=head;
      for(int i=0;i<size;i++){
        System.out.print(tempNode.value);
        if(i!=size-1){
          System.out.print(" -> ");
        }
        tempNode=tempNode.next;
      }
    }
    else{
      System.out.println("DLL does not exist");
    }
    System.out.print("\n");
  }
}