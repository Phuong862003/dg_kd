import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilTest_b1 {
    MathUtil_b1 util = new MathUtil_b1();

    @Test
    void test1(){
        assertEquals(util.sum(1, 1), 2);
    }
    @Test
    void test2(){
        assertEquals(util.sum(1, 1), 3);
    }
    @Test
    void test3(){
        assertEquals(util.sum(1, 2), 2);
    }
}
