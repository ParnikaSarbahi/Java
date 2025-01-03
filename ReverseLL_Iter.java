import java.util.*;
public class ReverseLL_Iter{
    Node head;
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head== null){
            head=newNode;
            return;
        }
        
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void ReverseIterate(){
        if(head==null || head.next==null){
            return;
        }
        Node preNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=preNode;

            preNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=preNode;
    }
    public static void main(String args[]){
        ReverseLL_Iter list=new ReverseLL_Iter();
         list.addLast(1);
         list.addLast(2);
         list.addLast(3);
         list.printList();
         list.ReverseIterate();
         list.printList();
    }
}
