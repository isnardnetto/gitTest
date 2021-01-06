package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import suport.Web;

import java.util.concurrent.TimeUnit;


public class FluxoBasico {
    private WebDriver navegador;
    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test

    @After
    public void tearDown(){
         navegador.quit();
    }
}
