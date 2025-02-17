package OoPs;

class Book{
    private int pageNo;

    public int getPageNo(){ //getter method
        return pageNo;
    }
    public void setPageNo(int pageNo){ //setter method
        this.pageNo = pageNo;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Book b = new Book();
        b.setPageNo(100);
        System.out.println(b.getPageNo());

    }
}
