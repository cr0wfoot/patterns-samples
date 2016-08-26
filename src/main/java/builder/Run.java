package builder;

import builder.simple.SelectorBuilder;

public class Run {

    public static void main(String[] args) {

        SelectorBuilder select;
        System.out.println("Build SELECT FROM DB:\n");

        select = new SelectorBuilder.Builder(4).name("Alex").years(25).position("manager").salary(12000.0).build();
        System.out.println(select);

        select = new SelectorBuilder.Builder(5).name("Peter").years(32).position("manager").salary(15000.0).build();
        System.out.println(select);

        select = new SelectorBuilder.Builder(6).name("John").years(29).position("manager").salary(11000.0).build();
        System.out.println(select);
    }
}
