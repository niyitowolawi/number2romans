public class ArabicToRomansConverter {

    public String toRomanNumerals(int number){

        StringBuilder romans = new StringBuilder();
        for(int i = 0; i < number; i++){
            romans.append("I");
        }
        return romans.toString();
    }
}
