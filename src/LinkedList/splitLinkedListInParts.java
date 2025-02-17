package LinkedList;
class Node18{
    int data;
    Node next;
    Node18(int data){
        this.data = data;
    }
}

class splitLinkedList {
    Node head = null;
    void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }

    int lengthOfList(Node head){
        Node temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public Node[] splitListToParts(int k){
        int length = lengthOfList(head);
        int size = length / k;
        int extra = length % k;
        Node[] arr = new Node[k];
        Node temp = head;
        int len = 1;
        int idx = 0;

        while(temp!=null){
            int s = size;
            if(len == 1)arr[idx++] = temp;
            if(extra > 0)s++;
            if(s == len){
                Node a = temp.next;
                temp.next = null;
                temp = a;
                extra--;
                len = 1;
            }else{
                len++;
                temp = temp.next;
            }
        }
        return arr;
    }
}

public class splitLinkedListInParts {
    public static void main(String[] args) {
        splitLinkedList s = new splitLinkedList();
        s.insertAtHead(11);
        s.insertAtHead(10);
        s.insertAtHead(9);
        s.insertAtHead(8);
        s.insertAtHead(7);
        s.insertAtHead(6);
        s.insertAtHead(5);
        s.insertAtHead(4);
        s.insertAtHead(3);
        s.insertAtHead(2);
        s.insertAtHead(1);
        Node[] arr = s.splitListToParts(3);
        for (int i = 0; i < arr.length; i++) {
            Node temp = arr[i];
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
