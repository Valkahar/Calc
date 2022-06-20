public class Calculation {
    public static void Arithmetic_Expression(String expressions) throws Exception {
        int summ = 0;
        if (expressions.equals("+"))
            summ = Main.input1Int + Main.input2Int;
        else if (expressions.equals("-"))
            summ = Main.input1Int - Main.input2Int;
        else if (expressions.equals("*"))
            summ = Main.input1Int * Main.input2Int;
        else if (expressions.equals("/"))
            summ = Main.input1Int / Main.input2Int;
        else throw new Exception("Некорректный ввод данных");

        if (Main.input1B) {
            StringBuilder ans = new StringBuilder();
            if (summ == 40) {
                System.out.println("XL");
            } else if (summ == 42) {
                System.out.println("XLII");
            } else if (summ == 45) {
                System.out.println("XLV");
            } else if (summ == 48) {
                System.out.println("XLVIII");
            } else if (summ == 49) {
                System.out.println("XLIX");
            } else if (summ == 90) {
                System.out.println("XC");
            } else {
                while (summ >= 100) {
                    ans.append("C");
                    summ -= 100;
                }
                while (summ >= 50) {
                    ans.append("L");
                    summ -= 50;
                }
                while (summ >= 10) {
                    ans.append("X");
                    summ -= 10;
                }
                if (summ == 1) ans.append("I");
                else if (summ == 2) ans.append("II");
                else if (summ == 3) ans.append("III");
                else if (summ == 4) ans.append("IV");
                else if (summ == 5) ans.append("V");
                else if (summ == 6) ans.append("VI");
                else if (summ == 7) ans.append("VII");
                else if (summ == 8) ans.append("IIX");
                else if (summ == 9) ans.append("IX");
                System.out.println(ans);
            }
        } else System.out.println(summ);
    }
}
