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


        boolean asalMi = true;

        if (number > 1) {

            for (i = 2; i < number; i++) {

                if (number % i == 0) {

                    asalMi = false;

                    break;
                }
            }
            if (asalMi) System.out.println("Sayi asaldir");
            else System.out.println("sayi asal degil ");

        } else System.out.println(number + " asal degil");


        if (number % 2 == 0) {

            System.out.println("sayi cift");

        } else System.out.println("Sayi tek");


        isOddPrimeFibonacci();
    }

    public static boolean[] isOddPrimeFibonacci() {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter number : ");
        int number = scan.nextInt();

        boolean[] typeNumber = new boolean[3];


        //
        if (number % 2 != 0) typeNumber[0] = true;


        //
        if (number > 1) {
            int point = 0;
            for (int i = 3; i < number; i++) {
                if (number % i == 0) {
                    point++;
                }
            }
            if (point == 0 || number == 2) typeNumber[1] = true;
        }

        //
        int firstNumber = 0;
        int secondNumber = 1;
        int fibonacci;
        for (int i = 1; i <= number; i++) {

            fibonacci = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonacci;

            if (number == fibonacci) typeNumber[2] = true;
        }

        System.out.println("isOdd : " + typeNumber[0] + " isPrime : " + typeNumber[1] + " isFibonacci :" + typeNumber[2]);
        return typeNumber;
    }
}
