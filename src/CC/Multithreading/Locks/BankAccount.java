package CC.Multithreading.Locks;

public class BankAccount {

    private int balance=100;

    public synchronized void withdrawAmount(int Amount){
        if(balance>=Amount){
            System.out.println(Thread.currentThread().getName()+" processing of withdraw started "+Amount );
            try {
                System.out.println(Thread.currentThread().getName()+" withdraw is processing.");
                Thread.sleep(3000);// yaha jab ek thread aaega aapna kaam karega to wo aapna pura time lega, that perticular thread don't care about other threads,
                // yaha humne manually 3 second pass kiya hai, but value agar 1 hr hojae to baaki ke threads ko bhi wait karna hi padega kyuki humne yaha
                // synchronized keyword ka use kiya hai jo lock laga ke baaitha hua hai(Intrinsic locks), that is why we need to learn about lock(explicit locks) or manual locks.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();//ye ek good practice hai taki baaki threads ko paata chal jae ki ye thread interrupt ho gaya hai..
            }
            balance-=Amount;
            System.out.println(Thread.currentThread().getName()+" withdraw completed, Remaning balance: "+balance);
        }
        else {
            System.out.println(Thread.currentThread().getName()+" insufficent balance");
        }
    }

}
