package CC.Collection;

import java.io.*;

public class pracfile2 {
    public static void main(String[] args) {

        String fileName="pracFile.txt";

        //Create File
        try{
            File file=new File(fileName);
            if(file.createNewFile()){
                System.out.println("file created successfully...");
            }else{
                System.out.println("file already exist");
            }
        }catch (IOException exp){
            exp.printStackTrace();
        }

        //Write content inside a file
        try(FileWriter fileWriter=new FileWriter(fileName)){
            fileWriter.write("some text for writing inside the file..");
            //If exception occurs before close() → resource leak
        }catch (IOException exp){
            exp.printStackTrace();
        }


        //Read from the file
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException exp){
            System.out.println("Error while reading file: " + exp.getMessage());
        }


        //Delete file
        try{
            File file=new File("todeletefilecreated.txt");
            file.createNewFile();
            if (file.exists()) {
                if (file.delete()) {
                    System.out.println("Deleted successfully");
                } else {
                    System.out.println("Failed to delete");
                }
            } else {
                System.out.println("File not found");
            }
        }catch (IOException exp){
            System.out.println("Error occurred while deleting the file "+exp.getMessage());
        }

    }
}
