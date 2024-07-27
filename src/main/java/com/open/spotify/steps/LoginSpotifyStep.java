package com.open.spotify.steps;

import com.open.spotify.pageObjects.HomeSpotifayPage;
import com.open.spotify.pageObjects.LoginSpotifyPage;
import com.open.spotify.pageObjects.SesionSpotifyPage;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Map;

import static com.open.spotify.utils.CallData.extractTo;

public class LoginSpotifyStep {
   LoginSpotifyPage loginSpotifyPage;


    @Step("Escribir Credenciales")
    public void escribirCrdenciales(){
        ArrayList<Map<String, String>> datos = extractTo();

        WaitUntil.the(loginSpotifyPage.getTxtUser(), WebElementStateMatchers.isVisible());
        loginSpotifyPage.getDriver().findElement( loginSpotifyPage.getTxtUser()).sendKeys(datos.get(0).get("user"));
        loginSpotifyPage.getDriver().findElement( loginSpotifyPage.getTxtClave()).sendKeys(datos.get(0).get("clave"));

    }
    @Step("click login")
    public void clickInputCredenciales(){
       WaitUntil.the(loginSpotifyPage.getBtnLogeo(), WebElementStateMatchers.isVisible());
        loginSpotifyPage.getDriver().findElement(loginSpotifyPage.getBtnLogeo()).click();
        while(loginSpotifyPage.isElementVisible(loginSpotifyPage.getMsnError())){
            loginSpotifyPage.getDriver().navigate().refresh();
            System.out.println("Fallo la consulta en el servidor");
            escribirCrdenciales();
            loginSpotifyPage.getDriver().findElement(loginSpotifyPage.getBtnLogeo()).click();
        }
    }

}
