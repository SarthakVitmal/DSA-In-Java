package LinkedList;

class Node9{
    int data;
    Node next;
    Node9(int data){
        this.data = data;
    }
}

class reversell {
    Node head = null;
    Node tail = null;

    void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    void reverse(){
        Node prev = null;
        Node curr = head;
        Node Next = head;

        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
    }
}

public class reverseLinkedListIterative {
    public static void main(String[] args) {
        reversell r = new reversell();
        r.insertAtHead(5);
        r.insertAtHead(4);
        r.insertAtHead(3);
        r.insertAtHead(2);
        r.insertAtHead(1);
        r.insertAtHead(0);
        System.out.println("Original Linked List : ");
        r.display();
        r.reverse();
        System.out.println("Reverse Linked List : ");
        r.display();
    }
}
