package TestNgTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingParameters {

    @Test
    @Parameters({"username","password"})
    public void dp1(String username, String password){
        System.out.println("DP1");
        System.out.println("Login Username is : "+username+" and password is : "+password);
    }


}
