package com.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Robots robot1 = new Robots("Anatoliy",17);

        robot1.PrintParament();
        
        robot1.setName("Bogdan");
        robot1.setHight(178);
        robot1.setWarm(true);

        robot1.PrintParament();

    }

}
