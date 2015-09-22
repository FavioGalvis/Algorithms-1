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
 * @author FavioGalvis
 */
public class Practica_H {
    
    /**
     * @param args the command line arguments
     * Clase muestra todos los numeros que componen a un valor leido
     * Un numero por linea
     * Usa for para guardar la cadena de caracteres
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner ( System.in );
        int num=0;
        System.out.println ( "Ingrese el numero a evaluar: " );
        num = read.nextInt();
        String resultado = "";
        for ( int n=1; n<=num; n++ ){
            resultado = resultado + String.valueOf(n);
            resultado = resultado + "\n";
        }
        System.out.println( "Resultado:" );
        System.out.println( resultado );
        
        Scanner pauser = new Scanner (System.in);
        System.out.println("Presione enter para continuar...");
        pauser.nextLine();
    }
    
}
