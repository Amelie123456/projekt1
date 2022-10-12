import java.awt.Color;
import java.awt.Graphics;

public class PaintableOval extends SimpleOval implements Paintable{
    
    public PaintableOval(double x, double y, double width, double height){
        super (new Vertex(x,y),width, height);
    }
    
    

    public void paintTo (java.awt.Graphics g){ 
        Color myColor=new Color(0, 0, 0);
        g.setColor(myColor);
        g.fillOval((int)pos.x,(int)pos.y,(int)width,(int)height);
    }

    
    


}
