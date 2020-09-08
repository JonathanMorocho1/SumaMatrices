public class Matriz {

    int[][] enteros;
    int[][] enteros2;
    int[][] matriz_resultante;

    public Matriz(int i, int j) {
        enteros = new int[i][j];
        enteros2 = new int[i][j];
        matriz_resultante = new int[i][j];
    }

    public void llenarMatriz() {
        int l = 1;
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                enteros[i][j] = l;
                l++;
            }
        }

    }

    public void llenarMatriz2() {
        int d = 1;
        for (int i = 0; i < enteros2.length; i++) {
            for (int j = 0; j < enteros2[i].length; j++) {
                enteros2[i][j] = d;
                d++;
            }
        }
    }

    public void imprimirMatriz(int[][] llena) {
        for (int i = 0; i < llena.length; i++) {
            for (int j = 0; j < llena[i].length; j++) {
                System.out.print(" [ "+llena[i][j] + " ] ");
            }
            System.out.println(" ");
        }
    }

    public void imprimirMatriz2(int[][] llenar) {
        for (int i = 0; i < llenar.length; i++) {
            for (int j = 0; j < llenar[i].length; j++) {
                System.out.print(" [ " + llenar[i][j] + " ] ");
            }
            System.out.println(" ");
        }
    }

    public int[][] sumarMatricez() {
        //int [][] resultado = new int[2][2]; 
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros2.length; j++) {
                matriz_resultante[i][j] = enteros[i][j] + enteros2[i][j];
            }
        }
        return matriz_resultante;
    }

    public void mostrarResultado() {
        for (int i = 0; i < matriz_resultante.length; i++) {
            for (int j = 0; j < matriz_resultante.length; j++) {
                System.out.print(" [  "+  matriz_resultante[i][j]  + "  ] ");
            }
            System.out.println("  ");
        }
    }
}
