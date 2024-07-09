public class varArgs {
    public static void main(String[] args) {
        int a = varFunction(1,2,3,4,5);
        System.out.println(a);
    }

    public static int varFunction(int... args){
        return args.length;
    }
}
