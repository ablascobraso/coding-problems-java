import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII119 {
    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        if (rowIndex == 0)  {
            return List.of(1);
        }
        if(rowIndex >= 1){
            result.add(List.of(1));
            result.add(List.of(1, 1));
        }
        for(int i = 2; i<=rowIndex; i++) {
            List<Integer> prev = result.get(i-1);
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0; j+1<prev.size(); j++){
                temp.add(prev.get(j) + prev.get(j+1));
            }
            temp.add(1);
            result.add(temp);
        }
        return result.get(rowIndex);
    }

    public static void main(String[] args) {
        List<Integer> generated = generate(5);
        generated.forEach((System.out::println));
    }
}

