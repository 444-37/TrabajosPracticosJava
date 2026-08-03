/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.antonella.validacionnombre;
import javax.swing.JOptionPane;

public class ValidacionNombre {

    public static void main(String[] args) {

        ValidarNombre();

    }

    private static void ValidarNombre() {

        String Nombre;
        boolean Valido = false;

        while (Valido == false) {

            Nombre = JOptionPane.showInputDialog("Ingrese su nombre completo:");

            Valido = true;

            if (Nombre.length() == 0) {

                Valido = false;

            } else {

                for (int i = 0; i < Nombre.length(); i++) {

                    char Letra = Nombre.charAt(i);

                    if (!Character.isLetter(Letra) && Letra != ' ') {

                        Valido = false;

                    }

                }

            }

            if (Valido == true) {

                JOptionPane.showMessageDialog(null,
                        "Nombre válido.");

            } else {

                JOptionPane.showMessageDialog(null,
                        "El nombre sólo puede contener letras y espacios.");

            }

        }

    }

}

