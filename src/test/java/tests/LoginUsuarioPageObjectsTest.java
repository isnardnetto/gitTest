package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suport.Web;

public class LoginUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void testUsuarioLoginPage(){
        new LoginPage(navegador)
                .clickSignIn()
                .LoginResumido("engisnard@gmail.com","aras2119")
                .clickSingButton()
                ;

    }
    @Test
    public void testUsuarioValidandoUserNameIncorretoOuSenha(){
        new LoginPage(navegador)
            .clickSignIn()
            .LoginResumido("engggisna@gmail.com","321456dd44d")
            .clickSingButton() //luiz
            ;
    }

    @Test
    public void testUsuarioSignOut(){
        new LoginPage(navegador)
            .clickSignIn()
            .LoginResumido("engisnard@gmail.com","aras2119")
            .clickSingButton()
            .logout()
            ;
        
    }

    @After
    public void tearDown(){
        //navegador.quit();
        }
    }

