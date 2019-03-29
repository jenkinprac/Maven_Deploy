import static org.junit.Assert.assertEquals; 
import org.junit.Test;
 
public class MyViewTest {
 @Test
    public void testEvenOddNumber(){
        MyEvenOdd meo = new MyEvenOdd();
        assertEquals("10 is a even number", true, meo.isEvenNumber(10));
    }
}

class MyEvenOdd {
 
    public boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
}
