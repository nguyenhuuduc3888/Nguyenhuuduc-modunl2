package ss4_Class_Ojb.QuadraticEquation;

public class QuadraticEquation {
  private   double a,b,c;
    public QuadraticEquation(double a,double b ,double c){
         this.a = a;
         this.b = b;
         this.c = c;
    }
    public double  getDiscriminant(){
        double delta = b*b -4*a*c;
        return delta;
    }
    public double getRoot1(){           //dinh nghia phuong thuc 2
        if(this.getDiscriminant()<0) return 0;
        return ((-b+Math.sqrt(this.getDiscriminant()))/(2*a));
    }
    public double getRoot2(){        //dinh nghia phuong thuc 3
        if(this.getDiscriminant()<0) return  0;
        return  ((-b-Math.sqrt(this.getDiscriminant()))/(2*a));
    }
}
