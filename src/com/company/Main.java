package com.company;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
/*

        int []mas ={1,3,4,5,6};
        String filename = "E:\\text1.txt";
        Files myFile = new Files(filename);
        System.out.println(myFile.newFile());
      //  System.out.println(myFile.NewDelete());
        System.out.println(myFile.getName());
        System.out.println(myFile.getParent());
        System.out.println(myFile.lenghtName());
        myFile.WriteFile(mas);
        System.out.println(myFile.NewRead());
 */
        /////////////////////////////////////////////////////////////////////////////

/*
        String text = "1-t line\n" +
            "2-d line\n" +
            "3-d line\n" +
            "4-th line\n" +
            "5-th line";
    String fileway = "E:\\text.txt";
    Files1 myFile1 = new Files1(fileway);
    System.out.println(myFile1.newFile());
    myFile1.WriteFile(text);
        System.out.println(myFile1.Reader());
        myFile1.NewFile();
*/

        /////////////////////////////////////////////////////////////////////
/*
    int []mas ={1,3,4,5,6};
        String fileway = "E:\\text.txt";
        Massiv myFile = new Massiv(fileway);
       // System.out.println(myFile.newFile());
       // myFile.WriteFile(mas);
        System.out.println(myFile.Reader());
        System.out.println(myFile.schet());
 */
        ///////////////////////////////////////////////////////////////////////////
        /*
        Week newday;
        Scanner in=new Scanner(System.in);
        System.out.println("введите день недели");
        newday= Week.valueOf(in.next());
        //Week Day=Week.;

        Analis newAnalis=new Analis(newday);
        newAnalis.NewAnalis();
      /*  for (Week w :Week.values())
             {
                 Analis newAnalis=new Analis(w);
                 newAnalis.NewAnalis();
             }*/
        /////////////////////////////////////////////////////////////////
        /*
        int [] mas= {1,2,3};
    Massiv1 mass=new Massiv1(mas);
    mass.show();
      */
        /////////////////////////////////////////////////////////////////
       /*
        String town, street;
        int postcode, numberHouse;
        Scanner in = new Scanner(System.in);
        System.out.println("введите поочередно город, улицу, дом и почтовый индекс");
        town = in.nextLine();
        street = in.nextLine();
        numberHouse = in.nextInt();
        postcode = in.nextInt();
        Town city =new Town(postcode, town);
        Town.Street str = new Town.Street(street, numberHouse);
      // Town.Street str = city.new Street(street, numberHouse);
        city.show();
        */
        ///////////////////////////////////////////////////////////////////////////////
        /*
        String name, rektor, nameF;
        int koef, kafedra, student;
        Scanner in = new Scanner(System.in);
        System.out.println("введите поочередно название университета, имя ректора, название факультета и количество кафедр");
        name = in.nextLine();
        rektor = in.nextLine();
        nameF = in.nextLine();
        kafedra = in.nextInt();
        System.out.println("введите коэфициент и количество студентов");
        koef = in.nextInt();
        student = in.nextInt();
        University university = new University(name, rektor,koef);
        University.Faculty faculty=new University.Faculty(nameF, kafedra,student);
       // University.Faculty fac=university.new Faculty(nameF, kafedra,student);
        faculty.show();
*/
        ///////////////////////////////////////////////////////////////////////////////////////////
       /*
        int[] mas = {3,4,5,9,8,6,5,4,3,7,8,9,4};
         Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
         int k=1;
         for (int i=0; i< mas.length; i++)
         {
             if (hashmap.containsKey (mas[i])==false)
             {
                 hashmap.put(mas[i], k);
             }
             else
             {
                 int value = hashmap.get(mas[i]);
                 hashmap.put(mas[i], value+1);
             }

         }
         System.out.println(hashmap);
        */
/*
        int a = (int) (Math.random() * 11);
        System.out.println(a);
        int x;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("введите число");
            x= in.nextInt();
            if (x>a)
            {
                System.out.println("слишком большое, попробуйте еще");
            }
            if (x<a)
            {
                System.out.println("слишком маленькое, попробуйте еще");
            }
        }
        while (x!=a);
        System.out.println("вы угадали");
         */
        //////////////////////////////////////////////////////////////////////////////////
        String str = "1kj43k51j";
        int k=0;
        for (int i=0; i<str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                int b = Integer.parseInt(String.valueOf(str.charAt(i)));
                k=k+b;
            }

        }
        System.out.println(k);

        System.out.println();
        System.out.println();
        System.out.println();
    }
}
