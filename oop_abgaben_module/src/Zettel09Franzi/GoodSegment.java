package Zettel09Franzi;

import Zettel9.GoodsSegment;

import java.util.Arrays;

public class GoodSegment {
    public double height;
    public double width;
    public double depth;
    public double weight;
    public GoodCrate[] compartments;

    GoodSegment(double height, double width, double depth, double weight){
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
        this.compartments = new GoodCrate[9];
    }
    public void addCrate(GoodCrate crate){

        if (crate.weight > this.weight){
            System.out.println("Crate is too heavy it doesn't fit.");
        }
        double[] crateMeasurements = {crate.width,crate.height,crate.depth};
        double[] compMeasurements = {this.height/3,this.width/3, this.depth/3};
        Arrays.sort(compMeasurements);
        Arrays.sort(crateMeasurements);
        for (int i= 0; i < compMeasurements.length; i++){
            if (crateMeasurements[i]>compMeasurements[i]) {
                System.out.println("The crate is too big, it doesn't fit");
            } else {
                for(GoodCrate compartments : compartments) {
                    if (compartments==null) {
                        compartments = crate;
                        System.out.println("The crate fits.");
                        break;
                    }
            }
        }
    }


    }



}
