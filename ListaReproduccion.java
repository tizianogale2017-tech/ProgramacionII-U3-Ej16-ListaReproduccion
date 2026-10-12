package Ejercicio16_listaReproduccion;

import java.util.ArrayList;
import java.util.List;

public class ListaReproduccion {
    private String nombre;
    private List<String> canciones = new ArrayList<>();
    private int indiceActual = 0;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCancion(String cancion) {
        canciones.add(cancion);
    }

    public boolean siguiente() {
        if (indiceActual >= canciones.size() - 1) {
            return false;
        }
        indiceActual++;
        return true;
    }

    public boolean anterior() {
        if (indiceActual <= 0) {
            return false;
        }
        indiceActual--;
        return true;
    }

    public String obtenerPistaActual() {
        if (canciones.isEmpty()) {
            return "(lista vacía)";
        }
        return canciones.get(indiceActual);
    }

    public String getNombre() {
        return nombre;
    }
}
