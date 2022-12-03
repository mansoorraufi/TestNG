package Class01;

import org.testng.annotations.Test;

public class EnableDisable {
    @Test(enabled = false)
    public void Atest(){
        System.out.println("i am A test");
    }

    @Test
    public  void BTest(){
        System.out.println("i am B test");
    }
    @Test(enabled = false)
    public  void CTest(){
        System.out.println("i am C test");
    }
}
