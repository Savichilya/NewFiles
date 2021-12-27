package com.company;

public class Massiv1 {
    private int[] mas;
    Massiv1 (int[]a)
    {
        mas=a;
    }
    public void show()
    {
try {
    for (int i=0; i< mas.length+1; i++) {
        System.out.println(mas[i]);
    }
}catch (ArrayIndexOutOfBoundsException e)
{
    System.out.println("выход за пределы массива"+e);
}
    }
}
