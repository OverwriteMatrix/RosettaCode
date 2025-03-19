// Stack = LIFO data structure. Last-In First-Out
//         Stores objects into a sort of "vertical tower"
//         push() to add to the top
//         pop() to remove from the top

import java.util.Stack;

public class BroCodeWorkSpace {
    
    public static void main(String[] args){
        
       Stack<String> stack = new Stack<>();
       
        System.out.println(stack.empty());                                      // Checks if a stack is empty returns a boolean
        stack.push("Minecraft");                                                // Adding items to the top of the stack
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("FFVII");
        System.out.println(stack.empty());
        
        System.out.println(stack);                                              // Simple printing the stack
        
        stack.pop();                                                            // Pops top item from stack (FFVII)
        stack.pop();                                                            // Pops top item from stack (DOOM)
                                                                                // If you pop all the objects from the stack and then try to pop again you get an EmptyStackException
        String myFavGame = stack.pop();                                         // Pops top item from stack (Skyrim) and assigns it to myFavGame
        System.out.println(myFavGame);
        System.out.println(stack);
       
        // Adding items back to stack
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("FFVII");
        
        System.out.println(stack.peek());                                       // Examining what object is at the top of the stack ("peeking") in this case it is FFVII
        
        System.out.println(stack.search("Minecraft"));                          // Searches for the index of the specified object within the stack starts from top and STARTS AT ONE!!!!!!!!!
        System.out.println(stack.search("NotInStack"));                         // Searching for something not in the stack (returns -1)
        
        //for(int i = 0; i < 1000000000; i++){                                  // Throws a OutOfMemoryException
        //    stack.push("Fallout76");
        //}
        
        // Uses of stacks?
        // 1. Undo/Redo features in text editors
        // 2. Moving back/forward through browser history
        // 3. Backtracking algorithims (maze, file directories)
        // 4. Calling functions (call stack)
    } 
}
