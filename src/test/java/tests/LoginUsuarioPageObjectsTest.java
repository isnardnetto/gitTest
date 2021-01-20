package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import suport.Web;

public class LoginUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @After
    public void tearDown(){
        //navegador.quit();
        }
    }
}
