import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MaxFinderGenerics {
    @Test
    void WhenIntegerShouldReturnMax() {
        Integer int1=1,int2=4,int3=3;
        Integer maxnumber =  UC1MaxFinder.findMax(int1,int2,int3);
        Assertions.assertEquals(4,maxnumber);
    }

    @Test
    void WhenIntegerShouldReturnMax1() {
        Integer int1=4,int2=3,int3=1;
        Integer maxnumber =  UC1MaxFinder.findMax(int1,int2,int3);
        Assertions.assertEquals(4,maxnumber);
    }

    @Test
    void WhenIntegerShouldReturnMax2() {
        Integer int1=3,int2=1,int3=4;
        Integer maxnumber =  UC1MaxFinder.findMax(int1,int2,int3);
        Assertions.assertEquals(4,maxnumber);
    }
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
    @Test
    void WhenFloatShouldReturnMax() {
        Float float1=1.5f,float2=3.5f,float3=4.5f;
        Float maxnumber= UC2MaxFinder.findMax1(float1,float2,float3);
        Assertions.assertEquals(4.5f,maxnumber);
    }

    @Test
    void WhenFloatShouldReturnMax1() {
        Float float1=4.5f,float2=1.5f,float3=3.5f;
        Float maxnumber= UC2MaxFinder.findMax1(float1,float2,float3);
        Assertions.assertEquals(4.5f,maxnumber);
    }

    @Test
    void WhenFloatShouldReturnMax2() {
        Float float1=3.5f,float2=4.5f,float3=1.5f;
        Float maxnumber= UC2MaxFinder.findMax1(float1,float2,float3);
        Assertions.assertEquals(4.5f,maxnumber);
    }
}
