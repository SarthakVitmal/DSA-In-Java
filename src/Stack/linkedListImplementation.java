package Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class Stackll{
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    boolean isEmpty(){
        if(head == null)return true;
        return false;
    }

    void push(int data){
        Node temp = new Node(data);
        if(isEmpty())head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    int peek(){
        if(isEmpty())throw new Error("Stack is Empty");
        else{
            Node temp = tail;
            System.out.println("Peek Element : "+temp.data);
            return temp.data;
        }
    }

    int pop(){
        if(isEmpty())throw new Error("Stack is Empty");
        if(size == 1){
            Node temp = head;
            System.out.println("Deleted Element : "+head.data);
            head = tail = null;
            size--;
            return temp.data;
        }
        else{
            Node temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            Node deletedNode = temp.next;
            System.out.println("Deleted Element : "+deletedNode.data);
            tail = temp;
            tail.next = null;
            size--;
            return deletedNode.data;
        }
    }

    int size(){
        System.out.println("Size of stack : "+size);
        return size;
    }

    void display(){
        Node
                temp = head;
        if(isEmpty())throw new Error("Stack is Empty");
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class linkedListImplementation {
    public static void main(String[] args) {
        Stackll sll = new Stackll();
        sll.push(5);
        sll.push(10);
        sll.push(15);
        sll.display();
        sll.peek();
        sll.pop();
        sll.display();
        sll.pop();
        sll.display();
        sll.pop();
        sll.size();
    }
}
