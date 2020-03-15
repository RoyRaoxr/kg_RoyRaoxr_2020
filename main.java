import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];
        System.out.printf("%s\n", str1);
        System.out.printf("%s\n", str2);
        System.out.printf("%s\n", check(str1, str2));

    }
    
    private static boolean check(String s1, String s2) {
        if (s2.length() != s1.length()) return false;
        if (s1 == null || s2 == null) return false;
        int[] map = new int[256];
        Arrays.fill(map, -1);
        for (int i = 0; i < s1.length(); i++) {
            if (map[s1.charAt(i)] == -1) {
                map[s1.charAt(i)] = s2.charAt(i);
            } else if (map[s1.charAt(i)] != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}