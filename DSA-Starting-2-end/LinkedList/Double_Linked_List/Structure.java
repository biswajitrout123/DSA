package LinkedList.Double_Linked_List;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class Structure {

    
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        Node temp = first;
        while (temp !=null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
            
        }
        
    }
}
