package net.naji.template;

public class TemplateImp2 extends Template{

    @Override
    protected int detail1(double input) {
       return (int) (Math.atan(input));

    }

    @Override
    protected double detail(double x, double y, int param) {
        double w=x*y/param;
        return w+param;
    }
}
