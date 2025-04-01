package loop;
import java.util.Scanner;
import java.util.Stack;

public class ForEachLoopAndStack {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = s.nextLine();
      if(CheckOrdered(stack,str))
          System.out.println("brackets are ordered");
      else
          System.out.println("brackets are not ordered");
    }
    public static boolean CheckOrdered(Stack stack,String str){
        for(char str1:str.toCharArray()){
            if(str1=='(')
                stack.push('(');
            else if (str1==')') {
                if(stack.empty()) {
                    return false;
                }
                else
                    stack.pop();
            }
        }
        return stack.empty();
    }
}