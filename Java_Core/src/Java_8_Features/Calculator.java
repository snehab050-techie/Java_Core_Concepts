package Java_8_Features;

@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);
}

class Demo{
    static void main() {
        Calculator res = (a,b) -> a+b;
        System.out.println(res.calculate(10,30));
    }
}
