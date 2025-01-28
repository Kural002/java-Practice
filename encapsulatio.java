
class Human{
    private String name ;
    private  int age ;

    public  Human(){  //Default constructor
        name = "kaccie";
        age = 22;
    }

    public  Human(String name , int age){ // parameterized constructor
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return  name ;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}

public class encapsulatio {
    public static void main(String[] args) {
        Human child = new Human();
        Human child2 = new Human("kural" , 23);

        // child.setName("kural");
        // child.setAge(21);

        System.out.println(child.getName() + ":" + child.getAge());        
        System.out.println(child2.getName() + ":" + child2.getAge());        

    }
}
