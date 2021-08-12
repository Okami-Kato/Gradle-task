import com.epam.util.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("10"));
        Assertions.assertTrue(StringUtils.isPositiveNumber("10.231231"));

        Assertions.assertFalse(StringUtils.isPositiveNumber("0"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("-12"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("-12.231231"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("12.231asd231"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("12.231 231"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("12,23131"));
    }
}