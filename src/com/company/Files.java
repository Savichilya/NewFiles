package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.spec.ECField;

public class Files {
    private File f;
    private String filename;

    Files(String a) {
        filename = a;
        f = new File(filename);
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

    public boolean NewDelete() {
        boolean del = false;
        try {
            if (f.delete()) {
                del = true;
            }
        } catch (Exception x) {
            System.out.println("Ошибка" + x);
        }
        return del;
    }

    public String getName() {
        String newtext = "";
        try {
            newtext = f.getName();
        } catch (Exception y) {
            System.out.println("Ошибка" + y);
        }
        return newtext;

    }

    public String getParent() {
        String newtext1 = " ";
        try {
            newtext1 = f.getParent();
        } catch (Exception z) {
            System.out.println("Ошибка" + z);
        }
        return newtext1;
    }

    public long lenghtName() {
        long r = f.length();
        return r;
    }

    public void WriteFile(int[] mas) throws IOException {
        try {
            FileWriter writer = new FileWriter(f);
            for (int i = 0; i < mas.length; i++) {
                writer.write(mas[i]);
                writer.flush();
            }
            //  writer.close();
        } catch (Exception n) {
            System.out.println("Ошибка" + f);
        }

    }

    public int NewRead() {
        int i = 0;
        try {
            FileReader fr = new FileReader(f);
            while ((i = fr.read()) != -1)
                System.out.print((char) (i));
        } catch (Exception o) {
            System.out.println("Ошибка" + o);
        }
        return i;
    }



}
