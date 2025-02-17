package Stack;

class Stack {
    private int[] arr = new int[5];
    private int top = -1;
    private int size = 0;

    boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }

    boolean isFull() {
        if (top == arr.length - 1) return true;
        return false;
    }

    void push(int data) {
        if (isFull())throw new Error("Stack is Full");
        else {
            top++;
            arr[top] = data;
            size++;
        }
    }

    int peek() {
        if (isEmpty())throw new Error("Stack is Empty");
        System.out.println("Peek Element : "+arr[top]);
        return arr[top];
    }

    int pop() {
        if (isEmpty())throw new Error("Stack is Empty");
        else {
            int s = arr[top];
            top--;
            size--;
            System.out.println("Deleted Element : "+s);
            return s;
        }
    }

    int size(){
        System.out.println("Size of Stack : "+size);
        return size;
    }

    void display() {
        if (isEmpty())throw new Error("Stack is Empty");
        else {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
