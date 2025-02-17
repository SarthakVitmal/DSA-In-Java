/*
Compiler binding the call based on argument
    a. if exact method is found, bind the call.
    b. if exact method not found, perform "implicit typecasting" till it reaches to bind.
    c. upon implicit typecasting still if the call can't be bind, it would result in "Compilation Error".
    d. Explicit typecasting in not allowed.
 */
package OoPs;
class Add{
    void add(int a,int b){
        System.out.println("int-int argument");
    }
    void add(float a,float b){
        System.out.println("float-float argument");
    }
    void add(double a,double b){
        System.out.println("double-double argument");
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Add a = new Add();
        a.add(10,20);
        a.add(10.0f,20.0f);
        a.add(10.0,20.0);
        a.add('a','b');
        a.add(2L,7L);
    }
}
