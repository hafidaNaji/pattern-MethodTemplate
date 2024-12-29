package net.naji.template;

public abstract class Template {
    public double computeTemplate (double x, double y){
        double data = x*y;
        int param= detail1(data);
        double somme = y;
        for (int i = 0; i < param; i++) {
            double value = detail(x,y,param);
            somme+=value;
        }
        return somme;
    }
    protected abstract int detail1(double input);
    protected abstract double detail(double x,double y, int param);

}
