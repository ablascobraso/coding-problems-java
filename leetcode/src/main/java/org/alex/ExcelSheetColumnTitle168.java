public class ExcelSheetColumnTitle168 {

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            result.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }


    public static void main(String[] args) {
        String result = convertToTitle(701);
        System.out.println(result);
    }
}

