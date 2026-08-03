/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.antonella.validacionstring;

import javax.swing.JOptionPane;

public class ValidacionString {

    public static void main(String[] args) {

        String contraseña;
        boolean valida = false;

        while (!valida) {

            contraseña = JOptionPane.showInputDialog("Ingrese una contraseña:");

            // Verificar longitud
            if (contraseña.length() < 8) {
                JOptionPane.showMessageDialog(null,
                        "La contraseña debe tener al menos 8 caracteres.");
                continue;
            }

            boolean mayuscula = false;
            boolean minuscula = false;
            boolean numero = false;

            // Recorrer todos los caracteres
            for (int i = 0; i < contraseña.length(); i++) {

                char c = contraseña.charAt(i);

                if (Character.isUpperCase(c)) {
                    mayuscula = true;
                }

                if (Character.isLowerCase(c)) {
                    minuscula = true;
                }

                if (Character.isDigit(c)) {
                    numero = true;
                }
            }

            if (mayuscula && minuscula && numero) {
                valida = true;
                JOptionPane.showMessageDialog(null, "Contraseña válida.");  
            } else {

                String mensaje = "La contraseña debe contener:";

                if (!mayuscula) {
                    mensaje += " Al menos una letra mayúscula.";
                }

                if (!minuscula) {
                    mensaje += "Al menos una letra minúscula.";
                }

                if (!numero) {
                    mensaje += "Al menos un número.";
                }

                JOptionPane.showMessageDialog(null, mensaje);
            }
        }

    }

}