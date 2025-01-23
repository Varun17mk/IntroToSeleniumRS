package TestNgTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class personalLoanModule {

    @Test(groups = "Smoke Test")
    public void PL10I(){
        System.out.println("Inside Personal Loan of 10% interest");
    }

    @Test(groups = "Smoke Test")
    public void PL15I(){
        System.out.println("Inside Personal Loan of 15% interest");
    }

    @AfterSuite
    public void Afs(){
        System.out.println("Executes very last and only once when this xml file runs");
    }
}


