//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(rand.nextInt(0,10));
        }
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0 && arr.get(i) != 0) {
                arr.remove(i);
                i--;
            }

        }
        System.out.println(arr);
    }
}
