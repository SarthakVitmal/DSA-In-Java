package LinkedList;
class Node26{
    int data;
    Node next;
    Node26(int data){this.data = data;}
}

class Solution4 {
    Node head = null;

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }

    void mergeInBetween(Node head1,int a,int b,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int pos = 0;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        for (int i = 1; i <= b; i++) {
            temp1 = temp1.next;
        }
        temp2.next = temp1.next;
        temp1 = head1;
        temp2 = head2;
        for (int i = 1; i < a; i++) {
            temp1 = temp1.next;
        }
        temp1.next = temp2;
        Node p2 = head1;
        while(p2!=null){
            System.out.print(p2.data + " ");
            p2 = p2.next;
        }
    }
}
public class mergeInBetnLinkedList {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        Node a5 = new Node(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;


        Node b1 = new Node(10);
        Node b2 = new Node(20);
        Node b3 = new Node(30);
        Node b4 = new Node(40);
        Node b5 = new Node(50);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        b5.next = null;

        s.mergeInBetween(a1,2,2,b1);
    }
}
