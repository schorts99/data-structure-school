public class CopoStdDraw
{
    private double sin60  = Math.sin(3.14 / 3);
    double xp1 = 600, yp1 = 300, xp2 = 10, yp2 = 300;
    
    public void dibujar(int i,
                        double xp12, double yp12,
                        double xp22, double yp22)
    {
        double dx = (xp22 - xp12) / 3.;
        double dy = (yp22 - yp12) / 3.;
        double xx = xp12 + 3 * dx / 2. - dy * sin60;
        double yy = yp12 + 3 * dy / 2. + dx * sin60;
        
        StdDraw.setScale(0, 800);
        
        if (i <= 0)
        {
            StdDraw.line((int) xp12, (int) yp12, (int) xp22, (int) yp22);
            StdDraw.line((int) xx,   (int) yy,   (int) xp12, (int) yp12);
            StdDraw.line((int) xp22, (int) yp22, (int) xx,   (int) yy);
        }
        else
        {
            dibujar( i -1, xp12,      yp12,      xp12 + dx, yp12 + dy);
            dibujar( i -1, xp12 + dx, yp12 + dy, xx,        yy);
            dibujar( i -1, xx,        yy,        xp22 - dx, yp22 - dy);
            dibujar( i -1, xp22 - dx, yp22 -dy,  xp22,      yp22);
            
            StdDraw.line((int) xp12, (int) yp12, (int) xp22, (int) yp22);
            StdDraw.line((int) xp12, (int) yp12, (int) xp22, (int) yp22);
        }
    }
    
    public void d(int n)
    {
        dibujar(n, xp2, yp2, xp1, yp1);
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        CopoStdDraw c = new CopoStdDraw();
        c.d(n);
    }
}
