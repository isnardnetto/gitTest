package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class BasePage {
    protected WebDriver navegador;

    public BasePage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public String validationHomePage(){
        return navegador.findElement(By.className("btn")).getText();
    }

    public String validationIncorrectText() {
        return navegador.findElement(By.id("js-flash-container")).getText();

    }

    public String validationSignOut(){
        return navegador.findElement(By.className("btn-mktg-fluid")).getText();
    }
}

