package com.example.fileRead.main;

import com.example.fileRead.io.ReadFileData;

import java.io.IOException;

public class MyMain {
    public static void main(String[] args) {
        ReadFileData readFileData = new ReadFileData();
        String fileName = "resources/sample.txt";
        try {
            StringBuilder line = readFileData.readData(fileName);
            System.out.println(line);
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }
}
