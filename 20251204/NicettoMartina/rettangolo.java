package objectos;

public class rettangolo {
    
    private int x1, x2, y1,y2;

    public rettangolo(int x1, int x2, int y1, int y2)
{
    if (x1 < x2 && y1 < y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    } else {
        System.err.println("ERROR");
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
}

   public void setx1(int x1)
    {
        if (x1 < this.x2) {
            this.x1 = x1;
        } else {
            System.err.println("ERROR");
        }
    }

    public void sety1(int y1)
    {
        if (y1 < this.y2) {
            this.y1 = y1;
        } else {
            System.err.println("ERROR");
        }
    }

    public void setx2(int x2)
    {
        if (x2 > this.x1) {
            this.x2 = x2;
        } else {
            System.err.println("ERROR");
        }
    }

    public void sety2(int y2)
    {
        if (y2 > this.y1) {
            this.y2 = y2;
        } else {
            System.err.println("ERROR");
        }
    }

    public int getx1()
    {
        return x1;
    }
    public int gety1()
    {
        return y1;
    }
    public int getx2()
    {
        return x2;
    }
    public int gety2()
    {
        return y2;
    }

    public void setX1Y1(int x1, int y1)
    {
        if (x1 < this.x2 && y1 < this.y2) {
            this.x1 = x1;
            this.y1 = y1;
        } else {
            System.err.println("ERROR");
        }
    }

    public void setX2Y2(int x2, int y2)
    {
        if (x2 > this.x1 && y2 > this.y1) {
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR");
        }
    }


    public void setAll(int x1, int x2, int y1, int y2)
    {
        if (x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        } else {
            System.err.println("ERROR");
        }
    }

    public int getArea()
    {
        return (x2 - x1) * (y2 - y1);
    }

    public int getPerimetro()
    {
        return 2 * ((x2 - x1) + (y2 - y1));
    }


    public void resultado() {
        System.out.println("Rectángulo:");
        System.out.println("  Esquina inferior izquierda: (" + x1 + ", " + y1 + ")");
        System.out.println("  Esquina superior derecha:   (" + x2 + ", " + y2 + ")");
    }

}
