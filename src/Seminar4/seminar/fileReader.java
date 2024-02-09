package Seminar4.seminar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class fileReader {
    public List<String> newRead() {
        List<String> creds = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Seminar4/seminar/inputLoginPass.txt"));
            String line = reader.readLine();
            while (line != null){
                int logint = line.indexOf("login");
                int pass = line.indexOf("password");
                if (logint !=-1) {
                    creds.add(line.split(":")[1].trim());
                }if (pass != -1) {
                    String passOUT = line.split(":")[1].trim();
                    creds.add(line.split(":")[1].trim());
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return creds;
    }

}
