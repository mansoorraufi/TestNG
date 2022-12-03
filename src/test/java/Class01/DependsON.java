package Class01;

import org.testng.annotations.Test;

public class DependsON {
    @Test
    public void Login(){
        System.out.println(6/0);
    }

    @Test(dependsOnMethods = {"Login"}) // if the first test case is executed then it will be executed
    // if its not run then it will ignore testing,
    public void DashBoardVerification(){
        System.out.println("After login im verifying the dashboard page");
    }
}
