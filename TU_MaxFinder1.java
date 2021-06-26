import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MaxFinder1 {
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
}
