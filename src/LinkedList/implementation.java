package LinkedList;
    class Node{
        public Object prev;
        Node random;
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    class SinglyLinkedList {
        private Node head;
        private Node tail;
        private int size;

        boolean isEmpty() {
            if (head == null) return true;
            return false;
        }
        void insertAtBegin(int data){
            Node temp = new Node(data);
            if(isEmpty()) head = tail = temp;
            else{
                temp.next = head;
                temp.data = data;
                head = temp;
            }
            size++;
        }
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            temp.data = data;
            if (isEmpty()) head = tail = temp;
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtSpecificPosition(int idx,int data)throws Error{
            Node t = head;
            Node temp = new Node(data);
            if(isEmpty())head = tail = temp;
            else if(idx == 0)insertAtBegin(data);
            else if(idx == size)insertAtEnd(data);
            else if(idx > size)throw new Error("Index out of bound!!");
            else{
                for(int i=0;i<idx-1;i++){
                    t = t.next;
                }
                temp.next = t.next;
                t.next = temp;
            }
            size++;
        }
        void getElement(int idx)throws Error{
            Node temp = head;
            if(idx > size) System.out.println("Index don't exist");
            else if(idx == 0) System.out.println(head.data);
            else if(idx < 0 || idx > size)throw new Error("Invalid Index");
            else if(idx == size - 1) System.out.println(tail.data);
            else {
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                System.out.println("Element at index "+idx+" : "+temp.data);
            }
        }

        void setElement(int idx,int data)throws Error{
            Node temp = head;
            if(idx > size) System.out.println("Index don't exist");
            else if(idx < 0 || idx > size)throw new Error("Invalid Index");
            else if(idx == 0) head.data = data;
            else if(idx == size - 1) tail.data = data;
            else {
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                temp.data = data;
            }
        }
        void deleteAtBegin(){
            if(isEmpty()) System.out.println("LinkedList is empty..Nothing to delete!!");
            else {
                Node temp = head;
                head = head.next;
                System.out.println("Deleted Element is : "+temp.data);
            }
            size--;
        }


        void deleteAtEnd(){
            if(isEmpty()) System.out.println("LinkedList is empty..Nothing to delete!!");
            else if(size == 1) {
                head = null;
                tail = null;
            }
            else{
                Node temp = head;
                while(temp.next!=tail)temp = temp.next;
                temp.next = null;
                tail = temp;
            }
            size--;
        }

        void deleteAtSpecificPosition(int idx)throws Error{
            if(size == 0)throw new Error("LinkedList is empty...Nothing to delete!!!");
            else if(idx == 0)deleteAtBegin();
            else if(idx < 0 || idx > size)throw new Error("Invalid Index");
            else if(idx == size-1)deleteAtEnd();
            else{
                Node temp = head;
                for (int i = 0; i < idx-1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            size--;
        }

        void size(){
            System.out.println("Length of LinkedList : "+size);
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"--->");
                temp = temp.next;
            }
            System.out.print("NULL");
            System.out.println();
        }
    }
    class implementation {
        public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtEnd(30);
        sll.insertAtBegin(20);
        sll.insertAtBegin(10);
        sll.insertAtSpecificPosition(3,40);
        sll.display();
        sll.deleteAtBegin();
        sll.display();
        sll.size();
        sll.getElement(2);
        sll.setElement(2,90);
        sll.display();
        sll.deleteAtSpecificPosition(1);
        sll.display();
        sll.size();
        sll.deleteAtEnd();
        sll.display();
        sll.size();
        }
    }
