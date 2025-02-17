package Heaps;

class MinHeap{
    int[] arr;
    int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void upheapify(int idx){
        if(idx == 0) return;
        int parent = (idx - 1) / 2;
        if(arr[idx] < arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public void add(int num) throws Exception{
        if(size == arr.length){
            throw new Exception("Heap is Full");
        }
        arr[size++] = num;
        upheapify(size-1);
    }
    public void downHeapify(int idx){
        int lc = 2 * idx + 1;
        int rc = 2 * idx + 2;
        int minIdx = idx;
        if(lc >= size)return;
        if(arr[lc] < arr[minIdx])minIdx = lc;
        if(rc >= size)return;
        if(arr[rc] < arr[minIdx])minIdx = rc;
        swap(idx,minIdx);
        downHeapify(minIdx);
    }
    public int remove() throws Exception{
        if(size == 0)throw new Exception("Heap is empty");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public int peek() throws Exception{
        if(size == 0){
            throw new Exception("Heap is Empty");
        }else {
            return arr[0];
        }
    }
}
public class MinHeapImplementationArray {
    public static void main(String[] args) throws Exception {
        MinHeap pq = new MinHeap(10);
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        System.out.print(pq.size);
        System.out.println();
        System.out.println(pq.peek());
        System.out.println();
        System.out.println(pq.remove());
        System.out.println(pq.peek());
    }
}
