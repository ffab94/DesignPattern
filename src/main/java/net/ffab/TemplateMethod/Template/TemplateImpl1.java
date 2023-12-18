package net.ffab.TemplateMethod.Template;

public class TemplateImpl1 extends Template{
    @Override
    protected double detail2(double x, double y, int param) {
        double w = x/y;
        return w*param;
    }

    @Override
    protected int detail1(double data) {
        return (int)Math.sqrt(data);
    }
}
