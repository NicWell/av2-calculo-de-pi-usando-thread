public class CalculoRunnable implements Runnable {

    private int tid;
    private double inicio;
    private double fim;
    double list[];
    // static calculo cal = new calculo();

    public CalculoRunnable(int tid, double inicio, double fim, double[] list) {
        this.tid = tid;
        this.inicio = inicio;
        this.fim = fim;
        this.list = list;
    }

    @Override
    public void run() {
        double soma = 0;
        for (double x = inicio; x <= fim; x++) {
            soma += (Math.pow(-1, x) * 4.0) / (2 * x + 1);
        }
        list[tid] = soma;
        // System.out.println("Sou a thread: " + tid + "\nParcial: " + soma);
    }

}
