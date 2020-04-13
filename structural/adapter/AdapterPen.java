package com.example.hateoas.structural.adapter;

import com.example.hateoas.structural.adapter.incompatibleInterface.BollPen;

public class AdapterPen implements Pen {

//    Example of Adapter Design Pattern
//    BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
    //List<String> strings= Arrays.asList("dfjd","dfhfh");

    BollPen bollPen = new BollPen();

    @Override
    public void write(String str) {
        bollPen.mark(str);
    }
}
