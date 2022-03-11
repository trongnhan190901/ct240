package TH1_Test;

import TH1.SecondDeEqual;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondDeEqualTest {

    private String vn = "PT vo nghiem";
    private SecondDeEqual secondDeEqual;
    @BeforeEach
    void setUp() {
        secondDeEqual = new SecondDeEqual(2,6, 4);
    }

    @AfterEach
    void tearDown() {
        secondDeEqual = null;
    }

    @Test
    void pt2n() {
        String expected = "-1.0 , -2.0";
        assertEquals(expected, secondDeEqual.result2());
    }
    @Test
    void ptvn() {
        String expected = this.vn;
        secondDeEqual.setB(2);
        assertEquals(expected, secondDeEqual.result2());
    }
    @Test
    void ptnk(){
        String expected = "-1.0";
        secondDeEqual.setB(4);
        secondDeEqual.setC(2);
        assertEquals(expected,secondDeEqual.result2());
    }
    @Test
    void ptb1(){
        String expected = "-5.0";
        secondDeEqual.setA(0);
        secondDeEqual.setB(4);
        secondDeEqual.setC(20);
        assertEquals(expected,secondDeEqual.result2());
    }
}