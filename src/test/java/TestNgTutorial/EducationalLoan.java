package TestNgTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EducationalLoan {

    @BeforeClass
    public void BfC(){
        System.out.println("Before class executed, executes only once this class runs");
    }

    @Test(groups = "Smoke Test")
    public void EL10I(){
        System.out.println("Inside Educational Loan of 10% interest");
    }

    @Test
    public void EL15I(){
        System.out.println("Inside Educational Loan of 15% interest");
    }

    @Test(groups = "Smoke Test")
    public void el20I(){
        System.out.println("Inside educational Loan of 20% interest");
    }

    @Test(groups = "Smoke Test")
    public void el25I(){
        System.out.println("Inside educational Loan of 25% interest");
    }

    @AfterClass
    public void AfC(){
        System.out.println("After class executed, executes only once this class runs");
    }
}
