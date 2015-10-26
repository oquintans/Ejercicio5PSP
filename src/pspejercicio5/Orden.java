/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pspejercicio5;

/**
 *
 * @author oquintansocampo
 */
public class Orden extends Thread {

    public Orden(String nom) {
        super(nom);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola soy el hilo: " + getName());
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1 = new Orden("Hilo1");
        Thread t2 = new Orden("Hilo2");
        t2.setPriority(MAX_PRIORITY);
        t1.setPriority(MIN_PRIORITY);
        t2.start();
        t1.start();

    }

}
