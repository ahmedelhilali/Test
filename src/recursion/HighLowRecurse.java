package recursion;

import java.util.Scanner;

public class HighLowRecurse {
    Scanner input;

    public static void main(String[] args) {
        HighLowRecurse h = new HighLowRecurse();
        h.solve(0, 100);
    }

    public HighLowRecurse() {
        input = new Scanner(System.in);
    }

    public void solve(int lower, int upper) {
        String userResponse;
        int mid = (int) ((lower + upper) / 2);
        System.out.println("I guess " + mid);
        System.out.println("too (h)igh?");
        System.out.println("too(l)ow?");
        System.out.println("or (c)orrect");
        userResponse = input.nextLine();
        if (userResponse.equalsIgnoreCase("h")) {
            solve(lower, mid);
        }
        else if (userResponse.equalsIgnoreCase("l")) {
            solve(mid, upper);
        }
        else if (userResponse.equalsIgnoreCase("c")) {
            //base case
            System.out.println("You win!");
        }
        else {
            System.out.println("Not a valid response");
            solve(lower, upper);
        }
    }
}
