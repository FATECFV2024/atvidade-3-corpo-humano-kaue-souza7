package main.java;

public class CorpoHumano {

    private double altura;
    private double volume;
    private int densidade;
    private int massa;


    public CorpoHumano(int massa, double volume, int densidade, double altura) {
        this.altura = altura;
        this.volume = volume;
        this.densidade = densidade;
        this.massa = massa;
    }

    public double calcularIMC(){
        return massa / (altura*altura);
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double peso) {
        this.volume = peso;
    }
    public int getDensidade() {
        return densidade;
    }
    public void setDensidade(int densidade) {
        this.densidade = densidade;
    }
    public int getMassa() {
        return massa;
    }
    public void setMassa(int massa) {
        this.massa = massa;
    }


}
