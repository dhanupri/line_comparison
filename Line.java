import java.util.Scanner;

public class Line {
    private static point startpoint;
    private static point endpoint;

    Line(point startpoint,point endpoint){
       this.startpoint=startpoint;
       this.endpoint=endpoint;
    }

    public static double calculatelength(){
        double x1=startpoint.getX();
        double y1=startpoint.getY();
        double x2=endpoint.getX();
        double y2=endpoint.getY();

        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO LINE COMPARISON COMPUTATION");
        point startpoint=new point(sc.nextInt(), sc.nextInt());
        point endpoint=new point(sc.nextInt(),sc.nextInt());
        Line line=new Line(startpoint,endpoint);
        double length=Line.calculatelength();
        System.out.println(length);

    }


}
class point{
    double x;
    double y;
    point(double x,double y){
        this.x=x;
        this.y=y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
