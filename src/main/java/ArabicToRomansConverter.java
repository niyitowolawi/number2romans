import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ArabicToRomansConverter {

    private final static TreeMap<Integer, String> numbersToRomansMap = new TreeMap();

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
        int floorKey = numbersToRomansMap.floorKey(number);
        if(floorKey == number){
            return numbersToRomansMap.get(number);
        }

        StringBuilder romans = new StringBuilder();
        romans.append(numbersToRomansMap.get(floorKey)).append(toRomanNumerals(number - floorKey));
        return  romans.toString();
    }
}
