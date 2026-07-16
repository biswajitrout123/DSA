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
    // Display Forward
    public static void displayForward(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    // Display Backward
    public static void displayBackward(Node head) {

        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("NULL");
    }

    // INSERT AT BEGINING
    public static Node insertBeginning(Node head, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }

    // INSERT AT END
    public static Node insertEnd(Node head, int data) {

    Node newNode = new Node(data);

    if (head == null) {
        return newNode;
    }

    Node temp = head;

    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;
    newNode.prev = temp;

    return head;
}

    // INSERT AFTER A GIVE POSITION
    public static void insertAfter(Node current, int data) {
        if (current == null) {
            return;
        }

        Node newNode = new Node(data);

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;
    }

    // Insert Before Given Node
    public static Node insertBefore(Node head, Node current, int data) {

        if (current == null) {
            return head;
        }

        Node newNode = new Node(data);

        newNode.prev = current.prev;
        newNode.next = current;

        if (current.prev != null) {
            current.prev.next = newNode;
        } else {
            head = newNode;
        }

        current.prev = newNode;

        return head;
    }

    // Delete Beginning
    public static Node deleteBeginning(Node head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        head = head.next;
        head.prev = null;

        return head;
    }

    // Delete End
    public static Node deleteEnd(Node head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;

        return head;
    }

    // Delete Given Node
    public static Node deleteNode(Node head, Node current) {

        if (head == null || current == null) {
            return head;
        }

        if (current == head) {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }

        return head;
    }

    // Search
    public static Node search(Node head, int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    // Reverse DLL
    public static Node reverse(Node head) {

        Node current = head;
        Node temp = null;

        while (current != null) {

            temp = current.prev;

            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }

    
    public static void main(String[] args) {
        Node head = null;

        // Insert at Beginning
        head = insertBeginning(head, 30);
        head = insertBeginning(head, 20);
        head = insertBeginning(head, 10);

        System.out.println("After Insert Beginning:");
        displayForward(head);

        // Insert at End
        head = insertEnd(head, 40);
        head = insertEnd(head, 50);

        System.out.println("After Insert End:");
        displayForward(head);

        // Insert After Node (20)
        Node node20 = search(head, 20);
        insertAfter(node20, 25);

        System.out.println("After Insert After 20:");
        displayForward(head);

        // Insert Before Node (40)
        Node node40 = search(head, 40);
        head = insertBefore(head, node40, 35);

        System.out.println("After Insert Before 40:");
        displayForward(head);

        // Delete Beginning
        head = deleteBeginning(head);

        System.out.println("After Delete Beginning:");
        displayForward(head);

        // Delete End
        head = deleteEnd(head);

        System.out.println("After Delete End:");
        displayForward(head);

        // Delete Node (25)
        Node node25 = search(head, 25);
        head = deleteNode(head, node25);

        System.out.println("After Delete Node 25:");
        displayForward(head);

        // Reverse
        head = reverse(head);

        System.out.println("After Reverse:");
        displayForward(head);

        // Backward Traversal
        System.out.println("Backward Traversal:");
        displayBackward(head);
    }
}