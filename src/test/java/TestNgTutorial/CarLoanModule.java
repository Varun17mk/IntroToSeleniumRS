package TestNgTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoanModule {

    @BeforeSuite
    public void BFS() {
        System.out.println("Executes very first and only once when this xml file runs");
    }

    @BeforeTest
    public void BfT() {
        System.out.println("BeforeTest executed");
    }
    @AfterTest
    public void AfT() {
        System.out.println("AfterTest executed");
    }
    @Test(groups = "Smoke Test")
    public void WebLoginCarLoan() {
        System.out.println("Car loan through WebLogin");
    }

    @Test
    public void MobileLoginCarLoan() {
        System.out.println("Car loan through MobileLogin");
    }

    @Test(groups = "Smoke Test")
    public void APILoginCarLoan() {
        System.out.println("Car loan through APILogin");
    }

}
