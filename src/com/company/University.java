package com.company;

public class University {
    private static String name, rektor;
    private static int koef;
    University (String a, String b, int c)
    {
        name=a;
        rektor=b;
        koef=c;
    }
    public static class Faculty{
        private static String nameF;
        private static int kafedra, student;
        Faculty (String x, int y, int z)
        {
            nameF=x;
            kafedra=y;
            student=z;
        }
        public static int premii ()
        {
            int p=student*20*koef;
            return p;
        }
        public static void show ()
        {
            System.out.println("Университет "+name+" ректор "+rektor+" факультет "+nameF+" количество кафедр "+kafedra+" сумма премий на кафедру = "+premii());
        }

    }
}
