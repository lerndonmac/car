import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        List<Larry> array = new ArrayList<Larry>();
        System.out.println("введите марку");
        String mark = scan.nextLine();
        System.out.println("введите кол-во");
        int koll = scan.nextInt();
        System.out.println("введите вес");
        int weight = scan.nextInt();
        System.out.println("введите мощьность");
        int power = scan.nextInt();
        System.out.println("введите грузоподъёмность");
        int lift = scan.nextInt();


        for (int i = 0; i < koll; i++) {
            array.add(new Larry(weight,power,mark,lift));
        }
        for (int i = 0; i < koll; i++) {
        System.out.println(array.get(i).toString()+"\n");}
    }
}
