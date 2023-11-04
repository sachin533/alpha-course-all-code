
// qusation -----Given a  "2 x n" board and tiles of size "2 x 1", 
// count the number of ways to tile the given board
//  using the 2 x 1 tiles. 
//  (A tile can either be placed horizontally or vertically.)
public class Recusrion7 {

    public static int tillingproblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical
        int fnm1 = tillingproblem(n - 1);

        // horizontal
        int fnm2 = tillingproblem(n - 2);

        int totways = fnm1 + fnm2;

        return totways;

    }

    public static void main(String args[]) {
        System.out.println(tillingproblem(4));

    }

}
