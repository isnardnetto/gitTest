package suport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\arquivos de programas\\Java\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("https://github.com/");
        navegador.manage().window().maximize();
        navegador.findElement(By.linkText("Sign in")).click();
        //navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return navegador;
    }

}
