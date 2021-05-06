package Eng_Git2.Classes;

import javax.swing.*;
import java.text.DecimalFormat;

public class Circulo {
    DecimalFormat dF = new DecimalFormat("#.#");

    private double raio;
    private double perimetro;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
        areaCirculo();
        perimetroCirculo();
    }

    private void areaCirculo() {
        area = Math.PI * (raio * raio);
        JOptionPane.showMessageDialog(null, "A área do seu circulo é: " + dF.format(area));
    }

    private void perimetroCirculo() {
        perimetro = 2 * Math.PI * raio;
        JOptionPane.showMessageDialog(null, "O perimetro do seu retangulo é de: " + dF.format(perimetro));
    }

    public void setRaio(double raio) {
        this.raio = raio;
        areaCirculo();
        perimetroCirculo();
    }
}
