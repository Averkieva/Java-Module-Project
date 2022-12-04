import java.util.Scanner;

public class inputValidation {
    public static int askCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек нужно разделить счет?");
        int countOfPeople;
        while(1==1){//бесконечный цикл для того, чтобы программа попросила ввести снова количество людей
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
