package LinkedList;

class LNode2{
    int data;
    Node next;
    LNode2(int data){
        this.data = data;
    }
}

class removeDuplicates{
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

    void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    Node removeDup(){
        Node slow = head;
        Node fast = head;
        Node dummy = new Node(-1);
        Node temp = dummy;
        int count = 0;

        while(fast!=null){
            count = 0;
            while (fast != null && fast.data == slow.data) {
                count++;
                fast = fast.next;
            }
            if (count == 1) {
                temp.next = slow;
                temp = temp.next;
            }
            slow = fast;
        }
        temp.next = null;
        return dummy.next;
    }
}

public class removeDuplicatesFromSortedList {
    public static void main(String[] args) {
        removeDuplicates ll = new removeDuplicates();
//        ll.insertAtHead(3);
//        ll.insertAtHead(2);
        ll.insertAtHead(2);
        ll.insertAtHead(2);
        ll.insertAtHead(1);
        Node dummy = ll.removeDup();
        ll.display(dummy);
    }
}
