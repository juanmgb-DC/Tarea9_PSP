
public class Descarga extends Thread {

    public String archivo;
    public int msBloque;
    public long tiempoTotal;


    public Descarga(String archivo) {
        this.archivo = archivo; // guarda el nombre del archivo
        this.msBloque = 100 + (int) (Math.random() * 401); // elige aleatoriamente cuanto tarda entre 100 y 500ms
        setName("Descarga =>" + archivo); // ponemos nombre al hilo
    }

    public void run() {
        long inicio = System.currentTimeMillis(); // guarda la hora actual en milisegundos
        for (int i = 1; i <= 10; i++) { // hace las 10 iteraciones
            try {
                Thread.sleep(msBloque); // duerme el tiempo del bloque
            } catch (InterruptedException e) { // si se interrumpe el hilo mientras duerme salta un error
                System.out.println("["+ archivo +"] interrumpid");
                return;
            }
            System.out.println("[" + archivo + "] " + (i * 10) + "%"); // imprime el progreso
        }
        tiempoTotal = System.currentTimeMillis() - inicio; // al acabar el bucle calcula el tiempo que ha tardado gracias al anterior tiempo guardado
        System.out.println("[" + archivo + "] completada en " + tiempoTotal + " ms"); // mensaje final
    }

    public long getTiempoTotal() {
        return tiempoTotal;
    }
}