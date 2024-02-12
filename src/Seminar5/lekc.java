package Seminar5;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class lekc {
    public static void main(String[] args) {

//        File folder = new File(".");
//        for (File file:folder.listFiles()) {
//            System.out.println(file.getName());
//        }

        FileSystem fileSystem = FileSystems.getDefault();
        for (Path rootdir: fileSystem.getRootDirectories()) {
            System.out.println(rootdir.toString());
        }
    }

}
