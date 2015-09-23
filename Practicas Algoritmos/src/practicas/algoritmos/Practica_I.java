/*
 * Copyright (C) 2015 FGALVIS
 * Copyright (C) 2015 Favio Galvis Gamboa - 201521268405
 * Copyright (C) 2015 Universidad Simon Bolivar
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package practicas.algoritmos;

import java.util.Scanner;

/**
 *
 * @author Favio Galvis
 */
public class Practica_I {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner pauser = new Scanner (System.in);
        int opcion = 0;
        int[][] registro = new int[100][100];
        while ( opcion != 3 ) {
            String newline = System.lineSeparator();
            System.out.printf ("----------------------------\n");
            System.out.printf ("-- Programa de Practicas. --\n");
            System.out.printf ("-- Almuno: Favio Galvis   --\n");
            System.out.printf ("-- Profesor: Juan Rua     --\n");
            System.out.printf ("----------------------------\n");
            System.out.printf ("Programa para el filtrado de usuarios segun parametros.\n");
            System.out.printf ("En este caso se registrará una serie de usuarios y\n");
            System.out.printf ("Y se filtrará de estos segun ciertos parametros.\n");
            System.out.printf ("Para este caso el parametro de busqueda son 3:\n");
            System.out.printf ("A. Edad menos de 18 años\n");
            System.out.printf ("B. Estatura mayor a 180 centimetros\n");
            System.out.printf ("C. Peso maximo 80 kg\n");
            System.out.printf ("Seleccione la opcion requerida para el programa:\n");
            System.out.printf ("1. Ingresar un nuevo usuario en el registro.\n");            
            System.out.printf ("2. Mostrar o Buscar los usuarios que cumplen los requisitos.\n");
            System.out.printf ("3. Salir del programa.\n");
            Scanner valor = new Scanner(System.in);
            opcion = valor.nextInt();
            int id=0,edad=0,estatura=0,peso=0;
            switch (opcion) {
                case 1: {
                    int n = 0;
                    System.out.println ("Ingrese la Identificacion del Usuario: ");
                    Scanner scanvalores = new Scanner(System.in);
                    id = scanvalores.nextInt();
                    System.out.println ("Ingrese la edad del usuario: ");
                    edad = scanvalores.nextInt();
                    System.out.println ("Ingrese la estatura del usuario (cm): ");
                    estatura = scanvalores.nextInt();
                    System.out.println ("Ingrese el peso del usuario (kg): ");
                    peso = scanvalores.nextInt();
                    while ( registro[n][0] != 0 ) {
                        n = n+1;
                    }
                    if ( registro[n][0] == 0 ){
                        registro[n][0] = id;
                        registro[n][1] = edad;
                        registro[n][2] = estatura;
                        registro[n][3] = peso;
                    }
                    if ( registro[n][0] != 0 ){
                        System.out.println ("Usuario almacenado correctamente con numero"+(n+1)+"\n");
                    }     
                }break;
                case 2: {
                    int n = 0;
                    int o = 1;
                    int reg = 0;
                    int flag = -2;
                    int nom = 0;
                    while ( o == 1 || o==2 || o==3 ){
                        System.out.println ("Desea buscar por numero de registro (1) o numero de cedula de usuario (2) o mostrar todos los usuarios que cumplen (3)?\n(Coloque (4) para salir) ");
                        Scanner scanInt = new Scanner(System.in);
                        o = scanInt.nextInt();
                        switch (o){
                            case 1:{
                                System.out.println ("Ingrese el Numero de Registro: ");
                                reg = scanInt.nextInt();
                                reg = reg-1;
                            }break;
                            case 2:{
                                System.out.println ("Ingrese la ID del Usuario: ");
                                Scanner scanvalue = new Scanner(System.in);
                                nom = scanvalue.nextInt();
                                reg = -1;
                            }break;
                            case 3:{
                                for ( int max=0; max<100; max++ ) {
                                      if ( (registro[max][1])<=18 ){
                                            if ( (registro[max][2])>=180 ){
                                                if ( (registro[max][3])<=80 ){
                                                    System.out.println ("Usuario numero: " + (max+1));
                                                    System.out.println ("Identificacion: " + registro[max][0]);
                                                    System.out.println ("Cumple con las condiciones.\n");
                                                    System.out.println ("Edad"+registro[max][1]);
                                                    System.out.println ("Estatura"+registro[max][2]);
                                                    System.out.println ("Peso"+registro[max][3]);
                                                }    
                                            }
                                        } else {
                                            System.out.println ("Usuario numero: " + (max+1));
                                            System.out.println ("Identificacion: " + registro[max][0]);
                                            System.out.println ("NO cumple con las condiciones.\n");
                                            System.out.println ("Edad"+registro[max][1]);
                                            System.out.println ("Estatura"+registro[max][2]);
                                            System.out.println ("Peso"+registro[max][3]);
                                        }
                                      if ((registro[max][0])==0){
                                          max=100;
                                      }
                                }
                            }break;
                        }
                        
                        if ( o!=3 ){
                            if ( reg != -1 ){
                                if ( registro[reg][0] != 0){
                                    flag = reg;
                                    System.out.println ("------------------------------------------------------------\n");
                                    System.out.println ("Registro encontrado. Se procede a verificar las condiciones.\n");
                                    System.out.println ("------------------------------------------------------------\n");
                                }
                            } else if ( nom != 0 ){
                                int indice = 0;
                                while ( registro[indice][0] != 0 ){
                                    if ( registro[indice][0]==(nom) ) {
                                        flag = indice;
                                        System.out.println ("------------------------------------------------------------\n");
                                        System.out.println ("Registro encontrado. Se procede a verificar las condiciones.\n");
                                        System.out.println ("------------------------------------------------------------\n");                                    
                                    }
                                    indice = indice + 1;
                                }      
                            } else if ( reg != -1 || nom != 0 ) {
                                if ( flag == -2 ) {
                                    System.out.println ("------------------------------------------------------------\n");
                                    System.out.println ("Registro no encontrado. Verifique los parametros de busqueda\n");
                                    System.out.println ("------------------------------------------------------------\n");                                   
                                }
                            }

                            if ( flag != -1 ){
                                if ( (registro[flag][1])<=18 && (registro[flag][2])>=180 && (registro[flag][3])<=80){
                                            System.out.println ("Usuario numero: " + (flag+1));
                                            System.out.println ("Identificacion: " + registro[flag][0]);
                                            System.out.println ("Cumple con las condiciones.\n");
                                            System.out.println ("Edad"+registro[flag][1]);
                                            System.out.println ("Estatura"+registro[flag][2]);
                                            System.out.println ("Peso"+registro[flag][3]);
                                            flag = -1;
                                } else {
                                    System.out.println ("Usuario numero: " + (flag+1));
                                    System.out.println ("Identificacion: " + registro[flag][0]);
                                    System.out.println ("NO cumple con las condiciones.\n");
                                    System.out.println ("Edad"+registro[flag][1]);
                                    System.out.println ("Estatura"+registro[flag][2]);
                                    System.out.println ("Peso"+registro[flag][3]);
                                    flag = -1;
                                }
                            }
                        }
                    }
                }break;
                case 3:{
                    System.out.printf ("Gracias por usar el programa.\n");
                }break;
            }
            System.out.println("\nPresione enter para continuar...\n");
            pauser.nextLine();
        }
    }   
    
}
