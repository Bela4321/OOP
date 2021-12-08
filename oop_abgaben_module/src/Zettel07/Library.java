package Zettel07;

import java.util.Date;

public class Library {
    public final String NAME;
    private Date date = new Date();
    public DVD[] dvd_collection; //private

    Library(String NAME, Date date, DVD[] dvd_collection) {
        this.NAME=NAME;
        this.date= date;
        this.dvd_collection = dvd_collection;
    }
    public Date getDate() {
        return this.date;
    }
    public DVD[] getDvd_collection() {
        return dvd_collection;
    }

    public void addDVD(DVD dvd) {
        DVD[] newCollection = new DVD[this.dvd_collection.length+1];
        for (int i=0;i<this.dvd_collection.length;i++) {
            newCollection[i] = this.dvd_collection[i];
        }
        newCollection[newCollection.length-1] = dvd;
        this.dvd_collection = newCollection;
    }

    public void removeDVD(String title) {
        int counter =0;
        for (DVD dvd: this.dvd_collection) {
            if (dvd.TITLE.equals(title)) {
                counter++;
            }
        }
        DVD[] newCollection = new DVD[this.dvd_collection.length-counter];

        counter=0;
        for (DVD dvd: this.dvd_collection) {
            if (!dvd.TITLE.equals(title)) {
                newCollection[counter++]= dvd;
            }
        }
        this.dvd_collection = newCollection;
    }
    public boolean doIOwn(String dvdTitle) {
        for (DVD myDVD:this.dvd_collection) {
            if (myDVD.TITLE.equals(dvdTitle)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Library myDVDCollection=new Library("MyCollection",new Date(),new DVD[0]);


        Actor[] actors1 = {new Actor("Rick","Astley",new Date(1966,1,6)),new Actor("Camera","Guy",new Date())};
        myDVDCollection.addDVD(new DVD("Never gonna give you up","1234",new Director("Rick","Astley",new Date(1966,1,6)), actors1));
        Actor[] actors2 = {new Actor("Dinosour","one",new Date(-200000000,2,12)),new Actor("Dinosour","two",new Date(-200000000,5,15))};

        myDVDCollection.addDVD(new DVD("Jurassic Park","420",new Director("Michael", "Jordan", new Date(1820,1,31)),actors2));
        Actor[] actors3 = new Actor[0];
        myDVDCollection.addDVD(new DVD("Seven Minutes of Silence","69420",new Director("Stephen", "Hawking",new Date(0,0,0)),actors3));
        Actor[] actors4 = {new Actor("Bela", "Schinke",new Date(2100)), new Actor("Michel","Poesze",new Date(1969)), new Actor("Franzi", "Sitek",new Date(2004,1,29))};
        myDVDCollection.addDVD(new DVD("Der neue OOP Zettel -- Ein Drama in drei Akten -- Teil 1","314159", new Director("OOP Zettel 7","Aufgabe 1",new Date(2021,11,6)),actors4));
        myDVDCollection.addDVD(new DVD("Der neue OOP Zettel -- Ein Drama in drei Akten -- Teil 2","951413", new Director("OOP Zettel 7","Aufgabe 2",new Date(2021,11,6)),actors4));
        myDVDCollection.addDVD(new DVD("Der neue OOP Zettel -- Ein Drama in drei Akten -- Teil 3","314159", new Director("OOP Zettel 7","Aufgabe 3",new Date(2021,11,6)),actors4));


        myDVDCollection.removeDVD("Jurassic Park");
        myDVDCollection.removeDVD("Der neue OOP Zettel -- Ein Drama in drei Akten -- Teil 2");


        System.out.println(myDVDCollection.doIOwn("Seven Minutes of Silence"));
        System.out.println(myDVDCollection.doIOwn("Der neue OOP Zettel -- Ein Drama in drei Akten -- Teil 2"));
    }
}
