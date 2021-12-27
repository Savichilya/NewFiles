package com.company;

public class Analis {
    private Week day;

    Analis(Week d) {
        day = d;
    }

    public void NewAnalis() {
switch (day)
{
    case SUNDAY:
        System.out.println("второй выходной");
        break;
    case WEDNESDAY:
        System.out.println("маленькая пятница");
        break;
    case FRIDAY:
        System.out.println("день перед выходными");
        break;
    case SATURDAY:
        System.out.println("первый выхлоной");
        break;
}





    }
}
