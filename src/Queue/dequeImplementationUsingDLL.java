package Queue;

class ListNode{
    int data;
    ListNode next;
    ListNode prev;
    ListNode(int data){this.data = data;}
}
class Deque{
    int size = 0;
    ListNode front = null;
    ListNode rear = null;

    boolean isEmpty(){
        if(rear == null && front == null)return true;
        return false;
    }
    void insertAtFront(int data){
        ListNode temp = new ListNode(data);
        if(front == null){
            front = rear = temp;
        }else{
            temp.next = front;
            front.prev = temp;
            front = temp;
        }
        size++;
    }
    void insertAtRear(int data){
        ListNode temp = new ListNode(data);
        if(rear == null){
            front = rear = temp;
        }else{
            rear.next = temp;
            temp.prev = rear;
            rear = temp;
        }
        size++;
    }

    int deleteFromFront(){
        if(isEmpty())throw new Error("Queue is Empty");
        else{
            int x = front.data;
            front = front.next;
            if(front == null)rear = null;
            else front.prev = null;
            System.out.println("Deleted From Front : "+x);
            size--;
            return x;
        }
    }
    int deleteFromRear(){
        if(isEmpty())throw new Error("Queue is Empty");
        else{
            int x = rear.data;
            rear = rear.prev;
            if(rear == null)front = null;
            else rear.next = null;
            System.out.println("Deleted From Rear : "+x);
            size--;
            return x;
        }
    }

    int getSize(){
        System.out.println("Size : "+size);
        return size;
    }
    int getFront(){
        if(isEmpty())throw new Error("Queue is Empty");
        else{
            System.out.println("Front Data : "+front.data);
            return front.data;
        }
    }
    int getRear(){
        if(isEmpty())throw new Error("Queue is Empty");
        else{
            System.out.println("Rear Data : "+rear.data);
            return rear.data;
        }
    }
    void display(){
        if(isEmpty())throw new Error("Queue is Empty");
        ListNode temp = front;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class dequeImplementationUsingDLL {
    public static void main(String[] args) {
        Deque d = new Deque();
        d.insertAtFront(5);
        d.insertAtRear(6);
        d.insertAtFront(4);
        d.display();
        d.getSize();
        d.deleteFromFront();
        d.display();
        d.getSize();
        d.deleteFromRear();
        d.display();
        d.getSize();

    }
}
