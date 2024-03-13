package clases;

import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Setup_The_Browsers.Setupbrowser.driver;

public class inquiries_fill {
    public void fillForm() throws InterruptedException, IOException {
        Thread.sleep(3000);

        String filePath = "Username_password"; // Replace with the path to your userdata.txt file

        // Read data from the file and store it in a list

        // Read data from the file and store it in a list
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys(userData.get(0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys(userData.get(1));
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys(userData.get(2));


    }



}
