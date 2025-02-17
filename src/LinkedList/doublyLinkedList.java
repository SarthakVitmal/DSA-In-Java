package LinkedList;

import java.util.Scanner;

class Node22{
    int data;
    Node next;
    Node prev;
    Node22(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class Implementationdll{
    Node head = null;
    Node tail = null;
    int size = 0;

    void insertAtBegin(int data){
        Node temp = new Node(data);
        if(head == null)head = tail = temp;
        else{
            temp.data = data;
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtEnd(int data){
        Node temp = new Node(data);
        if(tail == null)head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtSpecificIndex(int data, int idx) {
        if (idx < 0 || idx > size) throw new IndexOutOfBoundsException("Invalid index");
        if (idx == 0) {
            insertAtBegin(data);
            return;
        }if (idx == size) {
            insertAtEnd(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        Node t = new Node(data);
        t.next = temp.next;
        t.prev = temp;
        if (temp.next != null) {
            temp.next.prev = t;
        }
        temp.next = t;
        size++;
    }

    int deleteAtBegin(){
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        return temp.data;
    }

    int deleteAtEnd(){
        Node temp = tail;
        tail = (Node) tail.prev;
        tail.next = null;
        size--;
        return temp.data;
    }

    int deleteAtSpecificIndex(int idx){
        if(idx < 0 && idx > size)throw new Error("Index out of Bound");
        if(idx == 1)deleteAtBegin();
        if(idx == size)deleteAtEnd();
        else{
        Node temp = head;
        for (int i = 1; i < idx-1; i++) {
            temp = temp.next;
        }
        Node deletedNode = temp.next;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
        return deletedNode.data;
        }
        return 0;
    }

    void display(){
        if(size == 0)throw new Error("Linked List is empty");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class doublyLinkedList {
    public static void main(String[] args) {
        Implementationdll dll = new Implementationdll();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
        System.out.println("Doubly Linked List");
        System.out.println("1.Insert At Begin\n2.Insert At End\n3.Insert At Specific Position\n4.Delete At Begin\n5.Delete At End\n6.Delete At Specific Position\n7.Display Linked List\n8.Size of Linked List");
        System.out.println("Enter your choice : \n");
        choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data : ");
                    int data = sc.nextInt();
                    dll.insertAtBegin(data);
                    break;
                case 2:
                    System.out.println("Enter the data : ");
                    data = sc.nextInt();
                    dll.insertAtEnd(data);
                    break;

                case 3:
                    System.out.println("Enter the data : ");
                    data = sc.nextInt();
                    System.out.println("Enter the index");
                    int idx = sc.nextInt();
                    dll.insertAtSpecificIndex(data,idx);
                    break;
                case 4:
                    System.out.println("Deleted Data : "+dll.deleteAtBegin());
                    break;
                case 5:
                    System.out.println("Deleted Data : "+dll.deleteAtEnd());
                    break;
                case 6:
                    System.out.println("Enter the index : ");
                    idx = sc.nextInt();
                    System.out.println("Deleted Data : "+dll.deleteAtSpecificIndex(idx));
                case 7:
                    dll.display();
                    break;
                case 8:
                    System.out.println("Size of Linked List : "+dll.size);
            }
        }while (choice!=19);
    }
}