import java.util.ArrayList;

public class Polymorphsm {
    public static void main(String[] args){


        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Car c1 = new Car();

        ArrayList<Vehicle> myList = new ArrayList<>();
        myList.add(v1);
        myList.add(v2);
        myList.add(c1);

        Vehicle[] vArray = new Vehicle[3];
        vArray[0]=v1;
        vArray[1]=v2;
        vArray[2]=c1;

        addItems(c1);


    }

    private static void addItems(Vehicle v) {
        System.out.println(v+ "has been added!");
    }


}
