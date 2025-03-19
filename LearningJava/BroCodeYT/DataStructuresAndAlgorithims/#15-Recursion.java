// Recursion = When a thing is defined in terms of itself - Wikipedia (wut?)
//             Apply the result of a procedure, to a procedure.
//             A recursive method calls itself. Can be a substitue for iteration.
//             Divide a problem into sub-problems of the same type as the original.
//             Commonly used with advanced sorting algorithims and navigating trees
//             Advantages?
//             1. Easier to read/write
//             2. Easier to debug
//             Disadvantages?
//             1. Sometimes slower
//             2. Uses more memory

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
        walkIteration(5);
        System.out.println();
        walkRecursion(5);
        System.out.println();
        //walkRecursion(1000000); // Throws a java.lang.StackOverflowError (run out of memory)
        System.out.println();
        System.out.println("Factorial: " + factorial(7));
        System.out.println("Power: " + power(2, 8));
    }

    private static void walkIteration(int steps) {
        for(int i = 0; i < steps; i++){
            System.out.println("You take a step: " + i);
        }
    }

    private static void walkRecursion(int steps) {
        if(steps < 1){ return; } // Base case
        System.out.println("You take a recursive step: " + steps);
        walkRecursion(steps - 1); // Recursive
    }

/* Call Stack - (LIFO Order)
----------------------------------------------------------------------
    walkRecursion(0); aka 5 since it starts at 5 steps
    walkRecursion(1); aka 4 since it was at 5 steps and then subtracts
    walkRecursion(2); aka 3 since it was at 4 steps and then subtracts
    walkRecursion(3); aka 2 since it was at 3 steps and then subtracts
    walkRecursion(4); aka 1 since it was at 2 steps and then subtracts
    main();           Then it runs the main method

    This call stack is the main reason recursion could take longer
    or use more memory. (Adds more frames/methods to the stack)
*/
    
    private static int factorial(int num){
        if(num < 1){ return 1; } // Base case
        return num * factorial(num - 1); // Recursive
    }

    private static int power(int base, int exponent){
        if(exponent < 1){ return 1; } // Base case
        return base * power(base, exponent - 1); // Recursive
    }

}

// -----------------------------------------------------------
//                 |      Iteration     |     Recursion      |
// -----------------------------------------------------------
// Implementation |      Uses Loops     |   Calls itself     |
// -----------------------------------------------------------
// State          |    Controls index   |  paramerer values  | 
//                |    (int steps = 0)  |  walk(int steps)   |
// -----------------------------------------------------------
// Progression    | Moves towards value | Converges towards  |
//                |     in condition    |      base case     |
// -----------------------------------------------------------
// Termination    |   Index satisfies   |  base case = true  |
//                |      condition      |                    |
// -----------------------------------------------------------
// Size           |      More code      |     Less code      | 
//                |     Less memory     |    More memory     |
// -----------------------------------------------------------
// Speed          |       Faster        |       Slower       |
// -----------------------------------------------------------
