class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in b");
    }
    public  B(int n){
        super();
        System.out.println("in b int ");
    }

}

public class superclass {
    public static void main(String[] args) {
        B obj = new B(5);

    }
    
}
