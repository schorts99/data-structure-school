/**
 * La funcion recursivo(fila, columna) se define matematicamente de
 * la siguiente manera:
 * 
 *    recursivo(fila, 0)       = 1 para cualquier valor de fila
 *    recursivo(fila, columna) = 1 si fila = columna
 *    recursivo(fila, columna) = recursivo(fila - 1, columna - 1 +
 *                               recursivo(fila - 1, columna) en otro caso.
 *                            
 *  [agregar espacios en blanco a la izquierda para darle forma]                          
 */
public class TrianguloPascalC
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
            espacios(nFil - i);
            for (j = 0; j <= i; j++)
            {
                System.out.format("%6s",matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void espacios(int e)
    {
        for(int i = 0; i <= e; i++)
        {
            System.out.print("   ");
        }
    }
    
    public static void main(String[] args)
    {
        TrianguloPascalC tp = new TrianguloPascalC();
        if (args.length == 0)
            tp.calcular(1);
        else
            tp.calcular(Integer.parseInt(args[0]));
    }
}
