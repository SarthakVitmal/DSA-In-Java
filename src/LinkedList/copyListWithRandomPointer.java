package LinkedList;
class Node21{
    int data;
    Node next;
    Node random;
    Node21(int data){
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

class Solution2{
    Node head = null;
    void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }
    void printList(Node head){
        Node temp = head;
        while(temp!=null){
            int randomData = (temp.random != null) ? temp.random.data : -1;
            System.out.println("Node data: " + temp.data + ", Random data: " + randomData);
            temp = temp.next;
        }
    }
    Node deepCopy(Node head){
        Node head2 = new Node(head.data);
        Node t1 = head.next;
        Node t2 = head2;

        while(t1!=null && t2!=null){
            Node temp = new Node(t1.data);
            t2.next = temp;
            t1 = t1.next;
            t2 = t2.next;
        }
        return head2;
    }
    void connectAlternatively(Node head1,Node head2){
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node t = dummy;

        while(t1!=null && t2!=null){
            t.next = t1;
            t = t.next;t1 = t1.next;
            t.next = t2;
            t = t.next;
            t2 = t2.next;
        }
    }
    void assignRandomPointers(Node head1,Node head2){
        Node t1 = head1;
        Node t2 = head2;
        while(t1!=null){
            t2 = t1.next;
            if(t1.random!=null)t2.random = t1.random.next;
            t1 = t1.next.next;
        }
    }
    void splitList(Node head1,Node head2){
        Node t1 = head1;
        Node t2 = head2;
        while(t1!=null){
            t1.next = t2.next;
            t1 = t1.next;
            if(t1 == null)break;
            t2.next = t1.next;
            t2 = t2.next;
        }
    }
    public Node copyRandomList(){
        //Step1 : Create a deep copy
        Node head2 = deepCopy(head);
        //Step2 : Connects Original LinkedList and deep copy alternatively
        connectAlternatively(head,head2);
        //Step3 : Assigning Random Pointers
        assignRandomPointers(head,head2);
        //Step4 : Breaking the alternate connections
        splitList(head,head2);
        return head2;
    }
}
public class copyListWithRandomPointer {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.insertAtHead(5);
        s.insertAtHead(4);
        s.insertAtHead(3);
        s.insertAtHead(2);
        s.insertAtHead(1);

        s.head.random = s.head.next.next;
        s.head.next.random = s.head.next.next.next.next;
        s.head.next.next.random = s.head;
        s.head.next.next.next.random = s.head.next;
        s.head.next.next.next.next.random = s.head.next.next;

        System.out.println("Original List : ");
        s.printList(s.head);
        System.out.println("**********************************");
        Node copyList = s.copyRandomList();
        System.out.println("Copy List : ");
        s.printList(copyList);
    }
}
