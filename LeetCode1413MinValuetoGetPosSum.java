class Solution {
    public int minStartValue(int[] nums) {
        
        int minsum=0;
        int sum=0;
        for(int num: nums)
        {
            sum+=num;
            minsum=Math.min(sum,minsum);
        }
        return 1-minsum;
    }
}

/*Just to help out anyone,who had same questions has me.We can have the array in three different variations:

1.When all the elements are positive
2.When some elements are negative and others are positive
3.When all the elements are negative

For Scenario 1,We want the minimum positive number value of start Value such that the step by step sum is never less than 1 which is '1' since all the numbers are always positive and it is the least +ve number and we cannot consider '0' has a positive number
eg:
[1,2] --->Since sum of values is always positive,the min value is always 1,hence the reason we are using minSum=0

For Scenario 2 and 3.We want to get number which balances out the minimum value of the elements Prefix Sum so that we can make it a positive number and add 1 to it ,so we will be returning 1-minSum

[-3,2,-3,4,2] ----->The minimum sum is -3 hence 1-minSum=1-(-4)=5
*/
