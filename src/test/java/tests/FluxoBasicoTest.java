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


public class FluxoBasicoTest {
    private WebDriver navegador;
    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void testUsuarioFirstPage(){
        navegador.findElement(By.linkText("Sign in")).click();
    }

    @Test
    public void testUsuarioLoginPage(){
        navegador.findElement(By.linkText("Sign in")).click(); // tentei colocar no before e deu ruim !!! so p esse teste

        navegador.findElement(By.id("login_field")).sendKeys("engisnard@gmail.com");
        navegador.findElement(By.id("password")).sendKeys("aras2119");

        navegador.findElement(By.className("btn-primary")).click();

        WebElement alert = navegador.findElement(By.className("btn"));
        String textoNoAlert = alert.getText();
        assertEquals("New",textoNoAlert);
    }

    @Test
    public void testUsuarioValidandoUserNameIncorretoOuSenha(){
        navegador.findElement(By.linkText("Sign in")).click(); // tentei colocar no before e deu ruim !!! so p esse teste

        navegador.findElement(By.id("login_field")).sendKeys("engisnard@gmail.com");
        navegador.findElement(By.id("password")).sendKeys("a1ras2119");

        navegador.findElement(By.className("btn-primary")).click();
        WebElement alert = navegador.findElement(By.id("js-flash-container"));
        String textoNoAlert = alert.getText();
        assertEquals("Incorrect username or password.",textoNoAlert);
    }

    @Test
    public void testUsuarioSignOut(){
        navegador.findElement(By.linkText("Sign in")).click();

        navegador.findElement(By.id("login_field")).sendKeys("engisnard@gmail.com");
        navegador.findElement(By.id("password")).sendKeys("aras2119");

        navegador.findElement(By.className("btn-primary")).click();
        navegador.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary")).click();//melhorar xpath

        navegador.findElement(By.className("dropdown-signout")).click();

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement alert = navegador.findElement(By.className("btn-mktg-fluid"));
        String textoNoAlert = alert.getText();
        assertEquals("Sign up for GitHub",textoNoAlert);
    }

    @After
    public void tearDown(){
         navegador.quit();
    }
}
