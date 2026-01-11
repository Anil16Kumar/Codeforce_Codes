package oops.Inharitance;

public class parentChildClass {
    public static void main(String[] args) {

        Child c1=new Child();
        System.out.println(c1.x);
        c1.childOwnMethod();
        c1.commonMethod();
        c1.parentOwnMethod();
        c1.parentVariableCallFromChild();

 //      Child c2=new Parent();

        System.out.println("=========================");

        Parent p1=new Child();
        p1.commonMethod();
        p1.parentOwnMethod();
        //p1.childOwnMethod();

        System.out.println("=========================");

        Parent p2=new Parent();
        p2.parentOwnMethod();
        p2.commonMethod();






    }
}
