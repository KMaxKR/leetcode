package plusOne;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        String value = "";
        for (Integer el : digits){
            value += el;
        }

        long val = Long.parseLong(value) + 1;
        int length = String.valueOf(val).length();

        int[] res = new int[length];
        for (int i = length - 1; i >= 0; i--){
            res[i] = (int)val%10;
            val /= 10;
        }
        for (Integer el : res) System.out.print(el);
        return res;
    }
}
