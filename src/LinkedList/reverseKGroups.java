package LinkedList;

class LNode{
    int data;
    Node next;
    LNode(int data){
        this.data = data;
    }
}

class reverseK{
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
        Node prev = null;
        Node curr = head;
        Node Next;

        while(curr!=null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    void reverseKGrps(){
        Node temp = head;

    }
}
public class reverseKGroups {
    public static void main(String[] args) {
        reverseK r = new reverseK();
        r.insertAtHead(5);
        r.insertAtHead(4);
        r.insertAtHead(3);
        r.insertAtHead(2);
        r.insertAtHead(1);
        r.display();
        r.reverseKGrps();

    }
}
