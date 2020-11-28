package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.walmart.com/");      //https://www.walmart.com/ adresine git
        driver.manage().window().maximize();         //tam sayfa yap
        driver.navigate().refresh();                 //refresh yap
        String actualTitle = driver.getTitle();      //sayfa basliginin Save icerdigini kontrol et
        String arananKelimeTitle = "Save";
        if (actualTitle.contains(arananKelimeTitle)){
            System.out.println("Title testi PASS");
        }else{
            System.out.println("Title testi FAILED");
            System.out.println("Sayfa basligi \""+ arananKelimeTitle + "\" icermiyor.");
        }
        //sayfa basliginin "Walmart.com | Save Money.Live Better" esit mi diye bak
        String expectedTitle = "Walmart.com | Save Money.Live Better";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Walmart testi PASS");
        }else{
            System.out.println("Title Walmart Testi FAILED");
        }
        String actualURL = driver.getCurrentUrl();
        String arananKelime ="walmart.com";
        if (actualURL.contains(arananKelime)){
            System.out.println("URL testi PASS");
        }else{
            System.out.println("Url testi FAILED");
        }

        WebElement aramaButton = driver.findElement(By.xpath("//input[@id='global-search-input']"));
        String aranacakKelime = "Nutella";
        aramaButton.sendKeys(aranacakKelime+ Keys.ENTER);

        WebElement SonucYazisi = driver.findElement(By.className("result-summary-container"));
        System.out.println(aranacakKelime + " icin \""+ SonucYazisi.getText());

        driver.close();
    }
}
