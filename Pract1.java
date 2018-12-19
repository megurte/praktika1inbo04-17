package com.company;

public class Main {
    public static void main(String[] arg)
    {
        Book b1 = new Book("Witcher","Sapkovskii",600,5);
        Book b2 = new Book("War and peace","Tolstoi",1200, 5);
        b1.Info();
        b2.Info();
    }
}

package com.company;

public class Book
{
    public String name;
    public String writer;
    public int pages;
    public int mark;

    Book(String n, String w,int p, int m)
    {
        name = n;
        writer = w;
        pages = p;
        mark = m;
    }

    public void Info(){
        System.out.println(name+" " +writer+" "+pages+" "+mark);
    }

}
