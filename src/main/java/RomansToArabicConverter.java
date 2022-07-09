import java.util.HashMap;
import java.util.Map;

public class RomansToArabicConverter {

    private final static Map<String, Integer> romansToNumbersMap = new HashMap();

    private static final int MINIMUM_NUMBER = 1;
    private static final int MAXMUM_NUMBER = 3000;

    static{
        romansToNumbersMap.put("I", 1);
        romansToNumbersMap.put("IV", 4);
        romansToNumbersMap.put("V", 5);
        romansToNumbersMap.put("IX",9);
        romansToNumbersMap.put("X", 10);
        romansToNumbersMap.put("XL", 40);
        romansToNumbersMap.put("L", 50);
        romansToNumbersMap.put("XC", 90);
        romansToNumbersMap.put("C", 100);
        romansToNumbersMap.put("CD", 400);
        romansToNumbersMap.put("D", 500);
        romansToNumbersMap.put("CM", 900);
        romansToNumbersMap.put("M", 1000);
    }

    public int toArabicNumerals(String roman){
        roman = roman.toUpperCase();
        if(romansToNumbersMap.containsKey(roman)){
            return romansToNumbersMap.get(roman);
        }

        int number;
        String first2Chars = roman.substring(0,2);
        String remainingChars;

        if(romansToNumbersMap.containsKey(first2Chars)){
            number = romansToNumbersMap.get(first2Chars);
            remainingChars = roman.substring(2);
        }else{
            number = romansToNumbersMap.get(Character.toString(roman.charAt(0)));
            remainingChars = roman.substring(1);
        }

        number += toArabicNumerals(remainingChars);

        if(number < MINIMUM_NUMBER || number > MAXMUM_NUMBER){
            throw new RuntimeException("Input number is out of range. Only 1 - 3,000 supported");
        }

        return number;
    }
}
