package LinkedList;
class Node10{
    int data;
    Node next;
    Node10(int data){
        this.data = data;
    }
}

class reverserll {
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

    Node reverse(Node head){
        if(head == null || head.next == null)return head;
        Node a = head.next;
        Node newHead = reverse(a);
        a.next = head;
        head.next = null;
        return newHead;
    }
    void reverseList() {
        head = reverse(head);
    }
}
public class reverseLinkedListRecursive {
    public static void main(String[] args) {
        reverserll r = new reverserll();
        r.insertAtHead(5);
        r.insertAtHead(4);
        r.insertAtHead(3);
        r.insertAtHead(2);
        r.insertAtHead(1);
        r.display();
        r.reverseList();
        r.display();
    }
}
