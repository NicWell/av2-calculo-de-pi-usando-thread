
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long inicioExecucao = System.currentTimeMillis();
        // calculo cal = new calculo();
        int numThreads = 32;
        double inicio = 0, fim = 0, quant = 1000000 / numThreads;
        Thread[] threads = new Thread[numThreads];
        double[] list = new double[numThreads];
        for (int i = 0; i < numThreads; i++) {
            inicio = quant * i;
            fim = quant * (i + 1);
            threads[i] = new Thread(new CalculoRunnable(i, inicio, fim, list));
            threads[i].start();
            // System.out.println(inicio);
            // System.out.println(fim);
        }
        join(threads);
        double pi = 0;
        for (int i = 0; i < threads.length; i++) {
            pi += list[i];
        }
        System.out.println("Valor de pi: " + pi);
        // calculoRunnable thread1 = new calculoRunnable("#thread 1", 0, 10);
        // calculoRunnable thread2 = new calculoRunnable("#thread 2", 0, 20);
        // Thread t1 = new Thread(new calculoRunnable("#thread 1", 0, 10));
        // Thread t2 = new Thread(new calculoRunnable("#thread 2", 0, 20));
        long fimExecucao = System.currentTimeMillis();
        double tempoExecucao = (double) (fimExecucao - inicioExecucao);
        System.out.println("Tempo de Execução: " + tempoExecucao);
        System.out.println("Programa Finalizado");
    }

    public static void join(Thread[] threads) throws InterruptedException {
        for (Thread t : threads) {
            t.join();
        }
    }
}