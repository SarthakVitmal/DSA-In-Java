package LinkedList;

class Node7{
    int data;
    Node next;
    Node7(int data){
        this.data = data;
    }
}

class deleteFromEnd{
    Node head = null;
    Node tail = null;
    void insertAtHead(int data){
        Node temp = new Node(data);
        if(head == null)head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
    }

    void delete(int idx) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i <= idx-1; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
        } else {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class deleteFromEndByOnePassSolution {
    public static void main(String[] args) {
        deleteFromEnd sl = new deleteFromEnd();
        sl.insertAtHead(5);
        sl.insertAtHead(7);
        sl.insertAtHead(8);
        sl.insertAtHead(13);
        sl.insertAtHead(15);
        sl.display();
        sl.delete(5);
        sl.display();
    }
}
