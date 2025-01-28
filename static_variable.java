

class Mobile{
    static  String Brand;
    int Price;
    String Model ;

   
    public  Mobile(){
        Brand = " ";
        Price = 56565;
        System.out.println("constructor");
    }
    public  void show(){
        System.out.println(Brand +" "+ Model +" "+ Price);
    }

    static {
        Brand = "Iphone";   
        System.out.println("Static block");
    }
//     public static  void show1(Mobile obj){
//         System.out.println(Brand +" "+ obj.Model +" "+ obj.Price);
//     }
}

public class static_variable {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.Brand = "apple";
        m1.Price = 100000;
        m1.Model = "IPhone XII";

        // Mobile m2 = new Mobile();
        // m2.Brand = "Redmi";
        // m2.Price = 10000;
        // m2.Model = "Redmi Note 7";

        // Mobile .Brand = "samsung";

        // m1.show();
        // m2.show();
        // Mobile.show1(m1);
    }
    
}
