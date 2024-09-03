import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        file read
        String pathName = "Resources/sample.txt";
        File file = new File(pathName);
        FileReader fileReader = null;
        try {
//            opening the stream
            fileReader = new FileReader(file);
//            read
            int data=0;
            while (data!=-1){

            data=fileReader.read(); // reading ascii value
            char character=(char)data;
            System.out.print(character);
//            closing the steam
                /* count the number of character in file
                * count the number of word in file*/
            }
            fileReader.close();


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IOException");
        }



//        }finally {
//            try {
//                fileReader.close();
//            } catch (IOException e) {
//                System.out.println("IOException");
//            }catch (NullPointerException e){
//                System.out.println("FileReaer not found");
//            }
//        }
    }
}
