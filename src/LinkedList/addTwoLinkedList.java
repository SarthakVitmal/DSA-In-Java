package LinkedList;

class Node17{
    int data;
    Node next;
    Node17(int data){
        this.data = data;
    }
}

class addTwoLL {
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
        Node n;

        while (curr != null) {
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }

    Node addTwoNumbers(Node l1,Node l2){
        Node dummy = new Node(0);
        l1 = reverse(l1);
        l2 = reverse(l2);
        Node temp1 = l1;
        Node temp2 = l2;
        Node temp3 = dummy;
        int carry = 0;

        while(temp1!=null || temp2!=null){
            int val1 = 0;
            int val2 = 0;
            if(temp1!=null)val1 = temp1.data;
            if(temp2!=null)val2 = temp2.data;
            int sum = val1 + val2 + carry;
            temp3.next = new Node(sum % 10);
            temp3 = temp3.next;
            if(sum > 9)carry = 1;
            else carry = 0;
            if(temp1!=null)temp1 = temp1.next;
            if(temp2!=null)temp2 = temp2.next;
        }
        if(carry == 1){
            temp3.next = new Node(1);
            temp3 = temp3.next;
        }
        return reverse(dummy.next);
    }
}
public class addTwoLinkedList {
    public static void main(String[] args) {
        addTwoLL a = new addTwoLL();
        Node n1 = new Node(7);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        Node m1 = new Node(5);
        Node m2 = new Node(6);
        Node m3 = new Node(4);
        m1.next = m2;
        m2.next = m3;
        m3.next = null;
        Node temp = a.addTwoNumbers(n1,m1);
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
