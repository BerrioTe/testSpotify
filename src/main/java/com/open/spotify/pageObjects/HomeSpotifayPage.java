package com.open.spotify.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
public class HomeSpotifayPage extends PageObject {

    private final By btnLogin= By.xpath("//button[@data-testid='login-button']");

    public By getBtnLogin() {
        return btnLogin;
    }


}
