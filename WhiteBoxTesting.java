import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhiteBoxTesting {
    @Test
    public void testCalculate1() {
        assertEquals("Invalid input", BMI.calculateBMI(0, 0));
    }

    @Test
    public void testCalculate2() {
        assertEquals("Thiếu cân", BMI.calculateBMI(40,1.70));
    }

    @Test
    public void testCalculate3() {
        assertEquals("Bình thường", BMI.calculateBMI(60,1.70));
    }

    @Test
    public void testCalculate4() {
        assertEquals("Thừa cân", BMI.calculateBMI(70,1.70));
    }

    @Test
    public void testCalculate5() {
        assertEquals("Béo phì", BMI.calculateBMI(100,1.70));
    }
}
