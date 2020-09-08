public class Main {
    public static void main(String[] args) {
        
        Matriz m = new Matriz(3,3);
        m.llenarMatriz();
        m.imprimirMatriz(m.enteros);
        System.out.print("\n");
        System.out.println( " \t  +");
        System.out.print("\n");
        m.llenarMatriz2();
        m.imprimirMatriz2(m.enteros2);
        System.out.print("\n");
        System.out.println("La matriz resultante es:");
        m.sumarMatricez();
        m.mostrarResultado();
       
    }
    
}
