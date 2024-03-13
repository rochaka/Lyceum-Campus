package Setup_The_Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Setupbrowser {


    public static ChromeOptions options =new ChromeOptions();
    public static WebDriver driver = new ChromeDriver(options);

    @BeforeTest
    public void Setup_browser() throws IOException, InterruptedException {


        options.addArguments("--remote-allow-origins");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "src/test/resources/chromedriver.exe");

        String linkFilePath = "Change_Link"; // Replace with the path to your link.txt file

        // Read the testing link from the file
        BufferedReader linkReader = new BufferedReader(new FileReader(linkFilePath));
        String testingLink = linkReader.readLine();
        linkReader.close();

        driver.get(testingLink); // Use the testing link read from the file
        driver.manage().window().maximize();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='flex-row px-4 d-flex align-items-center']//a[@class='btn btn-green'][normalize-space()='Inquire Here']")).click();


    }

    public void Setupbrowse() {
    }

    public void inquire() {
    }
}