import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        String str = "aasss,assdfaasdqweaaa,asdaaaas,adsasdasd,aaa,asdghnzzzzzza,zzzzxxxaaaa,zxvvxvxcvxcv,xcvxv.fsdfsdfeweqwejhsdf sf sdfs a a sdfsdf sdf";
        List<Integer> positions = new ArrayList<>();
        char[] stringAsChar = str.toCharArray();
        int symbolQuantity = 0;
        for (int i = 0; i < stringAsChar.length - 1; i++) {
            if (Character.toString(stringAsChar[i]).equals("a")) {
                positions.add(i);
                symbolQuantity++;
            }
        }
        System.out.println("Кол-во символов “a” - " + symbolQuantity + ", индексы символа “a” в строке - " + positions.toString() + ";");
    }
}
