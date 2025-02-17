package Queue;

class Queue{
    int[] arr = new int[5];
    int front = -1;
    int rear = -1;
    int size = 0;

    boolean isEmpty(){
        if(front == -1 && rear == -1)return true;
        return false;
    }
    boolean isFull(){
        if(rear == arr.length-1) return true;
        return false;
    }

    void queue(int data){
        if(isFull())throw new Error("Queue is Full");
        if(isEmpty()){
            front = 0;
            rear = 0;
            arr[rear] = data;
        }
        else
            arr[++rear] = data;
        size++;
    }

    int dequeue(){
        if(isEmpty())throw new Error("Queue is Empty");
        int x = arr[front];
        front++;
        size--;
        System.out.println("Dequeue Element : "+x);
        return x;
    }
    int peek(){
        if(isEmpty())throw new Error("Queue is Empty");
        System.out.println("Peek Element : "+arr[front]);
        return arr[front];
    }

    void queueSize(){
        System.out.println("Queue Size : "+size);
    }
    void display(){
        for (int i=front;i<=rear;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class arrayImplementation {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.queue(1);
        q.queue(2);
        q.queue(3);
        q.queue(4);
        q.queue(5);
        q.display();
        q.dequeue();
        q.display();
        q.peek();
        q.queueSize();
        System.out.println(q.isEmpty());

    }
}
