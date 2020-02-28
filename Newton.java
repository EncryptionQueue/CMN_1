/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobarsa;

/**
 *
 * @author AlfajriAkbar
 */
public class Newton {
    double a,b,c,fa,fb,fc;
    int y = 1;
    public void Newton(double a) {
        double e = 0.0001;
        
        setA(a);
        setFA(fx(getA()));
        setFC(fx1(getA()));
        setB(getA()-(getFA()/getFC()));
        setFB(fx(getB()));
        String n = y + ". "+"X1: " + getA() + " f(X1): " + fx(getA())+ " X2: " + getB() + " f(2): " + fx(getB())  + "";
            System.out.println(n);
        if(Math.abs(getFB()) >= e){
            y++;
            Newton(getB());
        }
        else{
            System.out.printf("\nThe value of root is : %.4f", getB());
        }
        
    }

    public double fx(double x) {
        double fx = (x * x * x) + (x * x) - 3 * x - 3;
        return fx;
    }
    public double fx1(double x) {
        double fx = (3 * x * x) + (2 * x) - 3 ;
        return fx;
    }
  
    
    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getFA() {
        return this.fa;
    }
    public double getFB() {
        return this.fb;
    }
    public double getFC() {
        return this.fc;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public void setFA(double fa) {
        this.fa = fa;
    }
    public void setFB(double fb) {
        this.fb = fb;
    }
    public void setFC(double fc) {
        this.fc = fc;
    }
}
