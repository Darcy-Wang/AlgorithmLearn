/**
 * Created by Darcy on 2016/10/29.
 */
/**
 * Returns a index to the first occurrence of target in source,
 * or -1  if target is not part of source.
 * @param source string to be scanned.
 * @param target string containing the sequence of characters to match.
 */
public class strStr {
    public static int strStr(String source, String target) {
        //write your code here
        int isSubstr = 0;
        int index = 0;

        if ( source == null || target == null )
            return -1;

        if ( target == "")
            return 0;

        for (int i = 0; i < source.length()-target.length()+1; i++) {
            if(target.charAt(0) == source.charAt(i)){
                isSubstr = 1;
                index = i;
                for (int j = 1; j < target.length(); j++) {
                    if(target.charAt(j) != source.charAt(i+j)){
                        isSubstr = 0;
                        break;
                    }
                }
                if(isSubstr == 1)
                    return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("source", "rced"));
    }
}
