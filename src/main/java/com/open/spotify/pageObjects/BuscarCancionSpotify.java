package com.open.spotify.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuscarCancionSpotify extends PageObject {
    private final By btnBuscar = By.xpath("//span[contains(text(),'Search')]");

    private final By txtBuscar = By.xpath("//input[contains(@class,'encore-text encore-text-body-small NtkAQg9R1r5CjuP0XHwl')]");

    private final By lstCanciones = By.xpath("//a[@class=\"btE2c3IKaOXZ4VNAb8WQ\" ]");

    private final By btnPlayCanciones = By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 bXrXni encore-bright-accent-set']");

    private final By lblValidarCanciones = By.xpath("//span[@class='rEN7ncpaUeSGL9z0NGQR']");

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getTxtBuscar() {
        return txtBuscar;
    }

    public By getLstCanciones() {
        return lstCanciones;
    }

    public By getBtnPlayCanciones() {
        return btnPlayCanciones;
    }

    public By getLblValidarCanciones() {
        return lblValidarCanciones;
    }

}
