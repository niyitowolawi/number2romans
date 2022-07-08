import java.util.HashMap;
import java.util.Map;

public class ArabicToRomansConverter {

    private final static Map<Integer, String> numbersToRomansMap = new HashMap();

    static{
        numbersToRomansMap.put(1, "I");
        numbersToRomansMap.put(4, "IV");
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
