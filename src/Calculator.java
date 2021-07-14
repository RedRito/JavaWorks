
public class Calculator {
    public int IntAdd(int var1, int var2)
    {
        int sum = var1 + var2;
        return sum;
    }
    public static void main(String[] args) {
        Calculator clac1 = new Calculator();
        clac1.IntAdd(10, 20);
        System.out.print(clac1.IntAdd(10, 20));
    }
    public void addTwo(int var1)
    {
        return;
    }
}
