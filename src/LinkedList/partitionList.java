package LinkedList;

class Node8{
    int data;
    Node next;
    Node8(int data){
        this.data = data;
    }
}

class partition{
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
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public void partitionll(int x) {
        Node sdummy = new Node(100);
        Node ldummy = new Node(100);
        Node temp = head;
        Node stemp = sdummy;
        Node ltemp = ldummy;

        while(temp!=null){
            if(temp.data < x){
                stemp.next = temp;
                stemp = stemp.next;
            }else {
                ltemp.next = temp;
                ltemp = ltemp.next;
            }
            temp = temp.next;
        }
        ltemp.next = null;
        ldummy = ldummy.next;
        stemp.next = ldummy;
        System.out.println("Partition List : ");
    }
}
public class partitionList {
    public static void main(String[] args) {
        partition p = new partition();
        p.insertAtHead(2);
        p.insertAtHead(5);
        p.insertAtHead(2);
        p.insertAtHead(3);
        p.insertAtHead(4);
        p.insertAtHead(1);
        System.out.println("Original Linked List : ");
        p.display();
        p.partitionll(3);
        p.display();
    }
}
