public class ArrayExample2
{
    public static void main(String[] args)
    {
        int[][] table = new int[3][4];

        table[0][0] = 10;
        table[1][1] = 20;
        table[2][3] = table[0][0] + table [1][1];

        System.out.println(table[0][0]);
        System.out.println(table[1][1]);
        System.out.println(table[2][3]);
    }
}
