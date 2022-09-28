public class GeometricObject {
    Vertex pos;
    double width;
    double height;

    public GeometricObject(Vertex pos, double width, double height){
        this.pos=pos;
        this.width=width;
        this.height=height;

        if (width < 0){
            this.width= -width;
        }
        
        if (height < 0){
            this.height= -height;
        }

        if (pos.x < 0){
            this.pos.x= -pos.x;
        }

        if (pos.y < 0){
            this.pos.y= -pos.y;
        }
    }

    public GeometricObject(double x, double y, double width, double height){
        this(new Vertex(x,y),width, height);
    }

    public GeometricObject(double width, double height){
        this(0,0,width,height);
    }

    public GeometricObject(double width){
        this(width,width);
    }

    public double getWidth(){return (width);}
    public double getHeight(){return (height);}

    public Vertex getPos(){return (pos);}

    public String toString(){
        return "width=" +width+"height=" +height+"pos="+pos;
    }
}