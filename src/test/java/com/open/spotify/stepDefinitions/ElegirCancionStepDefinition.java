package com.open.spotify.stepDefinitions;

import com.open.spotify.steps.BuscarCancionSpotifyStep;
import com.open.spotify.steps.ReproducirCancion;
import com.open.spotify.steps.ValidacionCancion;
import com.open.spotify.steps.ValidacionSesionSpotify;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ElegirCancionStepDefinition {
    @Steps
    ValidacionSesionSpotify validacionSesionSpotify;
    @Steps
    BuscarCancionSpotifyStep buscarCancionSpotifyStep;
    @Steps
    ReproducirCancion reproducirCancion;

    @Steps
    ValidacionCancion validacionCancion;

    @Dado("que el usuario esta logueado en Spotify")
    public void queElUsuarioEstaLogueadoEnSpotify() {
        validacionSesionSpotify.assertionSesion();
    }

    @Cuando("busca una cancion que quiero escuchar")
    public void buscaUnaCancionqueQuiereEscuchar() {
        buscarCancionSpotifyStep.clickbuscar();
        buscarCancionSpotifyStep.escribirCancion();
        buscarCancionSpotifyStep.elegirCancion();
        reproducirCancion.reproducirCancion();


    }

    @Entonces("verifico que sea la cancion seleccionada")
    public void verificaQueSeaLaCancionSeleccionada() {
        validacionCancion.validarCancion();
    }

}
