import java.util.TreeMap;

public class ArabicToRomansConverter {

    private final static TreeMap<Integer, String> numbersToRomansMap = new TreeMap();

    private static final int MINIMUM_NUMBER = 1;
    private static final int MAXMUM_NUMBER = 3000;

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

        if(number < MINIMUM_NUMBER || number > MAXMUM_NUMBER){
            throw new RuntimeException("Input number is out of range. Only 1 - 3,000 supported");
        }

        int floorKey = numbersToRomansMap.floorKey(number);
        if(floorKey == number){
            return numbersToRomansMap.get(number);
        }

        StringBuilder romans = new StringBuilder();
        romans.append(numbersToRomansMap.get(floorKey)).append(toRomanNumerals(number - floorKey));
        return  romans.toString();
    }
}
