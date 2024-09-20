package main.java;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        CorpoHumano humano1 = new CorpoHumano(0, 0, 0, 0);
        humano1.setAltura(1.80);
        humano1.setDensidade(500);
        humano1.setMassa(63);
        humano1.setVolume(100);

        System.out.println(humano1.calcularIMC());
        



    }
}
