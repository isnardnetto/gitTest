package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public LoginPage logout(){
        navegador.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary")).click();//melhorar xpath
        navegador.findElement(By.className("dropdown-signout")).click();

        return new LoginPage(navegador);
    }
}
