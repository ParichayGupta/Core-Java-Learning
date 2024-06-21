package Inhertance.exmaple2;

class Math {
    public double secret = 2;

    public double method(){
        return this.secret;
    }
}

class ComplexMath extends Math {
    public double secret = 4;

    public double method(){
        return this.secret;
    }
}

public class InfiniteMath extends ComplexMath {
    public double secret = 8;

    public double method(){
        return this.secret;
    }

    public static void main(String[] numbers) {
        ComplexMath math = new InfiniteMath();
        System.out.print(math.secret);
        System.out.println(math.method());
    }
}
