package com.open.spotify.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginSpotifyPage extends PageObject {
    private final By txtUser= By.id("login-username");
    private final By txtClave= By.id("login-password");
    private final By btnLogeo= By.id("login-button");
    private final By msnError= By.xpath("//span[@class='Message-sc-15vkh7g-0 dHbxKh']");

    public By getTxtUser() {
        return txtUser;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnLogeo() {
        return btnLogeo;
    }

    public By getMsnError() {
        return msnError;
    }
}
