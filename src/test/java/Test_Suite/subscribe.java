package Test_Suite;

import Setup_The_Browsers.Setupbrowser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static Setup_The_Browsers.Setupbrowser.driver;

public class subscribe {
    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();

    }
    @Test ( priority = 2 )
    void subscriber()throws IOException {
        driver.findElement(By.xpath("/html[1]/body[1]/footer[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/footer[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("test@test.com");


        driver.findElement(By.xpath("/html[1]/body[1]/footer[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]")).click();

        driver.quit();
    }


}