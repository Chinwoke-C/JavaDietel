package hugeInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HugeInterTest {
HugeInter hugeInter;

@BeforeEach
    public void setUp(){
    hugeInter = new HugeInter();
    }
    @Test
    public void parseIntTest(){
        String number = "12345";
        hugeInter.parse(number);
        int [] array = HugeInter.getNewArray();
        assertEquals(1,array[0]);
        assertEquals(2,array[1]);
        assertEquals(3, array[2]);
        assertEquals(4, array[3]);
        assertEquals (5, array[4]);
        System.out.println(Arrays.toString(array));
    }
    @Test
    public void toStringMethodTest(){
        String number = "5";
        hugeInter.parse(number);
        assertEquals(number, hugeInter.toString());
    }
    @Test
    public void testAddMethod(){
        String num1 = "23";
        String num2 = "23";
        hugeInter.parse(num1);
        assertEquals(46, hugeInter.add(num2));

    }


