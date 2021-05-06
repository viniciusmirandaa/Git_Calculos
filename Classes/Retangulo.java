package Classes;

import javax.swing.*;
import java.text.DecimalFormat;

public class Retangulo {
    DecimalFormat dF = new DecimalFormat("#.#");

    private double base;
    private double altura;
    private double perimetro;
    private double area;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        areaRetangulo();
        perimetroRetangulo();
    }

    private void areaRetangulo() {
        area = base * altura;
        JOptionPane.showMessageDialog(null, "A área do seu retangulo é: " + dF.format(area));
    }

    private void perimetroRetangulo() {
        perimetro = 2 * (base + altura);
        JOptionPane.showMessageDialog(null,"O perimetro do seu retangulo é de: " + dF.format(perimetro));
    }

    public void setBaseAltura(double base, double altura){
        this.base = base;
        this.altura = altura;
        areaRetangulo();
        perimetroRetangulo();
    }
}
