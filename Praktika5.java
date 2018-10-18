

public class Praktika5 {
    public static int recursion(int n){


            for (int i = 0; i < n; i++)
            {

                System.out.println(" " + n);
            }

            if (n ==0)
            {
                return 0;
            }

        return recursion (n-1);
    }

    public static void main(String[] args) {
        recursion(5);
    }
}
