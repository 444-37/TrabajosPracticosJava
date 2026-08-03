/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.antonella.validacionfecha;

import javax.swing.JOptionPane;

public class ValidacionFecha {

    public static void main(String[] args) {

        ValidarFecha();

    }

    private static void ValidarFecha() {

        String Fecha;
        boolean Valida = false;

        while (Valida == false) {

            Fecha = JOptionPane.showInputDialog("Ingrese una fecha (DD/MM/AAAA):");

            Valida = true;

            if (Fecha.length() != 10) {

                Valida = false;

            } else {

                if (Fecha.charAt(2) != '/' || Fecha.charAt(5) != '/') {

                    Valida = false;

                }

            }

            if (Valida == true) {

                int Dia = Integer.parseInt(Fecha.substring(0, 2));
                int Mes = Integer.parseInt(Fecha.substring(3, 5));
                int Año = Integer.parseInt(Fecha.substring(6, 10));

                if (Mes < 1 || Mes > 12) {

                    Valida = false;

                }

                int DiasMes = 31;

                if (Mes == 4 || Mes == 6 || Mes == 9 || Mes == 11) {

                    DiasMes = 30;

                }

                if (Mes == 2) {

                    if ((Año % 4 == 0 && Año % 100 != 0) || Año % 400 == 0) {

                        DiasMes = 29;

                    } else {

                        DiasMes = 28;

                    }

                }

                if (Dia < 1 || Dia > DiasMes) {

                    Valida = false;

                }

            }

            if (Valida == true) {

                JOptionPane.showMessageDialog(null,
                        "Fecha válida.");

            } else {

                JOptionPane.showMessageDialog(null,
                        "La fecha ingresada no es válida.");

            }

        }

    }

}