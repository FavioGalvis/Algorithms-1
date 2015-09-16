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
import java.lang.reflect.Array;

/**
 *
 * @author 201521268405
 */
public class practica_E {
    
    /**
     * @param args the command line arguments
     * Clase para identificar las notas de un estudiante
     * Lee las calificaciones de los cortes y evalua su nota final
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 0, n = 0;
        boolean flag = false;
        double notas = 0;
        Scanner read = new Scanner ( System.in );
        System.out.println ( "Digite cuantos estudiantes desea verificar: " );
        n = read.nextInt();
        String[] nombres = new String[n];
        Scanner scanstring = new Scanner(System.in);
        String noms;
        double[][] nota = new double[n][4];
        
        while ( i < n ) {
            
            System.out.println ( "Ingrese los nombres del estudiante " + (i+1) );
            noms = scanstring.nextLine();
            nombres[i] = noms;
            
            System.out.println ( "Ingrese la nota del 1er corte de " + noms );
            notas = read.nextDouble();
            nota[i][0] = notas;
            System.out.println ( "Ingrese la nota del 2do corte de " + noms );
            notas = read.nextDouble();
            nota[i][1] = notas;
            System.out.println ( "Ingrese la nota del 3er corte de " + noms );
            notas = read.nextDouble();
            nota[i][2] = notas;

            notas = nota[i][0]*0.3;
            notas = notas+(nota[i][1]*0.3);
            notas = notas+(nota[i][2]*0.4);
            nota[i][3] = notas;
            
            i++;
            
        }
        
        i = 0;
        System.out.println ( "A continuacion los estudiantes y sus notas definitivas." );
        System.out.println ( "Cada uno mostrará si aprobo o no la materia al final." );
        System.out.println ( "-------------------------------------------------------" );
        
        while ( i < n ) {
            
            System.out.println ( "Nombres: " + nombres[i] );
            System.out.println ( "Nota 1(30%): " + nota[i][0] + " -- " + "Nota 2(30%): " + nota[i][1] +
                                 " -- " + "Nota 3(40%): " + nota[i][2] + " -- " + "Final(100%): " + nota[i][3] );
            if ( nota[i][3] >= 3 ) {
                System.out.println ( "Calificacion: Aprobado");
            }
            else {
                System.out.println ( "Calificacion: Reprobado");
            }
            System.out.println ( "----------------------------\n" );
            i++;
            
        }
        
        Scanner pauser = new Scanner (System.in);
        System.out.println("\nPresione enter para continuar...\n");
        pauser.nextLine();
        
    }

}
