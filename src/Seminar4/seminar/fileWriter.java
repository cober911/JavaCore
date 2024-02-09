package Seminar4.seminar;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public void newWrite(String login, String password) {
        try (FileWriter writer = new FileWriter("outLoginPass.txt", false)){
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
