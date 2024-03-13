package Test_Suite.Foundation;

import Setup_The_Browsers.Setupbrowser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Secince {
    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }

    @Test ( priority = 2)
    void Shift() throws IOException, InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//header[contains(@class,'wrapper bg-soft-primary')]//a[contains(@class,'dropdown-toggle mobile-hide')][normalize-space()='Programmes']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li/div/div[1]/ul/li[2]/a")).click();

    }

    @Test ( priority = 3)
    void Fill() throws IOException, InterruptedException {
        Thread.sleep(3000);
        //name
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[1]/input")).sendKeys("Secince");
        //email
        driver.findElement(By.xpath("//*[@id=\"myForm-globpopup\"]/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"myForm-globpopup\"]/div[2]/input")).sendKeys("Secince@test.com");
        //contact
        driver.findElement(By.xpath("//*[@id=\"myForm-globpopup\"]/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"myForm-globpopup\"]/div[3]/input")).sendKeys("0336652500");

        //Submit
        driver.findElement(By.xpath("//*[@id=\"myForm-globpopup\"]/div[5]/div")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"onloadModal\"]/div/div/div[1]/button")).click();


    }
}
