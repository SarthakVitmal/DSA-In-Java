package LinkedList;
class Node13{
    int data;
    Node next;
    Node13(int data){
        this.data = data;
    }
}

class palindromesll {
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
        Node slow = head;
        Node fast = head;
        Node prevSlow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = slow;
        prevSlow.next = null;
        newHead = reverse(newHead);
        Node t1 = head;
        Node t2 = newHead;
        while(t1!=null && t2!=null){
            if(t1.data!=t2.data)return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        prevSlow.next = reverse(newHead);
        return true;
    }
}
public class palindromeLinkedListReverseSecondHalf {
    public static void main(String[] args) {
        palindromesll r = new palindromesll();
        r.insertAtHead(5);
        r.insertAtHead(4);
        r.insertAtHead(1);
        r.insertAtHead(4);
        r.insertAtHead(5);
        r.display();
        r.checkPalindrome();
        if(r.checkPalindrome()) System.out.println("Linked List is Palindrome");
        else System.out.println("LinkedList is not Palindrome");
    }
}
