package LinkedList;

class Node6{
    int data;
    Node next;
    Node6(int data){
        this.data = data;
    }
}

class deleteNthNodeFromEnd{
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
        Node temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        int pos = length - idx + 1;
        if (pos == 1) {
            head = head.next;
        } else {
            temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
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
public class deleteFromEndOfList {
    public static void main(String[] args) {
        deleteNthNodeFromEnd sl = new deleteNthNodeFromEnd();
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
