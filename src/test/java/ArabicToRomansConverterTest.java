import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class ArabicToRomansConverterTest {

    ArabicToRomansConverter arabicToRomansConverter = new ArabicToRomansConverter();

    @ParameterizedTest
    @MethodSource("fromArabicNumerals")
    void convert1ToRomanNumerals(int number, String roman) {
        assertThat(arabicToRomansConverter.toRomanNumerals(number)).isEqualTo(roman);
    }

    private static Stream<Arguments> fromArabicNumerals() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X"),
                Arguments.of(40, "XL"),
                Arguments.of(50, "L"),
                Arguments.of(90, "XC"),
                Arguments.of(100, "C"),
                Arguments.of(400, "CD"),
                Arguments.of(500, "D"),
                Arguments.of(900, "CM"),
                Arguments.of(1000, "M"),
                Arguments.of(6, "VI"),
                Arguments.of(8, "VIII"),
                Arguments.of(11, "XI"),
                Arguments.of(49, "XLIX"),
                Arguments.of(63, "LXIII"),
                Arguments.of(999, "CMXCIX"),
                Arguments.of(1548, "MDXLVIII"),
                Arguments.of(3000, "MMM")
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void failNumbersOutOfRange(int number) {
        assertThatThrownBy(() -> {
            arabicToRomansConverter.toRomanNumerals(number);
        });
    }

}