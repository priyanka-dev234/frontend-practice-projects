import java.util.*;

class home {
    public static int leng(String a) {
        return a.length() - 2;
    }

    public static String find(String a) {
        if (a.length() <= 10)
            return a;

        int len = leng(a);
        String ans = a.charAt(0) + String.valueOf(len) + a.charAt(a.length() - 1);
        return ans;
    }

    public static void main(String args[]) {
        String a = "pneumonoultramicroscopicsilicovolcanoconiosis";
        System.out.print(find(a));
    }
}