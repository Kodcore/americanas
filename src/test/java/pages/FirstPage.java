package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPage extends BasePage{
    public FirstPage(WebDriver navegador) {
        super(navegador);
    }

    public ReturnPage pesquisarProduto(){
        navegador.findElement(By.id("h_search-input")).sendKeys("harley davison");
        navegador.findElement(By.id("h_search-btn")).click();
        return new ReturnPage(navegador);
    }
}
