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
public class Regulafalsi {

    double a, b, c, fa, fb, fc;
    double e = 0.0001;

    public void Regulafalsi(double x1, double x2) { //1
        String n = "";
        int z= 1;
        setA(x1);
        setFA(fx(x1));
        setB(x2);
        setFB(fx(x2));
        setC(xt1(getA(), getB()));
        setFC(fx(getC()));
        while (Math.abs(getFC()) >= e) {
            setC(xt1(getA(), getB()));
            setFC(fx(getC()));
            n = z+". "+"Xn:" + getA() + " Xn+1:" + getB() + " Xt:" + getC() + " f(Xn): " + getFA() + " f(Xn+1): " + getFB() + " f(Xt): " + getFC() + " f(Xt).f(Xn):" + getFC() * getFA() + "\n";
            System.out.print(n);
            if (getFA() * getFC() < 0) {
                setB(getC());
                setFB(getFC());
            } else {
                setA(getC());
                setFA(getFC());
            }
            z++;
        }
        System.out.print("\nakar :" + getC());

    }



    public double fx(double x) {
        double fx = (x * x * x) + (x * x) - 3 * x - 3;
        return fx;
    }

    public double xt1(double x1, double x2) {
        //double xt =  (x1 - fx(x1)) * ((x2-x1)/(fx(x2)-fx(x1)));

        double xt = ((x1 * fx(x2)) - (x2 * fx(x1))) / (fx(x2) - fx(x1));
        return xt;
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
