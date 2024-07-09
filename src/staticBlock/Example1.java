package staticBlock;

public class Example1 {
    public static void main(String[] args) {
        Three three = new Three();
    }
}


class one {
    static{
        System.out.println("Static block class one");
    }

    public one(){
        System.out.println("Constructor class 1");
    }
}

class two extends one{

    public two(){
        System.out.println("Constructor class 2");
    }
}

class Three extends two{
    static{
        System.out.println("Static block class three");
    }
    {
        System.out.println("Instance block class three");
    }
    public Three(){
        System.out.println("Constructor class 3");
    }
}