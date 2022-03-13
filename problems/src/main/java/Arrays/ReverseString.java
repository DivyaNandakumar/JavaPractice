package Arrays;

public class ReverseString {

    static String reverse(String str) {

        char[] reversedstring = str.toCharArray();
        char temp;
        int backindex=str.length()-1;
        int length=str.length();
        for (int index = 0; index <= length / 2; index++) {
            temp=reversedstring[backindex];
            reversedstring[backindex]=reversedstring[index];
            reversedstring[index]=temp;
            backindex--;
        }

        StringBuilder stb=new StringBuilder("");
        stb.append(reversedstring);
        return stb.toString();
    }

    static String reversewithBuilder(String str) {

        StringBuilder stb=new StringBuilder(str);
        return stb.reverse().toString();
    }

    public static void main(String[] args){

        System.out.println(reverse("hello there"));

        System.out.println(reversewithBuilder("who are you"));

    }


}
