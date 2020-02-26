package algorithm;

import java.util.HashSet;
import java.util.Set;

public class LengthofContinueSubString {
    public static void main(String[] args){
        System.out.println(longContinueSubString("abca"));
    }

    public static int longContinueSubString(String input){
        int len = input.length();
        int res = 0;
        for(int i = 0; i < len; ++i)
            for(int j = i + 1; j <= len; ++j)
                if(allUnique(input, i, j))
                    res = Math.max(res, j - i);
        return res;
    }

    public static boolean allUnique(String input, int start, int end){
        Set<Character> set = new HashSet<>();
        for(int i = start; i < end; ++i){
            Character c = input.charAt(i);
            if(set.contains(c))
                return false;
            set.add(c);
        }

        return true;
    }
}
