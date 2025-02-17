package LinkedList;
class Node14{
    int data;
    Node next;
    Node14(int data){
        this.data = data;
    }
}

class TwinSum {
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

    int maxNo(int a,int b){
        return Math.max(a, b);
    }

    Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node n = head;

        while(curr!=null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }

    public int pairSum() {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = slow;
        newHead = reverse(newHead);
        Node temp1 = head;
        Node temp2 = newHead;
        int max = 0;
        while(temp2!=null){
            int pairSum = temp1.data + temp2.data;
            max = maxNo(max,pairSum);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return max;
    }
}

public class maxTwinSum {
    public static void main(String[] args) {
        TwinSum t = new TwinSum();
        t.insertAtHead(5);
        t.insertAtHead(4);
        t.insertAtHead(2);
        t.insertAtHead(9);
        System.out.println("Maximum Twin Sum : "+t.pairSum());
    }
}
