

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int namber=0;

        do {
            System.out.println("Введите количество персон:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка. Пожалуйста, введите целое число.");
                scanner.next();
            }
            namber = scanner.nextInt();

            if (namber <= 0) {
                System.out.println("Ошибка. Пожалуйста, введите число больше 0.");
            } else if (namber == 1) {
                System.out.println("Нет смысла в расчетах для одного человека. Пожалуйста, введите другое значение.");
            }

        } while (namber <= 0 || namber == 1);

        System.out.println("Вы ввели корректное количество персон: " + namber);


        class RubleUtil {

            public static String formatRubles(double amount) {
                String result;
                double rubles = amount % 10;

                if (rubles == 1 && amount != 11) {
                    result = "рубль";
                } else if (rubles >= 2 && rubles <= 4 && !(amount >= 12 && amount <= 14)) {
                    result = "рубля";
                } else if (rubles >= 5 || (rubles >= 10 && rubles <= 20)) {
                    result = "рублей";
                } else {
                    result = "рублей";
                }

                return result;
            }
        }

        RubleUtil rubleUtil = new RubleUtil();
        String rublesEnding = rubleUtil.formatRubles(namber);
        NamberPerson nPerson = new NamberPerson();
        nPerson.setPerson(namber);
        nPerson.isPerson();
        Calculator calculator = new Calculator();
        calculator.Xerson();


        System.out.println("Добавленные товары:");

        System.out.println("Общая сумма: " + String.format("%.2f", calculator.getTotalCoast()) + " " + rublesEnding);

        double individualPayment = calculator.getTotalCoast() / namber;
        String individualPaymentRubles = rubleUtil.formatRubles(individualPayment);
        System.out.println("Каждый человек должен заплатить: " + String.format("%.2f", individualPayment) + " " + individualPaymentRubles);
    }
}
//  Работу сдал Максим Грузинцев
