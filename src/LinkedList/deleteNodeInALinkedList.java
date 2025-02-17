package LinkedList;

class Node2{
    int data;
    Node next;
    Node2(int data){
        this.data = data;
    }
}
class deleteLinkedlist{
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
    void deleteNode(int data){
        if(head == null)throw new Error("LinkedList is empty!!");
        else{
            Node temp = head;
            while(data == temp.data){
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
public class deleteNodeInALinkedList {
    public static void main(String[] args) {
        deleteLinkedlist d = new deleteLinkedlist();
        d.insertAtHead(5);
        d.insertAtHead(10);
        d.insertAtHead(15);
        d.display();
        d.deleteNode(10);
        d.display();
    }
}
