package net.ffab.TemplateMethod.Template;

public abstract class Template {
    public double computeTemplate(double x,double y){
        double data=x*y;
        int param=detail1(data);
        double somme=y;
        for (int i = 0; i < param; i++) {
            double value=detail2(x,y,param);
            somme+=value;
        }
        return somme;

    }

    protected abstract double detail2(double x, double y, int param);

    protected abstract int detail1(double data);

}
