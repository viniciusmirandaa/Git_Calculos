package Eng_Git2.Test;

import Classes.Retangulo;
import Eng_Git2.Classes.Circulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Cálculo de área e perimetro de um círculo.");
        String textoRaio = JOptionPane.showInputDialog("Defina o raio para o cálculo: ");
        double raio = Double.parseDouble(textoRaio);
        Circulo circulo = new Circulo(raio);

        String textoBase = JOptionPane.showInputDialog("Defina a base para o cálculo: ");
        String textoAltura = JOptionPane.showInputDialog("Defina a altura para o cálculo: ");

        double base = Double.parseDouble(textoBase);
        double altura = Double.parseDouble(textoAltura);

        Retangulo retangulo = new Retangulo(base, altura);
    }
}
