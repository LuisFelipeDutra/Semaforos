/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Thiani
 */
public class main {

    public static void main(String[] args) {
        int numeroDePermicoes = 2;
        int numeroDeProcessos = 6;
        Semaphore semaphore = new Semaphore(numeroDePermicoes);
        ProcessadorThread[] processos = new ProcessadorThread[numeroDeProcessos];
        for (int i = 0; i < numeroDeProcessos; i++) {
            processos[i] = new ProcessadorThread(i, semaphore);
            processos[i].run();
        }
    }
}
