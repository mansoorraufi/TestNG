package Class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 3)
    public void Atest(){
        System.out.println("Im A test");
    }

    @Test(priority = 1)
    public void Btest(){
        System.out.println("Im B test");
    }

    @Test(priority = 2)
    public void Ctest(){
        System.out.println("Im C test");
    }

    @Test // no priority
    public void Dtest(){
        System.out.println("Im D test"); // this will be printed first. Default is Zero
    }

    @Test // no priority 2nd and will be prnted first as it starts with A
    public void ABtest(){
        System.out.println("Im AB test"); //if multiple default method this will print [ A-Z ] alphabetically ascending
    }
}
