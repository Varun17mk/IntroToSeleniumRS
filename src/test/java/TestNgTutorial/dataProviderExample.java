package TestNgTutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExample {

    @Test(dataProvider = "LoginCreds")
    public void dp1(String username, String password) {
        System.out.println("DP1");
        System.out.println("Login Username is : " + username + " and password is : " + password);

        if ((username.contentEquals("Username2")) && (password.contentEquals("Password2"))) {
            System.out.println("Hurray! Welcome");
        } else System.out.println("Oops! Try with different Credential");
    }


    @DataProvider(name = "LoginCreds")
    public Object[][] getData() {

        Object[][] creds = new Object[3][2];
        creds[0][0] = "Username1";
        creds[0][1] = "Password1";
        creds[1][0] = "Username2";
        creds[1][1] = "Password2";
        creds[2][0] = "Username3";
        creds[2][1] = "Password3";
        return creds;
    }


}
