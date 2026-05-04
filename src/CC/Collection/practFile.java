package CC.Collection;

import java.io.*;

public class practFile {
    public static void main(String[] args) {
        //create file
        try{
            File f1=new File("newFile5.txt");
            f1.createNewFile();
            System.out.println("file is created successfully..");
        }catch (IOException e){
            e.printStackTrace();
        }

        //write inside the file
        try{
            FileWriter fw=new FileWriter("newFile5.txt");
            fw.write("these are the exceptions that are checked at COMPILE time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using the throws keyword.\n" +
                    "Example: SQLException, IOException, Interrupted Exception\n");
            System.out.println("write operation performed successfully..");
            fw.close();
        }catch (IOException exp){
            exp.printStackTrace();
        }

        //read the lines from file..
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("newFile5.txt"))){
            System.out.println("text from file:");
            while(bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }
        }catch (IOException exp){
            exp.printStackTrace();
        }

        //delete file
        try{
            File fc=new File("toDeleteFile.txt");
            fc.createNewFile();
            if(fc.delete()){
                System.out.println("file deleted successfully..");
            }
        }catch (IOException exp){
            exp.printStackTrace();
        }

    }
}
