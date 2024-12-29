package net.naji;

import net.naji.template.Template;
import net.naji.template.TemplateImp1;
import net.naji.template.TemplateImp2;

public class Main {
    public static void main(String[] args) {
        Template template = new TemplateImp1();
        System.out.println(template.computeTemplate(6,90));
        template = new TemplateImp2();
        System.out.println(template.computeTemplate(6,90));

    }
}