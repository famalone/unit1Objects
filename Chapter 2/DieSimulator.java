import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random num = new Random();
        int num2 = num.nextInt(6);
        num2 = num2 + 1;
        System.out.println(num2);
    }
}