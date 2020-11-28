package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstMavenClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchButton.click();
        String arananKelime = "Samsung headphones";
        searchButton.sendKeys(arananKelime+ Keys.ENTER);
        WebElement aramaSonucSayisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(aramaSonucSayisi.getText());
        WebElement ilkUrun = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
        ilkUrun.click(); 





    }
}
