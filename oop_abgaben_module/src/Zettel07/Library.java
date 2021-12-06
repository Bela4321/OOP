package Zettel07;

import java.util.Date;

public class Library {
    public final String NAME;
    private Date date = new Date();
    private DVD[] dvd_collection;

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
    }
    public boolean doIOwn(DVD dvd) {
        for (DVD myDVD:this.dvd_collection) {
            if (myDVD.TITLE.equals(dvd.TITLE)) {
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
    }
}
