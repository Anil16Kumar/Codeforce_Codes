package CC.Collection;

import java.io.*;

public class filePracticeCLeanCode {
    public static void main(String[] args) {
        String fileName="NewFile8.txt";
        try{

            File file=new File(fileName);
            if(file.createNewFile()){
                System.out.println("file created successfully.");
            }else{
                System.out.println("file already exists");
            }

            try(FileWriter fileWriter=new FileWriter(fileName)){
                fileWriter.write("some more random texts..");
            }

            try(BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName))){
                String line;
                while((line=bufferedReader.readLine())!=null){
                    System.out.println(line);
                }
            }

            if(file.exists()){
                if(file.delete()){
                    System.out.println("file deleted successfully..");
                }else{
                    System.out.println("failed to delete");
                }
            }else{
                System.out.println("file not found.");
            }

        }catch(IOException exp){
            System.out.println(exp.getMessage());
        }
    }
}
