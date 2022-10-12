
import util.ShowInFrame;
import javax.swing.*;

import java.awt.Dimension;
public class SizedPanel extends JPanel {

    int preferredwidth=1500;
    int preferredheight=1000;

    public SizedPanel(int w, int h){
        preferredwidth=w;
        preferredheight=h;
    }
    public SizedPanel(){}
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(preferredwidth,preferredheight);
    }

    public static void main(String[] args){
        ShowInFrame.show(new SizedPanel());
    }
    }

