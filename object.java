public class object {
    public static void main(String[] args) {

        calculator cal = new calculator();

        int result = cal.calci(1,12);

        System.out.println(result);
        
    }
}
class calculator {
    
    public int calci (int num1 , int num2){
        
        return  num1 + num2;
    }
}
