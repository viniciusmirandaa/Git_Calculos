package Eng_Git2.Test;

import Eng2_Git.Classes.Circulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Cálculo de área e perimetro de um círculo.");
        String textoRaio = JOptionPane.showInputDialog("Defina o raio para o cálculo: ");
        double raio = Double.parseDouble(textoRaio);
        Circulo circulo = new Circulo(raio);

    }
}
