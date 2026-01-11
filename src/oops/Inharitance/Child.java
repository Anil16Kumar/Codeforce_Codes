package oops.Inharitance;

public class Child extends Parent{

    int x=20;

    public void childOwnMethod(){
        System.out.println("Inside child method..");
    }

    public void commonMethod(){
        System.out.println("common method changes in child class....");
    }

    public void parentVariableCallFromChild(){
        System.out.println(super.x);
    }
}
