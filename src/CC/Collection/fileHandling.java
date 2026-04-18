package CC.Collection;

import java.io.*;

public class fileHandling {
    public static void main(String[] args) {
        // streams: sequence of data, abstraction that java provide
        // java implements these within class hierarchy in java.io(input output) package

        //stream in java-> 1. byte stream(1.1 inputStream  1.2 outputStream) 2. character stream(2.1 reader  2.2 writer)
        //this byte stream is used to handle input and output bytes of data, like read an image want to read an .pdg file so it will contains binary data
        //and, character stream is like handing the characters unique code characters

        //any file name that are ending with inputStream or outputStream that is for byte data
        //wheather we are working with audio image or pdf we will be using input/output streams:

        //class outputStram:
        //Direct Known Subclasses:
        //ByteArrayOutputStream, FileOutputStream, FilterOutputStream, ObjectOutputStream, OutputStream, PipedOutputStream

        //class inputStream:
        //Direct Known Subclasses:
        //AudioInputStream, ByteArrayInputStream, FileInputStream, FilterInputStream, InputStream, ObjectInputStream, PipedInputStream, SequenceInputStream, StringBufferInputStream

        //------------------------
        //any file name that are ending with reader or writer that is for character data
        //wheater we are working with character data,
        //class reader:
        //Direct Known Subclasses:
        //BufferedReader, CharArrayReader, FilterReader, InputStreamReader, PipedReader, StringReader

        //class writer:
        //Direct Known Subclasses:
        //BufferedWriter, CharArrayWriter, FilterWriter, OutputStreamWriter, PipedWriter, PrintWriter, StringWriter

        //IOException: corrupted file, not able to read, file not found..etc..

        //pre-defined stream:
        //System.out -> console
        //System.in -> keyboard
        //System.error -> console
        // these are of type input stream, and since they are ending with stream so they all are byte streams

        //Q. take data in byte stream and print them in character stream:
        try (InputStreamReader isr=new InputStreamReader(System.in)){
            System.out.println("enter some number: ");
            int number=isr.read();// read() function use to return the number value
            while(isr.ready()){
                System.out.println((char) number);
                number=isr.read();
            }
            //isr.close();  -> but this is not compulsary after java 8, this things done autometically.
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Q. read the file
        try (FileReader fr=new FileReader("F:\\sample.txt")){
            int letter=fr.read();//  .read() function use to return the number value or ascci value
            while(fr.ready()){
                System.out.println((char) letter);//ek-ek karke saare files me rakhe character print hoga
                letter= fr.read();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // bufferReader: takes a character-input streams, so we cannot take input like system.in because system.in is of type byte stream,
        // so we need to convert this byte(Reader) stream to character-input streams so we convert them using InputStreamReader
        //BufferedReader buRe=new BufferedReader(new InputStreamReader(System.in));// we cannot write "System.in" inside the parameter
        // because it takes Reader type inside so we need to conver System.in(Character type)->Reader(Byte type) type using InputStreamReader
        // so here byte to char stream and then reading char stream
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("you typed: "+br.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        // similarly we can do it for files as well:
        try ( BufferedReader br1=new BufferedReader(new FileReader("F:\\sample.txt"))){
            while(br1.ready()){
                System.out.println(br1.readLine()); //ek line sab print ho jaega
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        //now lets see the OutputStream

        OutputStream os=System.out;
        //os.write("👉"); -> this is will be an error, range is exceeded

        try(OutputStreamWriter osw=new OutputStreamWriter(System.out) ){
            osw.write("atul kumar");
            osw.write(23);
            osw.write((int) 34.55f);
            osw.write('s');
            osw.write("\n");
            char[] cArr="hello world".toCharArray();
            osw.write(cArr);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //---file writer---

        try(FileWriter fw=new FileWriter("F:\\sample.txt")){
            fw.write("hello world!!!");// this over write everything written before...
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        // and in order to append in the file -> new FileWriter("F:\\sample.txt", true), write true as 2nd argument
        try(FileWriter fw=new FileWriter("F:\\sample.txt", true)){
            fw.write("my name is anil kumar");// this over write everything written before...
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //--Bufferwriter--
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\sample.txt"))){
            bw.write("write this from bufferedWriter");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //----------create a file----
        try{
            File fl=new File("newFile3.txt");
            fl.createNewFile();
            System.out.println("file created successfully..");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
