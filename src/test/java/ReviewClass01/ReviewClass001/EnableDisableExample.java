package ReviewClass01.ReviewClass001;

import org.testng.annotations.Test;

public class EnableDisableExample {
    @Test
    public void testOne(){
        System.out.println("My first test");
    }

    @Test(enabled = false)
    public void secondTest(){
        System.out.println("My second test");
    }
}
