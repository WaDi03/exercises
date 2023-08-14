public class Distanz {
    public static void main (String args[]){
        Punkt p1 = new Punkt(5,5);
        Punkt p2 = new Punkt(1,9);
        Punkt p3 = new Punkt(7,18);

        Punkt hbf = new Punkt(365704.375, 5621780.764);
        Punkt pt = new Punkt(367989.159, 5619855.585);
        System.out.println(p2);
        System.out.println(hbf.berechneDistanz(pt));
    }
}