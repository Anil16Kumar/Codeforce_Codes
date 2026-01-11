package Strings;

@SuppressWarnings("removal")
public class demoGC {

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }

    public static void main(String[] args) {
        demoGC demo = new demoGC();
        demo = null;
        System.gc();
    }
}
