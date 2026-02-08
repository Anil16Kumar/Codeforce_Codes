package CC;

import java.util.Scanner;
import java.util.stream.IntStream;

public class GymAndPersonalTrainer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        IntStream.range(0,scanner.nextInt()).forEach(i->{
            int gymPrice=scanner.nextInt();
            int pPprice=scanner.nextInt();
            int budget=scanner.nextInt();
            System.out.println(gymPrice+pPprice<=budget?"2":gymPrice<=budget?"1":"0");
        });
    }
}
