import java.util.Scanner;
public class Main {
    public static int intInput() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                break;
            } else {
                System.out.println("Error type!");
                scanner.next();
            }
        }
        return input;
    }


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Введите числитель первой дроби: ");
        int n1 = intInput();
        System.out.println("Введите знаменатель первой дроби:");

        int d1 = intInput();
        while (d1 == 0) {
            System.out.println("Error!");
            d1 = intInput();

        }


        Fraction firstNum = new Fraction(n1, d1);

        System.out.println("Введите числитель второй дроби:");
        int n2 = intInput();
        System.out.println("Введите знаменатель второй дроби:");
        int d2 = intInput();
        if(d2 ==0) {
            System.out.println("Error!");
            d2 = intInput();
        }
        else{
            System.out.println("Ваша дробь:" + n2 + "/" + d2 );

        }



        Fraction secondNum = new Fraction(n2, d2);


        Fraction res = firstNum.add(secondNum);
        Fraction res2 = firstNum.sub(secondNum);
        Fraction res3 = secondNum.multy(firstNum);
        Fraction res4 = firstNum.div(secondNum);
        Fraction res5 = res.sub(firstNum, secondNum);
        Fraction res6 = res.add(firstNum, secondNum);
        Fraction res7 = res.multy(firstNum, secondNum);
        Fraction res8 = res.div(firstNum, secondNum);


        System.out.println("Сумма дробей первым способом:" + res.toString());
        System.out.println("Разность дробей первым способом::" + res2.toString());
        System.out.println("Умножение дробей первым способом::" + res3.toString());
        System.out.println("Деление дробей первым способом::" + res4.toString());
        System.out.println("Разность дробей вторым способом:" + res5.toString());
        System.out.println("Сумма дробей вторым способом:" + res6.toString());
        System.out.println("Умножение дробей вторым способом::" + res7.toString());
        System.out.println("Деление дробей вторым способом::" + res8.toString());

    }
}