package romanToInteger;

import java.util.Map;

public class romanToInteger {
    Map<Character, Integer> list = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );
    public int romanToInt(String s) {
        int output = 0;
        int count = 0;
        char[] ch_list = s.toCharArray();
        while (count < ch_list.length){
            if (count + 1 >= ch_list.length){
                output += list.get(ch_list[count]);
                break;
            }
            if (list.get(ch_list[count]) >= list.get(ch_list[count + 1])){
                output += list.get(ch_list[count]);
            }else {
                output += (list.get(ch_list[count + 1]) - list.get(ch_list[count]));
                count++;
            }
            count++;
        }
        return output;
    }

}
