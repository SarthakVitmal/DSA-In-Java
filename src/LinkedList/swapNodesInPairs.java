package LinkedList;

class Node25{
    int data;
    Node next;
    Node25(int data){this.data = data;}
}

class Solution3{
    Node head = null;
    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }

    Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node Next;

        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    Node swapPairs() {
        Node dummy = new Node(-1);
        Node t = dummy;
        Node temp = head;
        int length = 1;
        while (temp!=null){
            if(length==2){
                Node a = temp.next;
                Node n = temp;
                temp.next = null;
                n = reverse(head);
                t.next = n;
                t = n.next;
                head = a;
                temp = a;
                length = 1;
            }else{
                length++;
                temp = temp.next;
            }
        }
        if(head !=null) t.next = head;
        return dummy.next;
    }
}
public class swapNodesInPairs {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        s.insertAtHead(6);
        s.insertAtHead(4);
        s.insertAtHead(3);
        s.insertAtHead(2);
        s.insertAtHead(1);
        Node temp = s.swapPairs();
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
