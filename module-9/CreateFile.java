/*
* Nardos Gebremedhin
* 02/15/2025
* Module 9 Programing Assigment
*
* In this program I will be
*   creating a new file
*   write to the file and add 10 randomly generated numbers
*   each int has to be separated by space
*   reopen the file and read the data and display it
*
*/


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateFile {
    private static final String FILE_NAME = "data.file";

    public static void main(String[] args) {
        create();
        writeToFile();
        readFromFile();
    }
    // check to see if the file exists if not create the file
    public static void create(){
        try {
            File myFile = new File(FILE_NAME);
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // write to the file
    public static void writeToFile(){
        Random random = new Random();
        try  (FileWriter writer = new FileWriter(FILE_NAME, true)){
            for (int i = 0; i < 10; i++) {
                writer.write(random.nextInt(10) + " ");
            }
            System.out.println("10 random numbers written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

    }
        // reading the file and displaying the data
        public static void readFromFile(){
            try (FileReader reader = new FileReader(FILE_NAME)) {
                int character;
                System.out.println("Data from file:");
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }
                System.out.println();
            } catch (IOException e) {
                System.out.println("An error occurred while reading from the file.");
                e.printStackTrace();
            }
        }
}


