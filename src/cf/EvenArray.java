package cf;

import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t--!=0){
            int n=scanner.nextInt();
            int Arr[]=new int[n];
            int ec=0,oc=0;
            for(int i=0;i<n;i++){
                Arr[i]=scanner.nextInt();
                if(Arr[i]%2==0)
                    ec++;
                else
                    oc++;
            }

            int ae = (n % 2 == 0) ? n / 2 : n / 2 + 1;
            int ao = n / 2;

            if(ae==ec && ao==oc){
                int count=0;
                for(int i=0;i<n;i++)
                    if(Arr[i]%2!=i%2)
                        count++;

                System.out.println(count/2);
            }
            else{
                System.out.println("-1");
            }

        }
    }
}
