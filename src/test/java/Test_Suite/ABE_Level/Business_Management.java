package Test_Suite.ABE_Level;

import Setup_The_Browsers.Setupbrowser;
import clases.inquiries_fill;
import clases.submit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Business_Management {
    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }


    @Test ( priority = 2 )
    void inquire() throws IOException, InterruptedException {
        inquiries_fill loginTest = new inquiries_fill();
        loginTest.fillForm(); // Call the fillForm() method once
        // Call the fillForm() method again
    }

    @Test ( priority = 3 )
    void select() throws IOException, InterruptedException {
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/select[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"form-select\"]/option[4]")).click();
    }

    @Test ( priority = 4 )
    void select_2() throws IOException, InterruptedException {
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[5]/div[1]/select[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"subSelection\"]/option[2]")).click();
    }


    @Test ( priority = 5 )
    void Submit() throws IOException, InterruptedException {
        submit loginTest = new submit();
        loginTest.Submit(); // Call the fillForm() method once


    }
}
