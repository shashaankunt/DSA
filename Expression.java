import java.util.*;
public class Expression {
    public static void main(String args[]) {
      String exp="224*+";

      System.out.println("Exp"+evaluate(exp));
    }
    
    public static int evaluate(String exp)
    {
        Stack<Integer> st=new Stack<Integer>();
    
        for(char c: exp.toCharArray())
        {
            if(Character.isDigit(c))
            st.push(c-'0');
            
            else
            {
                int temp1=st.pop();
                int temp2=st.pop();
                switch(c)
                {
                case '+': st.push(temp1+temp2);
                case '*': st.push(temp1*temp2);
                }
            }
            
            
        }
        return st.pop();
        
        
    }
    
    
}
