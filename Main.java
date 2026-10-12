package Ejercicio16_listaReproduccion;

public class Main {
    public static void main(String[] args) {
        ListaReproduccion lista = new ListaReproduccion("Rock Nacional");
        lista.agregarCancion("De Música Ligera");
        lista.agregarCancion("Persiana Americana");
        lista.agregarCancion("Rezo por Vos");

        System.out.println("Lista: " + lista.getNombre() + " - Suena: " + lista.obtenerPistaActual());

        for (int i = 1; i <= 3; i++) {
            boolean avanzo = lista.siguiente();
            System.out.println("Siguiente (" + (avanzo ? "ok" : "ya es la última") + ") -> " + lista.obtenerPistaActual());
        }

        for (int i = 1; i <= 4; i++) {
            boolean retrocedio = lista.anterior();
            System.out.println("Anterior (" + (retrocedio ? "ok" : "ya es la primera") + ") -> " + lista.obtenerPistaActual());
        }
    }
}
