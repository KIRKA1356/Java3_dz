import java.util.ArrayList;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sr = 0;


        for (int i = 0; i < 5; i++) {
            arr.add(rand.nextInt(0, 100));
            if (arr.get(i) < min) min = arr.get(i);
            if (arr.get(i) > max) max = arr.get(i);
            sr = sr + arr.get(i);
        }
        sr = sr / arr.size();
        System.out.print("Задан список: ");
        System.out.println(arr);
        System.out.print("Минимальное число: ");
        System.out.println(min);
        System.out.print("Максимальное число: ");
        System.out.println(max);
        System.out.print("Среднее значение: ");
        System.out.println(sr);
    }
}
