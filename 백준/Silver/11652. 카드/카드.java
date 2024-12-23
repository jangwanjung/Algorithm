import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Long,Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            Long a = Long.parseLong(br.readLine());
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }

        }
        List<Map.Entry<Long, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Long result = list.get(0).getKey();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getValue() >= list.get(0).getValue() && list.get(i).getKey() < result ) {
                result = list.get(i).getKey();
            }
        }
        System.out.println(result);
    };

}