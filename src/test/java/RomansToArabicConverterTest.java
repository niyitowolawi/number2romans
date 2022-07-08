import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RomansToArabicConverterTest {

    RomansToArabicConverter romansToArabicConverter = new RomansToArabicConverter();

    @ParameterizedTest
    @MethodSource("fromRomanNumerals")
    void convert1ToRomanNumerals(String roman, int number) {
        assertThat(romansToArabicConverter.toArabicNumerals(roman)).isEqualTo(number);
    }

    private static Stream<Arguments> fromRomanNumerals() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("i", 1),
                Arguments.of("IV", 4),
                Arguments.of("V", 5),
                Arguments.of("IX", 9),
                Arguments.of("X", 10),
                Arguments.of("XL", 40),
                Arguments.of("L", 50),
                Arguments.of("XC", 90),
                Arguments.of("C", 100),
                Arguments.of("CD", 400),
                Arguments.of("D", 500),
                Arguments.of("CM", 900),
                Arguments.of("M", 1000),
                Arguments.of("II", 2)
/*
                Arguments.of(3, "III"),
                Arguments.of(6, "VI"),
                Arguments.of(8, "VIII"),
                Arguments.of(11, "XI"),
                Arguments.of(49, "XLIX"),
                Arguments.of(63, "LXIII"),
                Arguments.of(999, "CMXCIX"),
                Arguments.of(1548, "MDXLVIII"),
                Arguments.of(3000, "MMM")*/
        );
    }

}