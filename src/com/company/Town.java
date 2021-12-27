package com.company;

public class Town {
    private int postcode;
    private String town;

    Town(int a, String b)
    {
        postcode=a;
        town=b;
    }

    public static class Street{
        private static String street;
        private static int numberHouse;
        Street(String x, int y)
        {
            street=x;
            numberHouse=y;
        }

    }
    public void show ()
    {
        System.out.println("Адрес: г."+town+" , улица "+Street.street+" , дом "+Street.numberHouse+" , почтовый индекс "+postcode);
    }
}
