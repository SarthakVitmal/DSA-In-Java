package LinkedList;
class Node12{
    int data;
    Node next;
    Node12(int data){
        this.data = data;
    }
}

class Palindromell {
    Node head = null;
    Node tail = null;

    void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    Node reverse(Node head){
        if(head == null || head.next == null)return head;
        Node a = head.next;
        Node newHead = reverse(a);
        a.next = head;
        head.next = null;
        return newHead;
    }
    boolean checkPalindrome(){
        Node newHead = new Node(head.data);
        Node t1 = head.next;
        Node t2 = newHead;

        while(t1!=null){
            Node temp = new Node(t1.data);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        newHead = reverse(newHead);

        t1 = head;
        t2 = newHead;
        while(t1!=null){
            if(t1.data!=t2.data)return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
}
public class palindromeLinkedListDeepCopy {
    public static void main(String[] args) {
        Palindrome r = new Palindrome();
        r.insertAtHead(5);
        r.insertAtHead(4);
        r.insertAtHead(1);
        r.insertAtHead(4);
        r.insertAtHead(5);
        r.display();
        if(r.checkPalindrome()) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
