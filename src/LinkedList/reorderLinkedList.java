package LinkedList;
class Node16{
    int data;
    Node next;
    Node16(int data){
        this.data = data;
    }
}

class reOrder {
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

    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node n = head;

        while (curr != null) {
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }

    Node reorderLL(){
        Node dummy = new Node(100);
        Node temp = head;
        int length = 0;
        Node slow = head;

        while(temp!=null){
            length++;
            temp = temp.next;
        }

        for (int i = 0; i < length/2-1; i++) {
            slow = slow.next;
        }

        Node newHead = slow.next;
        slow.next = null;
        newHead = reverse(newHead);

        Node temp1 = head;
        Node temp2 = newHead;
        Node temp3 = dummy;

        while(temp1!=null && temp2!=null){
            temp3.next = temp1;
            temp3 = temp3.next;
            temp1 = temp1.next;
            temp3.next = temp2;
            temp2 = temp2.next;
            temp3 = temp3.next;

        }
        return dummy.next;
    }
}

public class reorderLinkedList {
    public static void main(String[] args) {
        reOrder r = new reOrder();
        r.insertAtHead(60);
        r.insertAtHead(50);
        r.insertAtHead(40);
        r.insertAtHead(30);
        r.insertAtHead(20);
        r.insertAtHead(10);
        Node res = r.reorderLL();
        Node temp = res;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
}
