package com.open.spotify.steps;

import com.open.spotify.pageObjects.BuscarCancionSpotify;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static com.open.spotify.models.NameCancionModel.setNameCancion;
import static com.open.spotify.utils.CallData.extractTo;
import static com.open.spotify.utils.RamdonSelect.selectRandom;

public class BuscarCancionSpotifyStep {
    ArrayList<Map<String, String>> datos = extractTo();
    String text = "";
    String lowerCaseText = "";
    List<WebElement> collections = new ArrayList<>();

    WebElement element = null;
    @Page
    BuscarCancionSpotify buscarCancionSpotify;

    @Step("Click Login")
    public void clickbuscar() {
        WaitUntil.the(buscarCancionSpotify.getBtnBuscar(), WebElementStateMatchers.isVisible());
        buscarCancionSpotify.getDriver().findElement(buscarCancionSpotify.getBtnBuscar()).click();
    }

    @Step("Escribir Cancion")
    public void escribirCancion() {
        WaitUntil.the(buscarCancionSpotify.getTxtBuscar(), WebElementStateMatchers.isVisible());
        buscarCancionSpotify.getDriver().findElement(buscarCancionSpotify.getTxtBuscar()).sendKeys(datos.get(0).get("cancion"));
    }

    @Step("Elegir Cancion")
    public void elegirCancion() {
        collections = buscarCancionSpotify.getDriver().findElements(buscarCancionSpotify.getLstCanciones());
        WebElement element = selectRandom(collections);
        text = element.getText();
        lowerCaseText = text.toLowerCase();
        while (!lowerCaseText.contains(datos.get(0).get("cancion").toLowerCase())) {
            collections = buscarCancionSpotify.getDriver().findElements(buscarCancionSpotify.getLstCanciones());
            element = selectRandom(collections);
            text = element.getText();
            lowerCaseText = text.toLowerCase();
        }
        setNameCancion(element.getText());
        element.click();// hace clic
        buscarCancionSpotify.getDriver().findElement(buscarCancionSpotify.getBtnPlayCanciones()).click();
    }
}
