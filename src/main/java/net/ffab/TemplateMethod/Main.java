package net.ffab.TemplateMethod;

import net.ffab.TemplateMethod.Template.TemplateImpl1;
import net.ffab.TemplateMethod.Template.Template;
import net.ffab.TemplateMethod.Template.TemplateImpl2;

public class Main {
    public static void main(String[] args)  throws Exception{
        Template template=new TemplateImpl1();
        System.out.println(template.computeTemplate(6, 90));
        template=new TemplateImpl2();
        System.out.println(template.computeTemplate(6, 90));

    }
}