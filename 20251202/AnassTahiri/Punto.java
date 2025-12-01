

package a3.ud8;

import java.util.Random;

public class Punto {


private int x;
private int y;

public Punto(int x, int y) {
this.x = x;
this.y = y;
}

public int getX() {
return x;
}

public void setX(int x) {
this.x = x;
}

public int getY() {
return y;
}

public void setY(int y) {
this.y = y;
}


public void imprime() {
System.out.println("(" + x + ", " + y + ")");
}

public void setXY(int x, int y) {
this.x = x;
this.y = y;
}

public void desplaza(int dx, int dy) {
x += dx;
y += dy;
}

public int distancia(Punto p) {
int dx = p.x - this.x;
int dy = p.y - this.y;
return (int) Math.sqrt(dx * dx + dy * dy);
}


public static Punto creaPuntoAleatorio() {
Random r = new Random();
int x = r.nextInt(201) - 100;
int y = r.nextInt(201) - 100;
return new Punto(x, y);
}
}