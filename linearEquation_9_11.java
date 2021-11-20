package week7;
import java.util.Scanner;
public class linearEquation_9_11 {
    public static void main(String[] args) {
        System.out.print("Enter a,b,c,d,e,f��");
        LinearEquation q = new LinearEquation();
        Scanner input = new Scanner(System.in);
        q.setA(input.nextDouble());
        q.setB(input.nextDouble());
        q.setC(input.nextDouble());
        q.setD(input.nextDouble());
        q.setE(input.nextDouble());
        q.setF(input.nextDouble());

        if(!q.isSolvable()) System.out.println("The equation has no solution");
        else {
            System.out.println("x = " + q.getX() + " , y = " + q.getY());
        }
    }
}
class LinearEquation{
    private double a,b,c,d,e,f;
    //����a,b,c,d,e,f
    public void setA(double x) { a = x; }
    public void setB(double x) { b = x; }
    public void setC(double x) { c = x; }
    public void setD(double x) { d = x; }
    public void setE(double x) { e = x; }
    public void setF(double x) { f = x; }

    //��ȡa,b,c,d,e,f
    public double getA() { return a;}
    public double getB() { return b;}
    public double getC() { return c;}
    public double getD() { return d;}
    public double getE() { return e;}
    public double getF() { return f;}

    //�жϷ�ĸ�Ƿ�Ϊ0
    public boolean isSolvable(){
        if(a * d - b * c != 0) return true;
        else return false;
    }

    //���ط��̵Ľ�
    public double getX() {
        return (e * d - b * f)/(a * d - b * c);
    }
    public double getY() {
        return (a * f - e * c)/(a * d - b * c);
    }
}
