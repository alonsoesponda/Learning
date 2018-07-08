/*

Hackerrank Challenge: Dictionaries and Maps
URL: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

 */

import java.util.*;
import java.io.*;

class DictionariesMapsSolution{

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s)){
                System.out.println(phoneBook.get(s));
            }else
                System.out.println("Not found");
        }
        in.close();
    }
}