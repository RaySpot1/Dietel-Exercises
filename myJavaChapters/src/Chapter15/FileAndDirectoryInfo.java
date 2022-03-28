package Chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file or directory name: ");

        Path path = Paths.get(scanner.nextLine());

        if(Files.exists(path)){
            System.out.println(path.getFileName());
            System.out.println(Files.isDirectory(path) ? "Is Directory" : "Is Not" );
            System.out.println(path.isAbsolute() ? "Is Directory" : "Is Not");
            System.out.println(Files.getLastModifiedTime(path));
            System.out.println(Files.size(path));
            System.out.println(path);
            System.out.println(path.toAbsolutePath());
        }

        if(Files.isDirectory(path)){
            System.out.println("Directory contents: ");

            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

            for(Path p : directoryStream){
                System.out.println(p);
            }
        }

    }
}
