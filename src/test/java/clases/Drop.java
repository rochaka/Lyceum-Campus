package clases;

import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Drop {
    public void Massage() throws InterruptedException, IOException {

        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/div[2]/div[2]/ul/li[7]/a")).click();
        String filePath = "User_data/Contact_us"; // Replace with the path to your userdata.txt file

        // Read data from the file and store it in a list

        // Read data from the file and store it in a list
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys(userData.get(0));

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys(userData.get(1));

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys(userData.get(2));

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[5]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[5]/div[1]/input[1]")).sendKeys(userData.get(3));

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[6]/div[1]/textarea[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[6]/div[1]/textarea[1]")).sendKeys(userData.get(4));

    }
}

