package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver navegador;

    public HomePage(WebDriver navegador){
        this.navegador = navegador;
    }
    public LoginPage logout(){
        navegador.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary")).click();//melhorar xpath
        navegador.findElement(By.className("dropdown-signout")).click();

        return new LoginPage(navegador);
    }
}
