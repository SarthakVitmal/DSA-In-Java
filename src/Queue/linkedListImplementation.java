package Queue;

class Node{
    int data;
    Node next;
    Node(int data){this.data = data;}
}
class QueueUsingLL{
    Node head = null;
    Node tail = null;
    int size = 0;
    boolean isEmpty(){
        if(head == null && tail == null)return true;
        return false;
    }

    void push(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    int pop(){
        if(isEmpty())throw new Error("Queue is Empty");
        else{
            int data = head.data;
            head = head.next;
            size--;
            System.out.println("Deleted Element : "+data);
            return data;
        }
    }

    int peek(){
        if(isEmpty())throw new Error("Queue is Empty");
        else {
            int data = head.data;
            System.out.println("Peek Element : " + data);
            return data;
        }
    }

    int getSize(){
        System.out.println("Queue Size : "+size);
        return size;
    }

    void display(){
        Node temp = head;
        System.out.println("Display Queue : ");
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class linkedListImplementation {
    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);
        q.display();
        q.pop();
        q.pop();
        q.display();
        q.peek();
        q.getSize();

    }
}
