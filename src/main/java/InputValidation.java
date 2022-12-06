import java.util.Scanner;

public class InputValidation {
    public static int askCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек нужно разделить счет?");
        int countOfPeople;
        while(true){//бесконечный цикл для того, чтобы программа попросила ввести снова количество людей
            if(scanner.hasNextInt()==false){//проверка на целое
                System.out.println("Ожидалось число. Try again!");
                scanner.next();
            }
            else{
                countOfPeople = scanner.nextInt();
                if(countOfPeople <= 1)
                    System.out.println("Ожидалось больше 1 человека. Попробуйте еще раз!");
                else
                    break;
            }
        }
        return countOfPeople;
    }
}
