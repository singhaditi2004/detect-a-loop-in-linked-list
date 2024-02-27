/**
 * LinkedList
 */
public class LinkedList {
    //initializing head of linkedlist
    private LinkedList.Node head;
    //creating linkedlist class
    public static class Node {
        private int data; // data variable can be of any other type as required 
        private Node next; // pointer to the next node
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
  
    public  boolean hasCycle(Node head){
       Node slow = head;
       Node fast = head;
       while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
       }
       return  false;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(12);
        Node second = new Node(13);
        Node third = new Node(14);
        Node fourth = new Node(15);
        Node fifth = new Node(13);
        // connecting them
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=fifth;
        fifth.next=third;
        
        System.out.println(list.hasCycle(list.head));
        
    }

}
