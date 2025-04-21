import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class IsomorphicStrings205 {

    private static boolean isIsomorphicPast(final String s, final String t) {

        final Map<Character, Character> correlated = new HashMap<>();
        final Set<Character> alreadySeenLetters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (correlated.containsKey(s.charAt(i))) {
                if (!correlated.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            } else {
                if (alreadySeenLetters.contains(t.charAt(i))) {
                    return false;
                }
                correlated.put(s.charAt(i), t.charAt(i));
            }
            alreadySeenLetters.add(t.charAt(i));
        }
        return true;
    }

    private static boolean isIsomorphic(final String s, final String t) {
        final Map<Character, Character> letterToIso = new HashMap<>();
        final Set<Character> alreadySeen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (letterToIso.containsKey(cs)) {
                if (!letterToIso.get(cs).equals(ct)) {
                    return false;
                }
            } else {
                if (alreadySeen.contains(ct)) {
                    return false;
                }
                letterToIso.put(cs, ct);
            }
            alreadySeen.add(ct);
        }
        return true;
    }

    public static void main(final String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }
}
