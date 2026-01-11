package oops.Records;

record Car(String brand,int price){}


public class recordC {
    public static void main(String[] args) {

        Car c=new Car("BMW",2000000);

        System.out.println(c.brand());

    }
}
