import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static List<int[]> list = new ArrayList<>();
    static boolean [] visited;
    static Integer [] team;
    static int [][] arr;
    static List<Integer> scoreList = new ArrayList<>();
    static List<Integer> numList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            numList.add(i);
        }
        visited = new boolean[n];
        team = new Integer[n/2];
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        teamCreate(0,0);  // 팀짜기 list = <[0,1,2,3],[0,1,2,4],[0,1,2,5] ....>
        System.out.println(Collections.min(scoreList));

    }

    public static void teamCreate(int depth,int p){
        if(depth == n/2) {
            Integer [] a = team.clone();
            scoreDef(a);
            return;
        }
        for (int i = p; i < n; i++) {
            if(!visited[i]) {
                team[depth] = i;
                visited[i] = true;
                teamCreate(depth+1,i+1);
                visited[i] = false;
            }
        }
    }

    public static void scoreDef(Integer [] a){
        int score1 = 0;
        List<Integer> aList = Arrays.asList(a);
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                score1+=arr[a[i]][a[j]];
                score1+=arr[a[j]][a[i]];
            }
        }
        List<Integer> b = new ArrayList<>();
        for (int i : numList) {
            if(!aList.contains(i)){
                b.add(i);
            }
        }
        int score2 = 0;
        for (int i = 0; i < b.toArray().length-1; i++) {
            for (int j = i+1; j < b.toArray().length; j++) {
                score2+=arr[b.get(i)][b.get(j)];
                score2+=arr[b.get(j)][b.get(i)];
            }
        }
        scoreList.add(Math.abs(score1-score2));
    }

}