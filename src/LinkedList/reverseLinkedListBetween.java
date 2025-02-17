package LinkedList;

class Node15{
    int data;
    Node next;
    Node15(int data){
        this.data = data;
    }
}

class reverseBetween {
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
        Node n = head;

        while(curr!=null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }

    void reverseBetweenLL(int left,int right){
        Node templ = head;
        Node tempr = head;
        Node t = head;
        int length = 0;
        while(t!=null){
            t = t.next;
            length++;
        }
        if(left == 1 && right == length){
            head = reverse(head);
        }else {
            for (int i = 1; i < left; i++) {
                templ = templ.next;
            }
            for (int i = 1; i < right; i++) {
                tempr = tempr.next;
            }
            Node a = templ;
            Node b = templ.next;
            a.next = null;
            Node c = tempr;
            Node d = tempr.next;
            c.next = null;
            b = reverse(b);
            Node temp = b;
            a.next = temp;
            while (temp != null && temp.next != null) {
                temp = temp.next;
            }
            if (temp != null) {
                temp.next = d;
            } else {
                a.next = d;
            }
        }
    }
}

public class reverseLinkedListBetween {
    public static void main(String[] args) {
        reverseBetween r = new reverseBetween();
//        r.insertAtHead(5);
//        r.insertAtHead(4);
//        r.insertAtHead(3);
//        r.insertAtHead(2);
//        r.insertAtHead(1);
        r.insertAtHead(3);
        r.insertAtHead(2);
        r.insertAtHead(1);

        r.display();
        r.reverseBetweenLL(1,2);
        r.display();
    }
}
