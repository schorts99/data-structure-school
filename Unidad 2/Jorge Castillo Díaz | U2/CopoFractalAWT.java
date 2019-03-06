/*************************************
 *  Compilacion:  javac CopoFractal
 *  Ejecucion:    java  CopoFractal 7
 *************************************/
 
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Graphics;

public class CopoFractalAWT extends JFrame
{
    private double xp1    = 600;
    private double yp1    = 300;
    private double xp2    = 10;
    private double yp2    = 300;
    
    private double sin60  = Math.sin(3.14 / 3);
    private int    nivelR = 0;
    
    private JButton    r;
    private JTextField rt;
    private JPanel     p;
    
    public CopoFractalAWT(int r) 
    {
        super("Fractal Copo de nieve");
        nivelR      = r;
        Container c = getContentPane();
        setBackground(Color.blue);
        c.setLayout(new FlowLayout());
        
        this.setSize(700,700);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        CopoFractalAWT a = new CopoFractalAWT(Integer.parseInt(args[0]));
    }
    
    public void paint(Graphics g)
    {
        paintRecursivo(g,nivelR,xp1,yp1,xp2,yp2);
    }
    
    private void paintRecursivo(Graphics  g, int i,
                                double xp12, double yp12,
                                double xp22, double yp22)
    {
        double dx = (xp22 - xp12) / 3.;
        double dy = (yp22 - yp12) / 3.;
        double xx = xp12 + 3 * dx / 2. - dy * sin60;
        double yy = yp12 + 3 * dy / 2. + dx * sin60;
        
        if (i <= 0)
        {
            g.drawLine((int) xp12, (int) yp12, (int) xp22, (int) yp22);
            g.drawLine((int) xx,   (int) yy,   (int) xp12, (int) yp12);
            g.drawLine((int) xp22, (int) yp22, (int) xx,   (int) yy);
        }
        else
        {
            paintRecursivo(g, i -1, xp12,      yp12,      xp12 + dx, yp12 + dy);
            paintRecursivo(g, i -1, xp12 + dx, yp12 + dy, xx,        yy);
            paintRecursivo(g, i -1, xx,        yy,        xp22 - dx, yp22 - dy);
            paintRecursivo(g, i -1, xp22 - dx, yp22 -dy,  xp22,      yp22);
            
            g.drawLine((int) xp12, (int) yp12, (int) xp22, (int) yp22);
            g.drawLine((int) xp12, (int) yp12, (int) xp22, (int) yp22);
        }
    }
}
