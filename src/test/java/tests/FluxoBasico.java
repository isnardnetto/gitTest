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
    public void testUsuarioFirstPage(){
        navegador.findElement(By.linkText("Sign in")).click();//colocar esse comando no before ? pq posso fazer
        // conta nova ai como se comportar ? pensar...
    }

    @Test
    public void testUsuarioLoginPage(){
        navegador.findElement(By.linkText("Sign in")).click();
        navegador.findElement(By.id("login_field")).sendKeys("engisnard@gmail.com");
        navegador.findElement(By.id("password")).sendKeys("aras2119");
        navegador.findElement(By.className("btn-primary")).click();
    }

    @Test
    public void testUsuarioValidandoUserNameIncorretoOuSenha(){
        navegador.findElement(By.linkText("Sign in")).click();
        navegador.findElement(By.className("btn-primary")).click();
        WebElement alert = navegador.findElement(By.id("js-flash-container"));
        String textoNoAlert = alert.getText();
        assertEquals("Incorrect username or password.",textoNoAlert);
    }

    @After
    public void tearDown(){
         //navegador.quit();
    }
}
