package net.naji.template;

public class TemplateImp1 extends Template{

    @Override
    protected int detail1(double input) {
       return (int) (Math.sqrt(input));

    }

    @Override
    protected double detail(double x, double y, int param) {
        double w=x/y;
        return w*param;
    }
}
