package com.open.spotify.steps;

import com.open.spotify.pageObjects.BuscarCancionSpotify;

import com.open.spotify.utils.WaitUtils;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ReproducirCancion {
    @Page
    BuscarCancionSpotify buscarCancionSpotify;
    WaitUtils waitForSongToPlay;
    @Step
    public void reproducirCancion() {
        buscarCancionSpotify.getDriver().findElement(buscarCancionSpotify.getBtnPlayCanciones()).click();
        waitForSongToPlay.waitForSongToPlay(50);


    }
}
