package Others;

public class SwitchCase {
    public static void main(String[] args) {
        Test t1 = new Test(1);
        Test t2 = new Test(2);
        Test t3 = new Test(3);
        Test t4 = new Test(4);

        switch(1){
            case 1:
                System.out.println(t1);
                break;
            case 2:
                System.out.println(t2);
            case 3:
                System.out.println(t3);
            case 4:
                System.out.println(t4);
        }
    }
}
