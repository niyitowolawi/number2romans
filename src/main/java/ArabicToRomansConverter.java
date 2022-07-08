import java.util.HashMap;
import java.util.Map;

public class ArabicToRomansConverter {

    private final static Map<Integer, String> numbersToRomansMap = new HashMap();

    static{
        numbersToRomansMap.put(1, "I");
        numbersToRomansMap.put(4, "IV");
        numbersToRomansMap.put(5, "V");
        numbersToRomansMap.put(9, "IX");
        numbersToRomansMap.put(10, "X");
        numbersToRomansMap.put(40, "XL");
        numbersToRomansMap.put(50, "L");
        numbersToRomansMap.put(90, "XC");
        numbersToRomansMap.put(100, "C");
        numbersToRomansMap.put(400, "CD");
        numbersToRomansMap.put(500, "D");
        numbersToRomansMap.put(900, "CM");
        numbersToRomansMap.put(1000, "M");
    }

    public String toRomanNumerals(int number){
        if(numbersToRomansMap.containsKey(number)){
            return numbersToRomansMap.get(number);
        }

        StringBuilder romans = new StringBuilder();

        for(int i = 0; i < number; i++){
            romans.append("I");
        }
        return romans.toString();
    }
}
