import java.util.Stack;

public class BalancedParentheses {
    public boolean parenCheck (String str){
        Stack<String> leftParens = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            String character = String.valueOf(str.charAt(i));
//            System.out.println("leftParens " + leftParens + " current char " + character);

            if( character.equals("(")){
                leftParens.push("(");
            }

            if(character.equals(")")){
                if(leftParens.contains("(")){
                    leftParens.pop();
                }else{return false;}
            }
        }
        if(leftParens.size()==0){
            return true;
        }
        return false;
    }




}
