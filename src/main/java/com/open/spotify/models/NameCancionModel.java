package com.open.spotify.models;

public class NameCancionModel {
    private static String nameCancion;

    public static String getNameCancion() {
        return nameCancion;
    }

    public static void setNameCancion(String nameCancion) {
        NameCancionModel.nameCancion = nameCancion;
    }
}
