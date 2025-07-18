package LinkedList;

class Node20{
    int data;
    Node next;
    Node20(int data){
        this.data = data;
    }
}
public class insertGCDinLL {
    public static void main(String[] args) {
        Node head = new Node(18);
        Node b = new Node(6);
        Node c = new Node(10);
        Node d = new Node(3);
        head.next = b; b.next = c; c.next = d; d.next = null;
        Node ll = insertGreatestCommonDivisors(head);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node insertGreatestCommonDivisors(Node head) {
        if(head == null || head.next == null)return head;
        Node temp = head;
        while (temp.next != null){
            int val1 = temp.data;
            int val2 = temp.next.data;
            int ans = gcd(val1,val2);
            Node newNode = new Node(ans);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }
        return head;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
