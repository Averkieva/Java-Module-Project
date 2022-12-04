public class correctWriting {
    public static String WritingRub(int countOfRub){
        String str;
        if (countOfRub % 10 > 1 && countOfRub % 10 <=4)
            str = "рубля";
        else if (countOfRub % 10 == 1)
            str = "рубль";
        else
            str = "рублей";
        return str;
    }
}
