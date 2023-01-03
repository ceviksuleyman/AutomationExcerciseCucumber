import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

      /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    0-1-1-2-3-5-8-13-21-34....
    */

    public static void main(String[] args) {

        List<Integer> fibonacciList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int number = sc.nextInt();

        fibonacciList.add(0);
        fibonacciList.add(1);

        int i = 1; // while sarti olusturmak icin kullandik

        if (number <= 1) {

            System.out.println("Daha buyuk sayilar gir !");

        } else {

            while (fibonacciList.get(i) < number) {  // fibonacci elemanlari sayidan kucuk oldugu surece loop calisir

                fibonacciList.add(fibonacciList.get(i) + fibonacciList.get(i - 1));

                i++;
            }

            //fibonacciList.remove(fibonacciList.size()-1);
            //System.out.println("fibonacciList = " + fibonacciList);
        }


        int sonIndextekiEleman = fibonacciList.size() - 1;

        if (fibonacciList.get(sonIndextekiEleman) > number) {

            fibonacciList.remove(sonIndextekiEleman);

            System.out.println("fibonacciList girdiginiz sayi listte yoktur = " + fibonacciList);

        } else {

            System.out.println("Girdigin sayi fibonaccilist'inde var : " + fibonacciList);
        }

    }
}
