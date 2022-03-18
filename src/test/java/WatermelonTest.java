import static org.junit.Assert.*;
import org.junit.Test;

public class WatermelonTest {
    @Test
    public void Test_Watermelon(){
        String res = Watermelon.Divide_Melon(2);
        System.out.println("Weight is: "+Integer.toString(2)+", The Result is: "+res);
        assertEquals("NO", res);
        for(int i=1;i<=100;i+=2){
            String result = Watermelon.Divide_Melon(i);
            System.out.println("Weight is: "+Integer.toString(i)+", The Result is: "+result);
            assertEquals("NO", result);
        }
        for(int i=4;i<=100;i+=2){
            String result = Watermelon.Divide_Melon(i);
            System.out.println("Weight is: "+Integer.toString(i)+", The Result is: "+result);
            assertEquals("YES", result);
        }
    }
}