/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 
 * тр 5 = 1+2+3+4+5 
 * 5! = 1*2*3*4*5
 */
import java.util.Scanner;
 public class task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int rez = 0;
        for (int i = 1; i <= n; i++) {
            rez += i;            
        }
        System.out.println("Ответ: " + rez);
    }
}