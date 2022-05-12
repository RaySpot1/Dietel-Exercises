package Chapter15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreatingFile {
    public static void main(String[] args) {
//        createFile();
//        writeToFile();
//        readFromFile();
        deleteFile();
    }

    private static void createFile() {
        try{
            File file = new File("C:\\Users\\US CHIPS\\Desktop\\PracticeFolder.txt");
            if(file.createNewFile()){
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch(IOException e){
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }

    private static void writeToFile(){
        try{
            FileWriter writer = new FileWriter("PracticeFolder.txt");
            writer.write("Files in java can be tricky but its fun enough.");
            writer.close();
            System.out.println("Successfully wrote to file");
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    private static void readFromFile(){
        try{
            File file = new File("PracticeFolder.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    private static void deleteFile(){
        File file = new File("PracticeFolder.txt");
        if(file.delete()){
            System.out.println("Deleted the file: " + file.getName());
        } else{
            System.out.println("Failed to delete the file");
        }
    }
}
