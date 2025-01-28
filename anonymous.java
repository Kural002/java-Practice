


class Name {

     String humanName = "kaccie";

    public Name(){
        System.out.println(humanName);
    }

    public void show(){
        System.out.println(humanName + " is a parasite");
    }



}

public class anonymous {
    public static void main(String args[]){

        new Name().show();

    }
}
