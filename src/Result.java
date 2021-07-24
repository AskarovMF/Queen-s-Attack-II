import java.util.*;

public class Result {

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int count = 0;
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            int r = obstacles.get(i).get(0);
            int c = obstacles.get(i).get(1);

            if (!map.containsKey(r)){
                Set<Integer> set = new HashSet<>();
                set.add(c);
                map.put(r, set);
            } else map.get(r).add(c);
        }

        //up-left
        for (int i = r_q + 1, j = c_q - 1; i <= n && j > 0; i++, j--) {
            if (contains(i, j, map)) break;
            else count++;
        }

        //down-right
        for (int i = r_q - 1, j = c_q + 1; i > 0 && j <= n; i--, j++) {
            if (contains(i, j, map)) break;
            else count++;
        }

        //up-right
        for (int i = r_q + 1, j = c_q + 1; i <= n && j <= n; i++, j++) {
            if (contains(i, j, map)) break;
            else count++;
        }

        //down-left
        for (int i = r_q - 1, j = c_q - 1; i > 0 && j > 0; i--, j--) {
            if (contains(i, j, map)) break;
            else count++;
        }

        //horizon & vertical
        int C;
        int R;
        int Cleft = 0;
        int Cright = n+1;
        int Rtop = n+1;
        int Rdown = 0;

        for (List<Integer> ob : obstacles) {
            if (ob.get(0) == r_q){
                C = ob.get(1);
                if (C < c_q && C > Cleft) Cleft = C;
                else if (C > c_q && C < Cright) Cright = C;
            }

            if (ob.get(1) == c_q){
                R = ob.get(0);
                if (R > r_q && R <= Rtop) Rtop = R;
                else if (R < r_q && R > Rdown) Rdown = R;
            }
        }

        count += (c_q - 1 - Cleft) + (Cright - c_q - 1);
        count += (r_q - 1 - Rdown) + (Rtop - r_q - 1);

        return count;
    }

    private static boolean contains (int i, int j, Map<Integer, Set<Integer>> map){
        return map.containsKey(i) && map.get(i).contains(j);
    }
}
