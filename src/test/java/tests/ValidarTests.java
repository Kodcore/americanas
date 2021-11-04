package tests;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.FirstPage;
import support.Web;

import static org.junit.Assert.assertEquals;

public class ValidarTests {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();

    }
   //@After
    public void tearDown(){
        navegador.quit();
    }
    @Test
    public void testValidarProdutoPesquisado(){
        String produtoPesquisado = new FirstPage(navegador)
                .pesquisarProduto()
                .produtoPesquisado();

       assertEquals("resultados para “harley davison”", produtoPesquisado);

    }

}
