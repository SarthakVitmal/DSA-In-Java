package OoPs;

class Student{
    private int rollNo;
    private String name;
    private String address;
    //Setter Methods
    public void setrollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    //Getter Methods
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}

class Employee{
    private String eid;
    private String ename;
    private int eage;
    private String eaddress;

    //Setter Methods
    public void setEid(String eid){
        this.eid = eid;
    }
    public void setEname(String ename){
        this.ename = ename;
    }
    public void setEage(int eage){
        this.eage = eage;
    }
    public void setEaddress(String eaddress){
        this.eaddress = eaddress;
    }
    //Getter methods
    public String getEid(){
        return eid;
    }
    public String getEname(){
        return ename;
    }
    public String getEaddress(){
        return eaddress;
    }
    public int getEage(){
        return eage;
    }
}
public class getterAndSetter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setrollNo(1);
        s1.setName("Sarthak Vitmal");
        s1.setAddress("New Panvel");
        System.out.println("------------------------------------------------");
        System.out.println("Student Roll No : "+s1.getRollNo());
        System.out.println("Student Name : "+s1.getName());
        System.out.println("Student Address : "+s1.getAddress());
        System.out.println("------------------------------------------------");
        Employee e1 = new Employee();
        e1.setEid("101");
        e1.setEname("Yashraj Choudhary");
        e1.setEage(20);
        e1.setEaddress("Thane");
        System.out.println("Employee Id : "+e1.getEid());
        System.out.println("Employee Name : "+e1.getEname());
        System.out.println("Employee Age : "+e1.getEage());
        System.out.println("Employee Address : "+e1.getEaddress());
        System.out.println("------------------------------------------------");



    }
}
