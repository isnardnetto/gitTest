package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import suport.Web;

import static org.junit.Assert.*;

public class LoginUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void testUsuarioLoginPage() {
        String validacaoHomePage = new LoginPage(navegador)
                .clickSignIn()
                .LoginResumido("oladipohouston599@gmail.com","oladipoHouston1991")
                .clickSingButton()
                .validationHomePage();

        assertEquals("New",validacaoHomePage);
    }
    @Test
    public void testUsuarioValidandoUserNameIncorretoOuSenha(){
        String incorrectText = new LoginPage(navegador)
            .clickSignIn()
            .LoginResumido("engisna@gmail.com","321456dd44d")
            .clickSingButton()
            .validationIncorrectText();
        assertEquals("Incorrect username or password.",incorrectText);
    }

    @Test
    public void testUsuarioSignOut(){
        new LoginPage(navegador)
            .clickSignIn()
            .LoginResumido("oladipohouston599@gmail.com","oladipoHouston1991")
            .clickSingButton()
            .logout();

    }

    @After
    public void tearDown(){
        navegador.quit();
        }
    }

