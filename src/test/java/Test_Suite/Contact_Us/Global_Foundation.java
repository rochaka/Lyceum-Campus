package Test_Suite.Contact_Us;

import Setup_The_Browsers.Setupbrowser;
import clases.Drop;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Global_Foundation {
    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }
    @Test ( priority = 2 )
    void Massage() throws IOException,InterruptedException {

            Drop loginTest = new Drop();
            loginTest.Massage();
    }
    @Test ( priority = 3 )
    void change() throws IOException,InterruptedException
    {
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/select[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"form-select\"]/option[2]")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[6]/div[1]/textarea[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"mycontactForm\"]/div[2]/div[7]/input")).click();



    }



}
