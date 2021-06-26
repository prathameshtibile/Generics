import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author PRATHAMESH TIBILE
 * @since 26-6-21
 */
public class TU_MaxFinder3 {
    @Test
    void WhenStringShouldReturnMax() {
        String word1="Apple",word2="Banana",word3="Peach";
        String maxstring= UC3MaxFinder.findMax2(word1,word2,word3);
        Assertions.assertEquals("Peach",maxstring);
    }

    @Test
    void WhenStringShouldReturnMax1() {
        String word1="Banana",word2="Peach",word3="Apple";
        String maxstring= UC3MaxFinder.findMax2(word1,word2,word3);
        Assertions.assertEquals("Peach",maxstring);

    }

    @Test
    void WHenStringShouldReturnMax2() {
        String word1="Peach",word2="Apple",word3="Banana";
        String maxstring= UC3MaxFinder.findMax2(word1,word2,word3);
        Assertions.assertEquals("Peach",maxstring);
    }
}
