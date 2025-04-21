import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 1)  {
            return List.of(List.of(1));
        }
        if(numRows >= 2){
            result.add(List.of(1));
            result.add(List.of(1, 1));
        }
        for(int i = 2; i<numRows; i++) {
            List<Integer> prev = result.get(i-1);
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0; j+1<prev.size(); j++){
                temp.add(prev.get(j) + prev.get(j+1));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {

        List<List<Integer>> generated = generate(5);
        generated.forEach(l -> l.forEach(System.out::println));
    }
}

