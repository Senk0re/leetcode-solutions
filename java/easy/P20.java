import java.util.Stack;
public class P {
    public static void main(String[] args) {
        String s = "[{()}]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
           if(s.charAt(i) == '(') {
               stack.push('(');
           } else if (s.charAt(i) == ')') {
               if(!stack.isEmpty() && stack.peek() == '(') {
                   stack.pop();
               } else {return false;}
           }

           if(s.charAt(i) == '{') {
               stack.push('{');
           } else if (s.charAt(i) == '}') {
               if(!stack.isEmpty() && stack.peek() == '{') {
                   stack.pop();
               } else {return false;}
           }

           if(s.charAt(i) == '[') {
               stack.push('[');
           } else if (s.charAt(i) == ']') {
               if(!stack.isEmpty() && stack.peek() == '[') {
                   stack.pop();
               } else {return false;}
           }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
