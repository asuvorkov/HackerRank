package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 16.07.2017.
 */
public class QueuesAndStacks {
    static class Solution {
        // Write your code here.
        java.util.LinkedList queu;
        Stack stack;
        public Solution() {
            this.queu = new java.util.LinkedList();
            this.stack = new Stack();
        }

        public void pushCharacter(char c) {
            stack.push(c);
        }

        public void enqueueCharacter(char c) {
            queu.addLast(c);
        }

        public char popCharacter() {
            return (char) stack.pop();
        }

        public char dequeueCharacter() {
            return (char) queu.pollFirst();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
