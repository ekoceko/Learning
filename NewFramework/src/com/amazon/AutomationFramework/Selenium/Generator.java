package com.amazon.AutomationFramework.Selenium;

public class Generator {



    public static String GenerateListName() {
        StringBuilder randomName = new StringBuilder();
        int postfix = (int) (Math.random()*10);
        String prefix[] = {"My List", "The List", "Eko Shopping List", "Fun List"};
        String pref = prefix[(int)(Math.random()*prefix.length)];
        randomName.append(pref);
        randomName.append(" ");
        randomName.append(postfix);
        System.out.println("name is "+ randomName.toString());
        return randomName.toString();

    }
}
