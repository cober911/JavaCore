package Seminar4.zadanie2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Product {
    private static String[] products= {"Машинка", "Мяч", "Планшет", "Телефон"};
    private String productName;
    private Integer productCost;

    public Product(String name, Integer cost) {
        this.productName = name;
        this.productCost = cost;
    }

    public Product() {
    }


    public String getProductName() {
        return productName;
    }

    public Integer getProductCost() {
        return productCost;
    }

    public static ArrayList<Product> generationItems(int count) throws exceeption.ProductException{
        ArrayList<Product> productList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            try {
                System.out.printf("Введите имя %d Продукта(Машинка, Мяч, Планшет, Телефон): ", i+1);
                String product = scanner.nextLine();
                if (Arrays.asList(products).contains(product)){
                    Integer cost = (int) (Math.random() * 4_0);
                    productList.add(new Product(product, cost));
                    sb.append(productList.get(i).toString() + "\n");
                } else throw new exceeption.ProductException("Передан несуществующий товар");
//                System.out.println(sb);
            }catch (exceeption.ProductException e){
                System.out.println(e.getMessage());
            }

        }
        System.out.println(sb);
        return productList;
    }

    @Override
    public String toString() {
        return "product= " + productName +  ", cost=" + productCost;
    }
}
