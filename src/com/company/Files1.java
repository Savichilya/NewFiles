package com.company;

import java.io.*;
import java.util.Scanner;

public class Files1 {
    private File f;
    private String fileway;

    Files1(String a) {
        fileway = a;
        f = new File(fileway);
    }

    public boolean newFile() throws IOException {
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

    public void WriteFile(String a) throws IOException {
        try {
            FileWriter writer = new FileWriter(f);
            writer.write(a);
            writer.flush();
        } catch (Exception n) {
            System.out.println("Ошибка" + f);
        }

    }

    public String Reader() throws FileNotFoundException {
        String x = "";
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                x = scan.nextLine();
                System.out.println(x);
            }

        } catch (Exception q) {
            System.out.println("Ошибка" + q);
        }
        return x;
    }

    public void NewFile() throws IOException{
       //  NewText = null;
        String x = "";
        try {
            File   NewText = new File("E:\\text2.txt");
            FileWriter writer = new FileWriter(NewText);//изменила параметр,вынесла из цикла
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                x = scan.nextLine();
               // System.out.println(x);
               // FileWriter writer = new FileWriter(x);

                writer.write(x+"\n");
                writer.flush();

            }


        } catch (Exception n) {
            System.out.println("Ошибка" + n);
        }
       // return NewText;
    }


}

