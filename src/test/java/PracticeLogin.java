

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;



import java.util.concurrent.TimeUnit;

public class PracticeLogin {
    WebDriver chromeDriver;

    @Before
    public void abrirDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void hacerbusqueda() throws InterruptedException {
        chromeDriver.get("http://automationpractice.com//index.php");
        chromeDriver.manage().window().maximize();
        WebElement btnContact = chromeDriver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]"));
        Miscellaneous.highLight(btnContact, chromeDriver);
        btnContact.click();


        WebElement oldStyleMenu = chromeDriver.findElement(By.xpath("//select[@id='id_contact']"));
        Miscellaneous.highLight(oldStyleMenu, chromeDriver);
        oldStyleMenu.click();

        Thread.sleep(2000);
        WebElement txtEmail = chromeDriver.findElement (By.xpath ("//input[@id='email']"));
        Miscellaneous.highLight(txtEmail,chromeDriver);
        txtEmail.sendKeys("karibocc@gmail.com");

        Thread.sleep(2000);
        WebElement txtorder = chromeDriver.findElement (By.xpath ("//input[@id='id_order']"));
        Miscellaneous.highLight(txtorder,chromeDriver);
        txtorder.sendKeys("Prueba de automatización");

        Thread.sleep(2000);
        WebElement txtmessage = chromeDriver.findElement (By.xpath ("//textarea[@id='message']"));
        Miscellaneous.highLight(txtmessage,chromeDriver);
        txtmessage.sendKeys("Esta es un reto de la prueba de automatización");

        Thread.sleep(2000);
        WebElement btnEnviar = chromeDriver.findElement (By.xpath ("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]"));
        Miscellaneous.highLight(btnEnviar,chromeDriver);
        btnEnviar.click();
        chromeDriver.close ();
    }
}
