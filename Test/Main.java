package Eng_Git2.Test;

import Eng_Git2.Classes.Circulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        boolean opcao = true;

        do {
            JOptionPane.showMessageDialog(null, "Cálculo de área e perimetro de um círculo e triângulo.");
            String escolha = JOptionPane.showInputDialog("Defina qual cálculo deseja fazer: \n \n" + "Circunferência. \n"
                    + "Retângulo. \n" + "Sair.");
            switch (escolha.charAt(0)) {
                case 'C':
                    String textoRaio = JOptionPane.showInputDialog("Defina o raio para o cálculo: ");
                    double raio = Double.parseDouble(textoRaio);
                    if (raio < 0) {
                        textoRaio = JOptionPane.showInputDialog("Redefina o raio para o cálculo, de forma que seja maior que 0: ");
                        raio = Double.parseDouble(textoRaio);
                    }
                    Circulo circulo = new Circulo(raio);
                    break;
                case 'R':
                    String textoBase = JOptionPane.showInputDialog("Defina a base para o cálculo: ");
                    double base = Double.parseDouble(textoBase);
                    if (base < 0) {
                        textoBase = JOptionPane.showInputDialog("Redefina o a base para o cálculo, de forma que seja maior que 0: ");
                        base = Double.parseDouble(textoBase);
                    }
                    String textoAltura = JOptionPane.showInputDialog("Defina a altura para o cálculo: ");
                    double altura = Double.parseDouble(textoAltura);
                    if (altura < 0) {
                        textoAltura = JOptionPane.showInputDialog("Redefina a altura para o cálculo, de forma que seja maior que 0: ");
                        altura = Double.parseDouble(textoAltura);
                    }

                    Classes.Retangulo retangulo = new Classes.Retangulo(base, altura);
                    break;
                case 'S':
                    opcao = false;
                    break;
            }
        } while (opcao);
    }
}
