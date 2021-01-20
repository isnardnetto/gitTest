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
                .typeLogin("engisnard@gmail.com")//mudar
                .typeSenha("aras2119")//mudar
                .clickSingButton()
                ;

    }
    @Test
    public void testUsuarioValidandoUserNameIncorretoOuSenha(){

    }

    @Test
    public void testUsuarioSignOut(){
        
    }

    @After
    public void tearDown(){
        //navegador.quit();
        }
    }

