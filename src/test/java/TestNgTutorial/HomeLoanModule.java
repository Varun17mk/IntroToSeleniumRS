package TestNgTutorial;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeLoanModule {

    @BeforeMethod
    public void BfM(){
        System.out.println("Before Method of HomeLoanModule, executes before every method of class is called.");
    }
    @Test
    public void HL10I(){
        System.out.println("Inside Home Loan of 10% interest");
    }

    @Test
    public void HL15I(){
        System.out.println("Inside Home Loan of 15% interest");
    }
}
