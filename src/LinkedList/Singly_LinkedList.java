package LinkedList;

class Node1{
    int data;
    Node next;
    Node1(int data){
         data = this.data;
    }
}

class SLL_Implementation{
    Node head;
    Node tail;
    int size;

    void insertAtHead(int data){
        Node temp = new Node(data);
        if(head == null)head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int data){
        Node temp = new Node(data);
        if(head == null)head = tail = temp;
        else{
           tail.next = temp;
           tail = temp;
        }
        size++;
    }

    void insertAtSpecificPosition(int idx,int data) throws Error{
        Node temp = new Node(data);
        Node t = head;
        if(idx == 0)insertAtHead(data);
        else if(idx == size)insertAtTail(data);
        else if(idx > size || idx < 0) throw new Error("Invalid Index");
        else{
            for (int i = 0; i < idx-1; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(head == null)throw new Error("Linked List is Empty");
        else {head = head.next;}
        size--;
    }

    void deleteAtTail(){
        if(head == null)throw new Error("Linked List is Empty");
        else{
            Node temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    void deleteAtSpecificPosition(int idx){
        Node temp = head;
        if(head == null)throw new Error("Linked List is Empty");
        if(idx == 0)deleteAtHead();
        if(idx == size)deleteAtTail();
        else{
            for (int i = 0; i < idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    void getData(int idx)throws Error{
        Node temp = head;
        if(idx > size || idx < 0)throw new Error("Invalid Index");
        else{
            for (int i = 0; i < idx ; i++) {
                temp = temp.next;
            }
            System.out.println("Element at index "+idx+" : "+temp.data);
        }
    }

    void setData(int idx,int data) throws Error{
        Node temp = head;
        if(idx > size || idx < 0)throw new Error("Invalid Index");
        else{
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            temp.data = data;
        }
    }

    void size(){
        System.out.println("Length of Linked List : "+size);
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

public class Singly_LinkedList{
    public static void main(String[] args) {
        SLL_Implementation s = new SLL_Implementation();
        s.insertAtHead(5);
        s.display();
        s.insertAtTail(10);
        s.display();
        s.insertAtHead(20);
        s.display();
        s.insertAtSpecificPosition(2,15);
        s.display();
        s.getData(2);
        s.setData(2,45);
        s.display();
        s.size();
        s.deleteAtHead();
        s.display();
        s.deleteAtTail();
        s.display();
        s.deleteAtSpecificPosition(1);
        s.display();
        s.size();
    }
}
