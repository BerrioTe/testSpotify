package com.open.spotify.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SesionSpotifyPage extends PageObject {
    private final By lblvalidacionLogin = By.xpath("//button[@class=\"encore-over-media-set WtC1lGbmQRplD6JBhNFU\"]");

    public By getLblvalidacionLogin() {
        return lblvalidacionLogin;
    }
}
