package pkg1;

// Link to the problem:https://leetcode.com/problems/climbing-stairs/

/*
 * Approach:
 * Adding up various pattern of reaching a particular stairs obtains
 * us with the Fibonacci Series of n natural numbers
 */
public class Deepanshu {
    public void climbStairs(int n) {
	    int[] steps=new int[50];
        steps[1]=1;
        steps[2]=2;
        steps[3]=3;
        for(int i=4;i<50;i++){
            steps[i]=steps[i-1]+steps[i-2];
        }
        System.out.println(steps[n]);
    }
}