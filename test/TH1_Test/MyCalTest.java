package TH1_Test;

import TH1.MyCal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalTest {

    private MyCal cal;

    @BeforeEach
    void setUp() {
        cal = new MyCal();
    }

    @AfterEach
    void tearDown() {
        cal = null;
    }

    @Test
    void testAdd() {
        float a = 3.5f;
        float b = 2.2f;
        float expected = 5.7f;
        assertEquals(expected, cal.add(a,b));
    }

    @Test
    void testSub() {
        float a = 5.5f;
        float b = 2.2f;
        float expected = 3.3f;
        assertEquals(expected, cal.sub(a,b));
    }

    @Test
    void testMul() {
        float a = 3.5f;
        float b = 2;
        float expected = 7;
        assertEquals(expected, cal.mul(a,b));
    }

    @Test
    void testDiv() {
        float a = 20.5f;
        float b = 5;
        float expected = 4.1f;
        assertEquals(expected, cal.div(a,b));
    }

    @Test
    void testMin() {
        float a = 5.9f;
        float b = 2.4f;
        float expected = 2.4f;
        assertEquals(expected, cal.min(a,b));
    }

    @Test
    void testMax() {
        float a = 5.9f;
        float b = 2.4f;
        float expected = 5.9f;
        assertEquals(expected, cal.max(a,b));
    }
}