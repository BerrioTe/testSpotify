package com.open.spotify.steps;

import com.open.spotify.pageObjects.BuscarCancionSpotify;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import static com.open.spotify.models.NameCancionModel.getNameCancion;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidacionCancion {
    @Page
    BuscarCancionSpotify buscarCancionSpotify;
    @Step
    public void validarCancion(){
        String cancion = getNameCancion();

        assertEquals(
                String.valueOf(cancion),String.valueOf(buscarCancionSpotify.getDriver().
                        findElement(buscarCancionSpotify.getLblValidarCanciones()).getText())
        );
    }
}
