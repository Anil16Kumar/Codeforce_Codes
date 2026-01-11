package oops.Inharitance;

interface parent {
    default void parentMethod() {
        System.out.println("method from PARENT class method...");
    }
}

class child implements parent {
    @Override
    public void parentMethod() {
        System.out.println("method from CHILD class...");
    }
}

public class defaultInInheritance {
    public static void main(String[] args) {
        parent c = new child();
        c.parentMethod();

    }
}
