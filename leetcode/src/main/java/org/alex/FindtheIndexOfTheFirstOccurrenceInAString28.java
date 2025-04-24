public class FindtheIndexOfTheFirstOccurrenceInAString28 {

    public static int strStr(String haystack, String needle) {
        int needleIndex = 0;
        for(int i = 0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(needleIndex)){
                if(needleIndex == needle.length()-1){
                    return i - needleIndex;
                }
                needleIndex++;
            }
            else{
                i = i - needleIndex;
                needleIndex = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle  = "issip";

        System.out.println("First occurrence: " + strStr(haystack, needle));
    }
}
