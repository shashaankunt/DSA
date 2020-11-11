public class BinaryCalculator {
    public static void main(String args[]) {
        String str = "0100110101";
        System.out.println(calculateZerosandOnes(str));
    }
    
    
    public static int calculateZerosandOnes(String s)
    {
        int count0=0;
        int count1=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0') count0++;
            else count1++;
            if(count0==count1) count++;
            
            
        }
            return count;
        
    }

    
}
