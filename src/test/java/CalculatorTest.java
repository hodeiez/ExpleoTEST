import com.hodei.expleo.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Hodei Eceiza
 * Date: 3/27/2021
 * Time: 23:27
 * Project: Expleo
 * Copyright: MIT
 */
public class CalculatorTest {
    Calculator c;
    @BeforeEach
    public void setUp(){ c=new Calculator();}
    @Test
    public void level1(){
        assertEquals(c.calculateLevel1("2+30"),32);
        assertEquals(c.calculateLevel1("2 * 3"),6);
        assertEquals(c.calculateLevel1("2 -3"),-1);
        assertEquals(c.calculateLevel1("2 / 3"),(double)2/3);
    }
    @Test
    public void level2(){
        assertEquals(c.calculateLevel2("2+30+4"),36);
        assertEquals(c.calculateLevel2("2 - 3 + 4 + 15"),18);
        assertEquals(c.calculateLevel2("2 * 3 * 4"),24);
        assertEquals(c.calculateLevel2("2 * 3 / 4 * 20"),30);
    }
    @Test
    public void level3(){
        assertEquals(c.calculateLevel3("2+3*40"),122);
        assertEquals(c.calculateLevel3("2 * 3 + 4"),10);
        assertEquals(c.calculateLevel3("2 / 3 + 4 -1"),3.666666666666667); //couldn't do (double)2/3 + 3
        assertEquals(c.calculateLevel3("2 - 3 * 4"),-10);
    }
}
