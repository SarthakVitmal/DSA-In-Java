package LinkedList;

import java.util.ArrayList;

class Node11{
    int data;
    Node next;
    Node11(int data){
        this.data = data;
    }
}

class Palindrome {
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

    boolean checkPalindrome() {
        ArrayList<Integer> arr = new ArrayList<>(100);
        ArrayList<Integer> rev = new ArrayList<>(100);
        Node temp = head;

        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
//        int i = 0;
//        int j = arr.size() - 1;
//        while(i<j) {
//            if (!arr.get(i).equals(arr.get(j))) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
        for (int i = arr.size()-1; i >= 0; i--) {
            rev.add(arr.get(i));
        }
        int i = 0;
        while(i!=arr.size()){
            if(!arr.get(i).equals(rev.get(i)))return false;
            i++;
        }
        return true;
    }
}
public class palindromeLinkedListUsingArrayList {
    public static void main(String[] args) {
        Palindrome r = new Palindrome();
        r.insertAtHead(8);
        r.insertAtHead(4);
        r.insertAtHead(1);
        r.insertAtHead(4);
        r.insertAtHead(5);
        if(r.checkPalindrome()){
            System.out.println("Linked List are Palindrome");
        }else{
            System.out.println("Linked List are not Palindrome");
        }
    }
}
