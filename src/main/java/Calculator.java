import java.util.Scanner;

public class Calculator {
    public static double calcul(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название товара");
        String nameOfProduct = scanner.nextLine();
        double costOfProduct = checkPrice();
        double sum = 0.0;
        sum += costOfProduct;
        String outMess = String.format("\nДобавленные товары: \n" + nameOfProduct + "    %.2f", costOfProduct)+ " " + CorrectWriting.writingRub((int)Math.floor(costOfProduct));
        System.out.println("Все добавлено. Введите Завершить для окончания сессии либо любой другой символ для продолжения");
        while(true){
            if (scanner.next().equalsIgnoreCase("Завершить")) {//игнор регистра
                System.out.println(outMess);
                break;
        }
            else{
                System.out.println("Введите название товара");
                scanner.nextLine();
                nameOfProduct = scanner.nextLine();
                costOfProduct = checkPrice();
                sum += costOfProduct;
                outMess = String.format("\nДобавленные товары: \n" + nameOfProduct + "    %.2f", costOfProduct) + " " + CorrectWriting.writingRub((int)Math.floor(costOfProduct));
                System.out.println("Все добавлено. Введите Завершить для окончания сессии либо любой другой символ для продолжения");
            }


    }
        return sum;
    }
    public static double checkPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость товара в формате 00,00 руб, коп");
        double costOfProduct;
        while(scanner.hasNextDouble() == false){
            System.out.println("Введите стоимость товара в формате 00,00 руб, коп, попробуйте еще раз");
            scanner.next();
        }
        costOfProduct = scanner.nextDouble();
        while(costOfProduct <= 0){
            System.out.println("Ожидается стоимость товара положительная");
            costOfProduct = scanner.nextDouble();
        }
        return costOfProduct;
    }
}
