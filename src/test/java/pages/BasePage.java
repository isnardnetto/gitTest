package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver navegador;

    public BasePage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public String validacaoHomePage() {
        return navegador.findElement(By.className("btn")).getText();
    }
}

