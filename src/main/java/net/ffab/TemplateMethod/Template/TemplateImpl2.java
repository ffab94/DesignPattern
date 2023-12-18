package net.ffab.TemplateMethod.Template;

public class TemplateImpl2 extends Template{
    @Override
    protected double detail2(double x, double y, int param) {
        double w = x*y/param;
        return w;
    }

    @Override
    protected int detail1(double data) {
        return (int)Math.atan(data);
    }
}
