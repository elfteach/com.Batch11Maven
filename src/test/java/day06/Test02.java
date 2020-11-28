package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com");
        WebElement signInButton = driver.findElement(By.xpath("//button[@id='signin_button']"));
        signInButton.click();
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='user_login']"));
        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='user_password']"));
        String userName = "username";
        String password = "password";
        loginButton.sendKeys(userName);
        passwordButton.sendKeys(password);
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.xpath("//li[@id='pay_bills_tab']")).click();







    }

}
