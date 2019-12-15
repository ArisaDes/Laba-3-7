package com;

public class For {
    public static void main (String args[]) {
        System.out.println("Всего в командной строке: "
                +args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Nihao " + args[i] + "!");
        }
    }
}

1