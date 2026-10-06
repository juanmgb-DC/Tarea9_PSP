public class GestorDescargas {

    public static void main(String[] args) {
        String[] nombres = {"cuarzos.png", "meditacion.mp4", "mantras.mp3", "horoscopo.pdf"};

        long inicio = System.currentTimeMillis(); // guarda el tiempo en milisegundos

        Descarga[] descargas = new Descarga[nombres.length]; // creamos un array vacio con 4 huecos
        for (int i = 0; i < nombres.length; i++) {
            descargas[i] = new Descarga(nombres[i]); // recorre cada hueco y crea una descarga con el nombre del cada hilo
        }

        for (Descarga d : descargas) {
            d.start(); // arrrancamos todas las descargas
        }


        for (Descarga d : descargas) {
            try {
                d.join(); // con este comando se bloquea hasta que terminan todas las descargas
            } catch (InterruptedException e) {
                System.out.println("interrumpido"); // lanza error si se interrumpe
            }
        }

        long tiempoReal = System.currentTimeMillis() - inicio; // calculamos el tiempo del programa


        long sumaTotal = 0; // variable para sumar los tiempos de todas las descargas
        for (Descarga d : descargas) {
            sumaTotal += d.getTiempoTotal(); // recorre todas las descargas y añadimos a la variable de antes el tiempo de cada una
        }

        System.out.println("Todas las descargas han terminado.");
        System.out.println("Tiempo real: " + tiempoReal + " ms");
        System.out.println("Si se hubieran descargado una detrás de otra: " + sumaTotal + " ms");
    }
}


