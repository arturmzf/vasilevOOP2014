package chapter11;

import java.io.*;

// MyStringInput
public class Program11dot02 {

    public static void main(String[] args) throws IOException {

        String str = "Ваш заказ: ";
        String s;
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Что-то желаете?");
        s = br.readLine();

        while(!s.equalsIgnoreCase("Нет")) {

            count++;
            str = str + "\n" + count + ": " + s.toLowerCase();
            System.out.println(str + "\n Что-то ещё?");
            s = br.readLine();

        }

        System.out.println("Спасибо! Ваш заказ принят!");

    }

}
