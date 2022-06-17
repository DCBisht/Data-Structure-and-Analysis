/*
 * Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
Example 2:

Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr

Your Task:
You dont need to read input or print anything. Complete the function reverseWords() which takes string S 
as input parameter and returns a string containing the words in reversed order. Each word in the 
returning string should also be separated by '.' 
 */

import java.util.*;
import java.lang.*;
import java.io.*;
class Reverse_words {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Reverse_words obj = new Reverse_words();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
{
    // code here 
    String ns="", word="";
    int l=S.length();
    for(int i=l-1;i>=0;i--)
    {
        if(S.charAt(i)=='.')
        {
           ns=ns+word+'.';
           word="";
        }
        else{
            word=S.charAt(i)+word;
        }
    }
    ns=ns+word;
    return ns;
}
}
// } Driver Code Ends
