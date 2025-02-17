package LinkedList;

class Node5{
    int data;
    Node next;
    Node5(int data){
        this.data = data;
    }
}

class deleteMiddle {
    Node head = null;
    Node tail = null;
    int length = 0;
    void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }
    void delete(){
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        if(length == 1){
            head = null;
            return;
        }
        if(length == 2){
            head.next = null;
            return;
        }
        temp = head;
        for (int i = 1; i < length/2; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
public class deleteMiddleNode {
    public static void main(String[] args) {
        deleteMiddle d = new deleteMiddle();
        d.insertAtHead(5);
        d.insertAtHead(6);
        d.insertAtHead(7);
        d.display();
        d.delete();
        d.display();
    }
}
