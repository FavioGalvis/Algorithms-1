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

/**
 *
 * @author FGALVIS
 */
import java.lang.reflect.Array;
import java.util.Scanner;

public class Practica_C {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner pauser = new Scanner (System.in);
        int opcion = 0;
        String[][] registro = new String[100][100];
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
            System.out.printf ("Para este caso el parametro de busqueda son 2:\n");
            System.out.printf ("A. Masculino, Mayor de 40 años, Casado\n");
            System.out.printf ("B. Femenino, Menor de 50 años, Soltera\n");
            System.out.printf ("Seleccione la opcion requerida para el programa:\n");
            System.out.printf ("1. Ingresar un nuevo usuario en el registro.\n");            
            System.out.printf ("2. Buscar un usuario en el registro.\n");
            System.out.printf ("3. Salir del programa.\n");
            Scanner valor = new Scanner(System.in);
            opcion = valor.nextInt();
            switch (opcion) {
                case 1: {
                    int n = 0;
                    System.out.println ("Ingrese el Nombre del Usuario: ");
                    Scanner scanstring = new Scanner(System.in);
                    String nombre = scanstring.nextLine();
                    System.out.println ("Ingrese el La edad del usuario: ");
                    String edad = scanstring.nextLine();
                    System.out.println ("Ingrese el sexo del usuario (m=masculino o f=femenino): ");
                    String sexo = scanstring.nextLine();
                    System.out.println ("Ingrese el estado civil del usuario (c=casado o s=soltero): ");
                    String civil = scanstring.nextLine();
                    while ( registro[n][0] != null ) {
                        n = n+1;
                    }
                    if ( registro[n][0] == null ){
                        registro[n][0] = nombre;
                        registro[n][1] = edad;
                        registro[n][2] = sexo;
                        registro[n][3] = civil;
                    }
                    if ( registro[n][0] != null ){
                        System.out.println ("Usuario almacenado correctamente con numero"+(n+1)+"\n");
                    }     
                }break;
                case 2: {
                    int n = 0;
                    int o = 1;
                    int reg = 0;
                    int flag = -2;
                    String nom = null;
                    while ( o == 1 || o==2 ){
                        System.out.println ("Desea buscar por numero de registro (1) o nombre de usuario (2)?\n(Coloque numero para salir) ");
                        Scanner scanInt = new Scanner(System.in);
                        o = scanInt.nextInt();
                        switch (o){
                            case 1:{
                                System.out.println ("Ingrese el Numero de Registro: ");
                                reg = scanInt.nextInt();
                                reg = reg-1;
                            }break;
                            case 2:{
                                System.out.println ("Ingrese el Nombre del Usuario: ");
                                Scanner scanstring = new Scanner(System.in);
                                nom = scanstring.nextLine();
                            }break;
                        }
                        if ( reg != 0 ){
                            if ( registro[reg][0] != null){
                                flag = reg;
                                System.out.println ("------------------------------------------------------------\n");
                                System.out.println ("Registro encontrado. Se procede a verificar las condiciones.\n");
                                System.out.println ("------------------------------------------------------------\n");
                            }
                        } else if ( nom != null ){
                            int indice = 0;
                            while ( registro[indice][0] != null ){
                                if ( registro[indice][0].equals(nom) ) {
                                    flag = indice;
                                    System.out.println ("------------------------------------------------------------\n");
                                    System.out.println ("Registro encontrado. Se procede a verificar las condiciones.\n");
                                    System.out.println ("------------------------------------------------------------\n");                                    
                                }
                                indice = indice + 1;
                            }      
                        } else if ( reg != 0 || nom != null ) {
                            if ( flag == -2 ) {
                                System.out.println ("------------------------------------------------------------\n");
                                System.out.println ("Registro no encontrado. Verifique los parametros de busqueda\n");
                                System.out.println ("------------------------------------------------------------\n");                                   
                            }
                        }
                        
                        if ( flag != -1 ){
                            if ( "m".equals(registro[flag][2]) ){
                                if ( "c".equals(registro[flag][3]) ){
                                    int edad = Integer.parseInt(registro[flag][1]);
                                    if ( edad > 40){
                                        System.out.println ("Usuario numero: " + flag + "\n");
                                        System.out.println ("Nombre: " + registro[flag][0] + "\n");
                                        System.out.println ("Cumple con las condiciones.\n");
                                        flag = -1;
                                    }
                                }
                            } else if ( "f".equals(registro[flag][2]) ) {
                                if ( "s".equals(registro[flag][3]) ){
                                    int edad = Integer.parseInt(registro[flag][1]);
                                    if ( edad < 50){
                                        System.out.println ("Usuario numero: " + flag + "\n");
                                        System.out.println ("Nombre: " + registro[flag][0] + "\n");
                                        System.out.println ("Cumple con las condiciones.\n");
                                        flag = -1;
                                    }
                                }
                            }
                            if ( flag == -1 ) {
                                if ( reg != 0 || nom != null ) {
                                    System.out.println ("Usuario numero: " + flag + "\n");
                                    System.out.println ("Nombre: " + registro[flag][0] + "\n");
                                    System.out.println ("Cumple no cumple con las condiciones.\n");
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
