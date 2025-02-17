package LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
class Solution{
    ListNode head = null;
    void insertAtHead(int val) {
        ListNode temp = new ListNode(val);
        if (head == null) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }

    void print(int[] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public int[] nodesBetweenCriticalPoints(){
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        int[] arr = {-1,-1};
        int first = -1;int last = -1;
        int minDistance = Integer.MAX_VALUE;
        int idx = 1;


        while(right!=null){
            if((mid.val > left.val && mid.val > right.val) || (mid.val < left.val && mid.val < right.val)){
                if(first==-1)first = idx;
                if(last!=-1){
                    int dist = idx - last;
                    minDistance = Math.min(minDistance,dist);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }
        if(first == last)return arr;
        int maxDistance = last - first;
        arr[0] = minDistance;
        arr[1] = maxDistance;
        return arr;
    }
}
public class maxAndMinNodesBetnCriticalPoints {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.insertAtHead(2);
        s.insertAtHead(1);
        s.insertAtHead(5);
        s.insertAtHead(2);
        s.insertAtHead(1);
        s.insertAtHead(3);
        s.insertAtHead(5);
        int []arr = s.nodesBetweenCriticalPoints();
        s.print(arr);
    }
}
