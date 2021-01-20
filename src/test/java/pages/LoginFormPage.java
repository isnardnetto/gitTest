package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage {
    private WebDriver navegador;

    public LoginFormPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public LoginFormPage typeLogin(String login){
        navegador.findElement(By.id("login_field")).sendKeys(login);

        return this;
    }

    public LoginFormPage typeSenha(String senha){
        navegador.findElement(By.id("password")).sendKeys(senha);

        return this;
    }

    public HomePage clickSingButton(){
        navegador.findElement(By.className("btn-primary")).click();

        return new HomePage(navegador);
    }
}
