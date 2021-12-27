package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Massiv {
    private File f;
    private String fileway;

    Massiv(String a) {
        fileway = a;
        f = new File(fileway);
    }

    public boolean newFile() {
        boolean bol = false;
        try {
            if (f.createNewFile()) {
                bol = true;
            }
        } catch (Exception e) {
            System.out.println("Ошибка" + e);
        }
        return bol;
    }

    public void WriteFile(int[] mas) throws IOException {
        try {
            FileWriter writer = new FileWriter(f);
            for (int i = 0; i < mas.length; i++) {
                writer.write(mas[i]);
                writer.flush();
            }
        } catch (Exception n) {
            System.out.println("Ошибка" + f);
        }

    }

    public ArrayList Reader() throws FileNotFoundException {
        Scanner scan = new Scanner(f);
        ArrayList<Integer> arr = new ArrayList<>();
        while (scan.hasNextInt()) {
            arr.add(scan.nextInt());
        }
        return arr;
    }
    public int schet () throws FileNotFoundException {
        int s=0;
        Scanner scan1 = new Scanner(f);
        ArrayList<Integer> arr = new ArrayList<>();
        while (scan1.hasNextInt()) {
            arr.add(scan1.nextInt());
        }
        for(int i=0;i<arr.size();i++) {
            s=s+arr.get(i);
        }

        return s;
    }

}
