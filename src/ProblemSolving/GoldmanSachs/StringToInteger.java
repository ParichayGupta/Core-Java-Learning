package ProblemSolving.GoldmanSachs;

public class StringToInteger {
    /*
    *  Given a string , return it’s integer value along with error fix in code.
    *
    *   input: "24"
    *   output: 24
    * */
    public static void main(String[] args) {
        String s = "-2348854";
        System.out.println(stringToInteger(s));
    }

    private static int stringToInteger(String s){
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return -1;
            }
            result = result * 10 + (s.charAt(i) - '0');
        }
        return result;
//        return Integer.parseInt(s);
    }
}
