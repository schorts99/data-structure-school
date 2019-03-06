public class TrianguloPascalJ
{
	int[][] a = new int[0][0];
	
	public int recursivo(int x, int y)
	{
       if (y == 0 || y == x) return 1;
       else return recursivo(x - 1, y - 1) + recursivo(x - 1, y);
    }
	
    public void calcular(int nF)
	{
		int[][] matriz = new int [nF][nF];
        a = matriz;
    	for (int i = 0; i < nF; i++)
		{
			for (int j = 0; j <= i; j++)
			{
                matriz[i][j] = recursivo(i, j);
            }
        }
		
        for (int i = 0; i < nF; i++)
		{
            for (int j = 0; j <= i; j++)
			{
                System.out.print(matriz[i][j] + " ");
			}
         System.out.println();
		}
	}
	
	public void imprimir(int nF)
	{
       int [][] matriz = new int[nF][nF];
       String s = " ";
	   a = matriz;
	   
	   for (int i = 0; i < nF; i++)
	   {
            for (int j = 0;j <= i; j++)
			{
                matriz[i][j] = recursivo(i,j);
            }
	   }
	   
	   for (int i = 0; i < nF; i++)
	   {     
		   for (int x = nF; x >= i; x--)
		   {
			   System.out.format("%-3s",s);
		   }

		   for (int j = 0; j <= i; j++)
		   {
			   System.out.format("%5d ", matriz[i][j]);
		   }
		   System.out.println("\n");
	   }
	}
    
    public static void main(String []args)
	{
        TrianguloPascalJ tp = new TrianguloPascalJ();
        if (args[0].equalsIgnoreCase("0")) tp.calcular(1);
		else tp.calcular(Integer.parseInt(args[0]));
		System.out.println();
		tp.imprimir(Integer.parseInt(args[0]));
    }
}
