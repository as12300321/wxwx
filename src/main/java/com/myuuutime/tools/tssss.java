package com.myuuutime.tools;

import java.util.*;

public class tssss {
    public tssss(Collection test) {

    }
    public static String  tssss(Set s){return "Set";}
    public static String  tssss(List s){return "List";}
    public static String  tssss(Collection s){return "Unknown Collection";}

    public static void main(String[] args) {
        Collection[] tests =new Collection[]{
                new HashSet(),
                new ArrayList(),
                new HashMap().values()
        };
        for(int i=0;i<tests.length;i++){
            System.out.println( tssss(tests[i]));
        }
    }
}
