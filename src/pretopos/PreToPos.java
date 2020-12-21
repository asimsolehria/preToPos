
package pretopos;

import java.util.Stack;

/**
 *
 * @author asim
 */
public class PreToPos
{
    
    public String preToPos(String exp)
    {
        Stack<String> stack= new Stack<>();
        
        for (int i = exp.length()-1; i >=0; i--) 
        {
            char c=exp.charAt(i);
            
            if(Character.isLetterOrDigit(c))
                stack.push(c+"");
            else
            {
                String opnd1=stack.pop();
                String opnd2=stack.pop();
                String postFix=opnd1+opnd2+c;
                stack.push(postFix);
            }
            
        }
        return stack.pop();
    }
}
