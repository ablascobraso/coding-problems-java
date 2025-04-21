import java.util.Arrays;

public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length-1];
        int idx = 0;

        while(idx < firstStr.length() && idx < lastStr.length()){
            if(firstStr.charAt(idx) == lastStr.charAt(idx)){
                idx++;
            }
            else {
                break;
            }
        }
        return firstStr.substring(0, idx);
    }

    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "flower";
        strings[1] = "flow";
        strings[2] = "flight";
        String s = longestCommonPrefix(strings);
        System.out.println(s);
    }

}
