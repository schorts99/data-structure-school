/**
 * La funcion Pascal(fila, columna) se define matematicamente de
 * la siguiente manera:
 * 
 *    Pascal(fila, 0) = 1 para cualquier valor de fila
 *    Pascal(fila, columna) = 1 si fila = columna
 *    Pascal(fila, columna) = Pascal(fila - 1, columna - 1 +
 *                            Pascal(fila - 1, columna) en otro caso.
 *                            
 *  [agregar espacios en blanco a la izquierda para darle forma]                          
 */
public class TrianguloPascal
{
    private int recursivo(int x, int y)
    {
        if (y == 0 || y == x)
            return 1;
        else
            return recursivo(x - 1, y - 1) + recursivo(x - 1, y);
    }
    
    public void calcular(int nFil)
    {
        int matriz[][] = new int[nFil][nFil];
        int j = 0;
        int i = 0;
        
        for (i = 0; i < nFil; i++)
            for (j = 0; j <= i ; j++)
                matriz[i][j] = recursivo(i,j);
                
        for (i = 0; i < nFil; i++)
        {
            for (j = 0; j <= i; j++)
                System.out.print(matriz[i][j] + " ");
        
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        TrianguloPascal tp = new TrianguloPascal();
        if (args.length == 0)
            tp.calcular(1);
        else
            tp.calcular(Integer.parseInt(args[0]));
    }
}
