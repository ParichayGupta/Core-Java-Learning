package Others;

public class Employee {
    private String name;
    private int ID;
    private int age = 25;
    public int increageAge(int n){
        return this.age += n;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.increageAge(5);
        Employee e1 = e;
        e = new Employee();
        System.out.println(e1.age); // 25

        int x = 10;
        int n[] = new int[x];

    }
}
