import java.io.*;
import java.util.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int minLength = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < num; i++) {
            String word = br.readLine();
            if(word.length()>=minLength){
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        list.sort((e1, e2) -> e2.getKey().length() - e1.getKey().length());
        list.sort((e1,e2) -> e2.getValue() - e1.getValue());
        for (Map.Entry<String,Integer> entry : list) {
            bw.write(entry.getKey()+"\n");
        }
        bw.flush();   //남아있는 데이터를 모두 출력시킴
    }

}