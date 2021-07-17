package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class beerexpert {
    List<String> getBrands(String color){
        List<String> brands=new ArrayList<>();
        if(color.equals("amber")) {
            brands.add("jack amber");
            brands.add("red Moose");
        }
        else {
            brands.add("JAil pale ale");
            brands.add("gout stout");
        }
        return brands;
    }
}
