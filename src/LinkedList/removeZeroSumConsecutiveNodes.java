package LinkedList;
class LNode3{
    int data;
    Node next;
    LNode3(int data){
        this.data = data;
    }
}
class zeroSumNodes {
    Node head = null;
    Node tail = null;

    Node insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        return head;
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

    void removeZeroSumNodes() {
        boolean hasZeroSum = true;
        while (hasZeroSum) {
            Node temp = head;
            int length = 0;
            while (temp != null) {
                length++;
                temp = temp.next;
            }

            int[] llArray = new int[length];
            int k = 0;
            temp = head;
            while (temp != null) {
                llArray[k++] = temp.data;
                temp = temp.next;
            }
            hasZeroSum = false;
            int sum;
            for (int i = 0; i < llArray.length; i++) {
                sum = 0;
                for (int j = i; j >= 0; j--) {
                    sum += llArray[j];
                    if (sum == 0) {
                        hasZeroSum = true;
                        for (int l = i; l >= j; l--) {
                            llArray[l] = -1;
                        }
                    }
                }
            }

            Node dummy = new Node(-1);
            Node tempd = dummy;
            for (int i = 0; i < llArray.length; i++) {
                if (llArray[i] != -1) {
                    tempd.next = new Node(llArray[i]);
                    tempd = tempd.next;
                }
            }
            head = dummy.next;
            display(head);
        }
    }
}
public class removeZeroSumConsecutiveNodes {
    public static void main(String[] args) {
        zeroSumNodes ll = new zeroSumNodes();
        ll.insertAtHead(-2);
        ll.insertAtHead(-3);
        ll.insertAtHead(3);
        ll.insertAtHead(2);
        Node head = ll.insertAtHead(1);
        ll.removeZeroSumNodes();
    }
}
