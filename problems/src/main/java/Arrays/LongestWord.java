package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestWord {
    // determining the largest word in a string.
    //Solutions:
    //1. convert string to arraylist splitting based on space
    //2. we just need to get th length of of each element of the list


    static int length=0;
    static String longestword="";

    public static void  main(String args[]){

        String str= "Hello my friendsof me. How are you amazingly folks doing";
        ArrayList<String> list= new ArrayList<String>(Arrays.asList(str.split(" ",0)));

        System.out.println(list);

        list.forEach((element)->{
            if(element.length()>length){
                setlongestword(element);
            }
        });
        System.out.println("longest word is :" + longestword);
    }

    public static void setlongestword(String element){
        length=element.length();
        longestword=element;
    }


}
