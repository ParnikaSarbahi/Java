/* variable size
 * non contiguous memory
 * insertion in O(1)
 * seach in O(n) preffered when data manipulation zyaada hai and not searching wale kaam
 * searching zyaada hai to array use karo
*/
import java.util.*;
public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head== null){
            head=newNode;
            return;
        } 
        newNode.next=head;
        head=newNode;
    }
    
    public void addLast(String data){
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
    
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst("B");
        list.addFirst("A");
        list.addLast("C");
        list.printList();
    }
}

