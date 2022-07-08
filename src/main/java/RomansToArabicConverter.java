import java.util.TreeMap;

public class RomansToArabicConverter {

    private final static TreeMap<String, Integer> romansToNumbersMap = new TreeMap();

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
        if(romansToNumbersMap.containsKey(roman)){
            return romansToNumbersMap.get(roman);
        }
        return 0;
    }
}
