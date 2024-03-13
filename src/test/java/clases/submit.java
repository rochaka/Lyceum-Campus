package clases;

import org.openqa.selenium.By;

import java.io.IOException;

import static Setup_The_Browsers.Setupbrowser.driver;

public class submit {
    public void Submit() throws InterruptedException, IOException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[6]/div[1]")).click();

        Thread.sleep(10000);

    }


}
