package com.chb;

import com.google.inject.*;
import com.google.gson.*;
import com.google.gson.reflect.*;
import java.util.*;

public class Main{

    public static void main(String[] args){
        System.out.println("hello !!!");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        //------------obj------------------
        Bicycle bicycle = new Bicycle("blue", 23);
        String bicycleJson = gson.toJson(bicycle);

        System.out.println("java obj: bicycle("+bicycle.hashCode()+")==> bicycleJson:"+ bicycleJson);

        bicycle = gson.fromJson(bicycleJson,Bicycle.class);

        System.out.println("bicycleJson:"+bicycleJson+"==>java obj:"+bicycle.hashCode());


        // -----------------obj array-------------
        ArrayList<Bicycle> bicycleList = new ArrayList<>();

        bicycleList.add(bicycle);
        bicycleList.add(new Bicycle("black", 30));
        String bicycleListJson = gson.toJson(bicycleList);
        System.out.println("bicycleList:"+bicycleList+"==> Json:" + bicycleListJson);

        bicycleList = gson.fromJson(bicycleListJson,new TypeToken<ArrayList<Bicycle>>(){}.getType() );

        System.out.println("Json:" + bicycleListJson+ "==>bicycleList:" + bicycleList);


        //------------------HashMap-----------------
        HashMap<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        String mapJson = gson.toJson(map);
        System.out.println("map:" + map+ "==> Json:" + mapJson);


    }
}
