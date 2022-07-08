import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArabicToRomansConverterTest {

    ArabicToRomansConverter arabicToRomansConverter = new ArabicToRomansConverter();

    @Test
    void convert1ToRomanNumerals() {
        assertThat(arabicToRomansConverter.toRomanNumerals(1)).isEqualTo("I");
    }

    @Test
    void convert2ToRomanNumerals() {
        assertThat(arabicToRomansConverter.toRomanNumerals(2)).isEqualTo("II");
    }
}