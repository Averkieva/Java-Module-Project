public class CorrectWriting {
    public static String writingRub(int countOfRub){
        String str;
        if (countOfRub % 10 > 1 && countOfRub % 10 <=4)
            str = "рубля";
        else if (countOfRub % 10 == 1)
            str = "рубль";
        else if (countOfRub % 100 > 4 && countOfRub % 100 <= 20)
            str = "рублей";
        else
            str = "руюлей";
        return str;
    }
}
