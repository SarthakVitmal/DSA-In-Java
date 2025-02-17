package LinkedList;

class Node3{
    int data;
    Node next;
    Node3(int data){
        this.data = data;
    }
}

class middle{
    Node head = null;
    Node tail = null;
    int length = 0;

    void insertAtHead(int data){
        Node temp = new Node(data);
        if(head == null)head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
    }

    void findMiddle(){
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        temp = head;
            for (int i = 0; i < (length/2); i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
    }
}

public class middleOfLinkedList {
    public static void main(String[] args) {
        middle m = new middle();
        m.insertAtHead(5);
        m.insertAtHead(6);
        m.insertAtHead(7);
        m.insertAtHead(8);
        m.insertAtHead(9);
        m.insertAtHead(10);
        m.findMiddle();
    }
}
