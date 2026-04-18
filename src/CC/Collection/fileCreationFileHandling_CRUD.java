package CC.Collection;

import java.io.*;

public class fileCreationFileHandling_CRUD {
    public static void main(String[] args) {

        //Creation of the file:
        try{
            File fl=new File("newFile4.txt");
            fl.createNewFile();
            System.out.println("file created successfully");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        //write inside the file
        try{
            FileWriter fw=new FileWriter("newFile4.txt");
            fw.write("विद्या ददाति विनयं, विनयाद् याति पात्रताम्।\n" +
                    "पात्रत्वाद्धनमाप्नोति, धनाद्धर्मं ततः सुखम्॥ ");
            fw.close();// close karna yaha imp the, iske bina file me write opration nahi hua thaa...
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Read from the file
        try(BufferedReader br=new BufferedReader(new FileReader("newFile4.txt"))){
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //delete a file as well:
        try {
            File fl=new File("newFile2.txt");
            fl.createNewFile();
            if(fl.delete()){ // delete() method return the boolean.
                System.out.println(fl.getName()+" deleted successfully...");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
