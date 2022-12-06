import java.util.Scanner;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор!");
        int count = InputValidation.askCount();
        System.out.println("Количество людей: " + count + "штук");
        double sum = Calculator.calcul();
        System.out.println(String.format("Сумма = " + "%.2f", sum)+ " " + CorrectWriting.writingRub((int)Math.floor(sum)));
        System.out.println(String.format("Сумма на одну персону = " + "%.2f", (sum/count))+ " " +CorrectWriting.writingRub((int)Math.floor(sum/count)));
    }

}
