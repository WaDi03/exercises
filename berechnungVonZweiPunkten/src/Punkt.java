public class Punkt
{
    private double x, y;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public Punkt (double k1, double k2) {
        this.x = k1;
        setY(k2);
    }

    public String toString(){
        return "(" + x + "," + y + ")"; // (x,y)
    };

    public double berechneDistanz (Punkt p){

        //     dx =     x1 -    x2
        double dx = this.x - p.getX();

       //     dy =     y1    -  y2
       double dy = this.y - p.getY();
       double d = Math.sqrt(dx*dx + dy*dy);
            return d; };
}

