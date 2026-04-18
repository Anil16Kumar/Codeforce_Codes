package CC.Collection;

import java.io.*;

public class PracFileHandling {
    public static void main(String[] args) {
        String fileName="codeCreatedFile.txt";

        //create file
        try{
            File file=new File(fileName);
            if(file.createNewFile()){
                System.out.println("file created successfully..");
            }else{
                System.out.println("file already exists");
            }
        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }

        //write inside the file
        try(FileWriter fileWriter=new FileWriter(fileName)){
            fileWriter.write("some random text inside the file from code.");
        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }

        //Read file
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName))){
            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }

        //delete file
        try {
            File file=new File("deleteFile.txt");
            file.createNewFile();
            if(file.exists()){
                if(file.delete()){
                    System.out.println("file deleted successfully..");
                }else{
                    System.out.println("failed to delete the file..");
                }
            }else{
                System.out.println("file does not exists");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
