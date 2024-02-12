package Seminar4.zadanie2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Client {
    private static String[] firstNames = {"Дмитрий", "Владимир"};
    private String firstName;
    private Integer age;
    private String phone;

    public Client(String firstName, Integer age, String phone) {
        this.firstName = firstName;
        this.age = age;
        this.phone = phone;
    }

    public Client() {
    }

    public Integer getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public static ArrayList<Client> generationClients(int count) throws exceeption.ClientException {
        ArrayList<Client> clientList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            try {
                System.out.printf("Введите имя %d клиента(Дмитрий или Владимир): ", i+1);
                String firstName = scanner.nextLine();
                if (Arrays.asList(firstNames).contains(firstName)) {
                    String phone = "+7927" + (int) (Math.random() * 900_000);
                    clientList.add(new Client(firstName, random.nextInt(11) + 20, phone));
                    sb.append(clientList.get(i).toString()).append("\n");
                } else throw new exceeption.ClientException("В метод передан не существующий пользователь.");
//                    System.out.println(sb);
            }catch (exceeption.ClientException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(sb);
        return clientList;
    }
    @Override
    public String toString () {
        return "firstName= " + firstName + ", age=" + age + ", phone= " + phone;
    }
}
