import java.util.HashMap;

public class RomanToInteger13 {
    public static int romanToInt(String s) {

        HashMap<Character, Integer> symbolToValue = new HashMap<>();
        symbolToValue.put('I', 1);
        symbolToValue.put('V', 5);
        symbolToValue.put('X', 10);
        symbolToValue.put('L', 50);
        symbolToValue.put('C', 100);
        symbolToValue.put('D', 500);
        symbolToValue.put('M', 1000);

        int result = 0;
        Integer lastValue = null;

        for(int i = 0; i<s.length(); i++){
            int value = symbolToValue.get(s.charAt(i));
            if(lastValue == null){
                result += value;
            }
            else if(value <= lastValue) {
                result += value;
            }
            else {
                result += (value - lastValue * 2);

            }
            lastValue = value;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = romanToInt("MCMXCIV");
        System.out.println(i);
    }
}
