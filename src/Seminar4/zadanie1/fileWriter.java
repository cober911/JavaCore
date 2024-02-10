package Seminar4.zadanie1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class fileWriter {

    public void newWrite(List<String> creds) {
        try (FileWriter writer = new FileWriter("src/Seminar4/zadanie1/outLoginPass.txt", false)){
            String login = "login: " + creds.get(0);
            String password = "password: " + creds.get(1);
            writer.write(login);
            writer.append('\n');
            writer.write(password);
            writer.append('\n');
            writer.flush();
            writer.close();
            }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
