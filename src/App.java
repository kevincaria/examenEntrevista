import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Verificar si un número aparece al menos dos veces en un array,  retornar TRUE o FALSE .

// Input: nums = [1,2,3,1]
// Output: true

// Input: nums = [1,2,3,4]

public class App {
    public static void main(String[] args) throws Exception {
            resolucionExamen();
        }
    
        public static int pedirDimension() {
            System.out.println("Cuantos numeros tendra la lista?");
            int dimension = new Scanner(System.in).nextInt();
            return dimension;
        }
    
        public static int[] pedirNumerosArray(int dimension) {
            int listaNumeros[] = new int[dimension];
            for (int i = 0; i < dimension; i++) {
                System.out.println("Ingrese el numero de la posicion " + i);
                listaNumeros[i] = new Scanner(System.in).nextInt();
            }
            return listaNumeros;
        }
    
        public static boolean hayRepetidos( int dimension,int[] listaNumeros) {
            Set<Integer> listaSinRepetidos = new HashSet<Integer>();
                for (int i = 0; i < listaNumeros.length; i++) {
                   listaSinRepetidos.add(listaNumeros[i]);
                }
            return (listaSinRepetidos.size() != listaNumeros.length);
        }
    
        public static void resolucionExamen() {
            int dimension = pedirDimension();
            int listaNumeros[] = pedirNumerosArray(dimension);
            boolean resultado = hayRepetidos(dimension, listaNumeros);
            System.out.println("¿Hay numeros repetidos en la lista? " + resultado);
        }
    }

