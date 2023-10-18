package com.basic.myspringboot;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class testVegan {
    public static void main(String[] args) {
        /*String address = "https://www.google.com/maps/place/%EB%B8%8C%EB%A1%9C%ED%8A%B8/data=!4m11!1m3!2m2!1z7LGE7Iud!6e5!3m6!1s0x3565b8a09867c785:0x653527d5437e9e2e!8m2!3d36.1506923!4d128.3160423!15sCgbssYTsi53gAQA!16s%2Fg%2F11fqtml6bp?entry=ttu";


        String[] splitAddress = address.split("!");
        List<String> arr = new ArrayList<>();

        for(int i=0; i<splitAddress.length; i++) {
            if(splitAddress[i].contains("3d") || splitAddress[i].contains("4d")) {
                arr.add(splitAddress[i]);
            }
        }

        for(int i=0; i<arr.size(); i++) {
            String value = arr.get(i).substring(2);
            System.out.println(value);
        }*/
        System.out.println("hello testmain");

    }

}
