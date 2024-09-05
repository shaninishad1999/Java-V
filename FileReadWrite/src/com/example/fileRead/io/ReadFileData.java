package com.example.fileRead.io;

/* BufferReader class is used to read file character by character or
multiple character or whole line .
*
To read lines, given file we will use readLine() method of bufferReader class
*
ReadLine() method will return a string which contains the one-line form the file.
end of line is recognized by \n or in some cases by \r(carriage return).
ReadLine() method throw IOException
ReadLine() method will return null  if the end of the file (UF) end of the file reached
*
*
* */

import java.io.*;

public class ReadFileData {
    // define a method that reads the file and
    // return a StringBuilder which contains file data
    public StringBuilder readData(String fileName) throws FileNotFoundException, IOException {

        StringBuilder fileData = new StringBuilder();
        // reading the file data
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        //read line by line
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while (line != null) {
            line = bufferedReader.readLine();
            if (line != null) {
                fileData.append(line);
            }
        }
        return fileData;

    }
}
