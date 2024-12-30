    import java.io.*;
    import java.util.*;

    public class Main {

        static int [][] map;
        static int white = 0;
        static int blue = 0;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            partition(0,0,n);
            System.out.println(white);
            System.out.println(blue);
        }

        public static void partition(int row, int col, int size) {

            if (colorCheck(row, col, size)){
                if (map[row][col] == 0){
                    white+=1;
                }
                else if (map[row][col] == 1){
                    blue+=1;
                }
                return;
            }

            int newSize = size/2;
            partition(row,col,newSize);
            partition(row+newSize,col,newSize);
            partition(row,col+newSize,newSize);
            partition(row+newSize,col+newSize,newSize);
        }

        public static boolean colorCheck(int row, int col, int size){
            int color = map[row][col];
            for(int i = row; i < row+size; i++){
                for(int j = col; j < col+size; j++){
                    if(color != map[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }

    }