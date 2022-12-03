package Class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotations {
    @Test
    public void AfirstTestCase(){
        System.out.println("I'm the first Test Case");
    }
    @Test
    public void BsecondTestCase(){
        System.out.println("I'm the Second Test Case");
    }

    @Test
    public void ThirdTestCase(){
        System.out.println("I'm the third Test Case");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Im a before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Im an After Method");
    }
}
