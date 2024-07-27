package com.open.spotify.steps;

import com.open.spotify.pageObjects.HomeSpotifayPage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.ArrayList;
import java.util.Map;

import static com.open.spotify.utils.CallData.extractTo;

public class HomeSpotifyStep {
    ArrayList<Map<String, String>> datos = extractTo();
    @Page
    HomeSpotifayPage homeSpotifayPage;
    @Step("User open url Spotify")
    public void openBrowser(){
        homeSpotifayPage.openUrl(datos.get(0).get("url"));
    }
    @Step("Click Login")
    public void clickLogin(){
        WaitUntil.the(homeSpotifayPage.getBtnLogin(), WebElementStateMatchers.isClickable());
        homeSpotifayPage.getDriver().findElement(homeSpotifayPage.getBtnLogin()).click();
    }
}
