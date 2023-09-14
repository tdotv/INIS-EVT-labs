import java.util.Scanner;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        MyTime time = new MyTime(3661, 1, 2);
        MyTime time1 = new MyTime(1000);
        time.PrintSeconds();
        time1.PrintSeconds();
        System.out.println(time.CompareSeconds(time1));

        Scanner value = new Scanner(System.in);
        Scanner amount = new Scanner(System.in);
        Hashtable<Scanner, Scanner> hashtable = new Hashtable<>();
        hashtable.put(value, amount);

    }
}
