import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*method();
    }
    static void method(){
        System.out.println("Мадина");*/

        /*Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        method(a);
    }
    static String method (String a){
        System.out.println(a);
        return(a);*/



       /* Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a==1){
            bye();

        }else if (a==0){
            hello();
        }
    }
static void bye(){
    System.out.println("Жакшы барыныз");
}
static void hello(){
    System.out.println("Жакшы калыныз");*/


    /*Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    if (a==1){
        hello();
    }else if (a==0){
        bye();
    }
}
static void hello(){
    System.out.println("Привет");
}
static void bye(){
    System.out.println("пока");*/


        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        meth(a);
}
static int meth (int a ){
        int sum = a +5;
    System.out.println("Биз берген мааниге 5 ти кошунуз" + sum);
    return a; */



        /*int[] array = {1,2,3,4};
        arrayMath(array);
        }
        static int [] arrayMath (int [ ] mass){
            for (int i = 0; i < mass.length; i++) {
                System.out.print(mass[i]);
          }
         return mass;*/


        /*System.out.println("Как тебя зовут");
        hello();
    }
    static void hello () {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Hello my friend");*/


        /*System.out.println("Как тебя зовут?");
        hello();
        }
        static void hello(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
            System.out.println("Hello my friend" + a);
            hello();
            hello1();
            hello3();

        }
        static void hello1(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Сколько тебе лет?");
        String b = scanner.nextLine();
            System.out.println("не 16 лет" + b);
        }
        static void hello3(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Где ты проживаешь?");
            String c = scanner.nextLine();
            System.out.println("В Кочкор-Ате" + c);*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операции 1 это +, 2 это -, 3 это *, 4 это /");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == 1) {
            addition(b, c);

        } else if (a == 2) {
            subtraction(a, b);

        } else if (a == 3) {
            multiplication(a, b);

        } else if (a == 4) {
            division(a, b);
        }
    }
        static void addition(int a,int b){
        int sum = a + b;
            System.out.println(sum);
        }
        static void subtraction(int a,int b){
        int sum = a - b;
            System.out.println(sum);
        }
        static void multiplication (int a, int b ){
        int sum = a * b;
            System.out.println(sum);
        }
        static void division (int a, int b){
        int sum = a / b;
            System.out.println(sum);*/



        /*int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(printArray(array)));

    }


    public static int[] printArray(int[] arr) {
        Arrays.sort(arr);

        return (arr);*/



        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Операция +, -, *, /");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        num1 (a,b);
        num2 (a,b);
        num3 (a,b);
        num4 (a,b);
             }
             static int num1 (int a, int b ){
        int sum = a + b;
                 System.out.println("перация плюс:" + sum);
                 return sum;
             }
             static int num2 ( int a, int b){
        int sum = a - b;
                 System.out.println("Опрецая минус:" +sum);
                 return sum;
             }
             static int num3 (int a, int b ){
        int sum = a * b;
                 System.out.println("Операция умножение:" + sum);
                 return sum;
             }
             static int num4 (int a, int b){
        int sum = a / b;
                 System.out.println("Операция деление:" + sum);
                 return sum;*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите 1 или 2,3,4,5,6 для проверки студента ");
        int a = scanner.nextInt();
        if (a == 1) {
            madina(a);
        } else if (a==2) {
            meerim(a);
        } else if (a == 3) {
            nuriza(a);
        } else if (a == 4) {
            djiparisa(a);
        } else if (a == 5) {
            kairat(a);
        } else if (a == 6) {
            azamat(a);
        }
    }

    static int madina(int a) {
        System.out.println("Имя: Мадина\n" + "Возварст: 16 лет\n" + "Место проживния: Кочкор-Ата");
        return (a);
    }

    static int meerim(int a) {
        System.out.println("Имя: Меерим\n" + "Возвраст: 14 лет\n" + "есто проживания: Кочкор-Ата");
        return (a);
    }

    static int nuriza(int a) {
        System.out.println("Имя: Нуриза\n" + "Возвраст: 14 лет\n" + "Место проживания: Кочкор-Ата");
        return (a);
    }
    static int djiparisa(int a){
        System.out.println("Имя: Джыпариса\n" + "Возвраст: 42 лет\n" + "Место проживания:Кочкор-Ата");
        return(a);
    }
    static int kairat(int a){
        System.out.println("Имя:Кайрат\n" + "Вщзвраст: 16 лет\n" + "Место проживания:Кочкор-Ата");
        return(a);
    }
    static int azamat(int a){
        System.out.println("Имя:Азамат\n" + "Возвраст: 14 лет\n" + "Место проживания: Кочкор-Ата");
        return (a);*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввыберите валюту (USD,EYR,RUB) или для введите выход для завершения");
        int a = scanner.nextInt();
        }

        }





