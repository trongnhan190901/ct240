package TH1_Test;

import TH1.FirstDeEqual;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstDeEqualTest {

    private final String vsn = "PT vo so nghiem";
    private final String vn = "PT vo nghiem";
    private FirstDeEqual firstDeEqual;

    @BeforeEach
    void setUp() {
        firstDeEqual = new FirstDeEqual(0,4);
    }

    @AfterEach
    void tearDown() {
        firstDeEqual =  null;
    }

    @Test
    void ptvn() {
        String expected = this.vn;
        assertEquals(expected, firstDeEqual.result());
    }

    @Test
    void ptvsn(){
        String expected = this.vsn;
        firstDeEqual.setB(0);
        assertEquals(expected, firstDeEqual.result());
    }
    @Test
    void ptcn(){
        String expected = "-5.0";
        firstDeEqual.setA(4);
        firstDeEqual.setB(20);
        assertEquals(expected, firstDeEqual.result());
    }
}