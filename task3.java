/*
 * Реализовать простой калькулятор 
 */
import java.util.Scanner;

 public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double x = in.nextInt();
        Scanner sin = new Scanner(System.in);
        System.out.print("Введите операнд (+, -, *, /): ");
        String op = sin.nextLine();
        System.out.print("Введите второе число: ");
        double y = in.nextInt();
        double rez = 0;
        if (op.equals("+")) {
            rez = x + y;
        } 
        if (op.equals("-")) {
            rez = x - y;
        }
        if (op.equals("*")) {
            rez = x * y;
        } 
        if (op.equals("/")) {
            rez = x / y;
        }
        System.out.println("Ответ:");
        System.out.println(x + " "+op+ " " + y + " = " + rez);
    }
}
