package recursion;

/** Collatz. java
 * Illustrate iteration and recursion with collatz conjecture
 *
 * Take any natural number x
 * if x is even, divide by 2
 * if x is odd, multiply by three and add 1
 *
 * repeat enough times and x will converge to 1.
 * Given any starting x, how many attempts will it take to converge?
 */

public class Collatz {


    public static void main(String[] args) {

        Collatz collatz = new Collatz();

        System.out.println("iterative solution");
        collatz.iterCollatz(15);

        System.out.println("recursive solution");
        collatz.recCollatz(15);

        System.out.println("\n recursive solution with counter");
        int counter = collatz.recCounter(15);
        System.out.println("Count: " + counter);
    }

    public void iterCollatz(int start) {
        // uses standard iteration (loops)
        int x = start;
        int counter = 1;
        System.out.println(x + " ");

        // note the loop continues until we reach a base case
        while (x > 1) {
            counter++;
            //if x is even
            if (x % 2 == 0) {
                // divide by two
                x = x / 2;
            }
            else {
                // x is odd, so triple and add one
                x = (x * 3) + 1;
            }

            // print current value of x
            System.out.println(x + " ");
        }
        System.out.println("Count: " + counter);
    }

    public void recCollatz(int x) {
        /** the recursive solution is different. Note there is no loop
         * Instead, the algorithm keeps calling itself until it finds the base case.
         * When the base case reached, all copies of the function still exist and will exit
         * one by one, 'unwrapping' the nested stack
         */
        System.out.println(x + " ");
        if (x == 1) {
            // this is the base case.
            // Do nothing, because program is anout to 'unwrap'
        }
        else if (x % 2 == 0) {
            // if even, call myself again with x/2 parameter
            recCollatz(x/2);
        }
        else {
            // must be odd, so call with 3x + 1 as parameter
            recCollatz((3 * x) + 1);
        }
    }
    public int recCounter (int x) {

        /** counter version returns a counter. Note that the counting happens
         * at the end, as the recursive calls are unravelling.
         */

        int counter = 1;
        System.out.println(x + " ");
        if (x == 1) {
            // base case, return 1 and start counting
        }
        else if (x % 2 == 0){
            // add result of NEXT call to my counter
            counter += recCounter(x / 2);
        }
        else {
            // again, add result of NEXT call to counter
            counter += recCounter((3 * x) + 1);
        }
        return counter;
    }
}

