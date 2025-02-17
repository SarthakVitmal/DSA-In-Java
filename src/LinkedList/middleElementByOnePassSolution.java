package LinkedList;

class Node4{
    int data;
    Node next;
    Node4(int data){
        this.data = data;
    }
}

class MiddleByOnePass{
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
    void findMiddle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }
}
public class middleElementByOnePassSolution {
    public static void main(String[] args) {
        MiddleByOnePass m = new MiddleByOnePass();
        m.insertAtHead(5);
        m.insertAtHead(6);
        m.insertAtHead(7);
        m.insertAtHead(8);
        m.insertAtHead(9);

        m.findMiddle();
    }
}
