//Kadanes Algorithm
class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        
    if(arr==null||arr.length<1) return -1;
    
    int currMax=arr[0];
    int ans=arr[0];
    
    for(int i=1;i<arr.length;i++)
    {
        currMax=Math.max(currMax+arr[i],arr[i]);
        ans=Math.max(ans,currMax);
    }
    return ans;
        
    }
    
}
