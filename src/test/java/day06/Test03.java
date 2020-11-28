package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test03 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement ilkUrun =driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        String ilkUrunIsmi = ilkUrun.getText();
        driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
        driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
        WebElement sepettekiUrun = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String sepettekiUrunIsmi = sepettekiUrun.getText();
        if (ilkUrunIsmi.equals(sepettekiUrunIsmi)){
            System.out.println("Alisveris Sepeti Testi PASS");
        }else{
            System.out.println("Alisveris Sepeti Testi FAILED");
            System.out.println("Sectigin urun ile sepetteki urun ayni degil");
        }
        driver.close();

    }
}
