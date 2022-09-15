import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных - это коробка
        int[] numbers = new int[5];
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
