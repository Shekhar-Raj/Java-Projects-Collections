using System;
using System.Text;

class Permutation
{
    public void permute(char[] str, int i, int j)
    {
        if (i == j - 1)
        {
            Console.WriteLine(str);
            return;
        }
        else
        {
            for (int k = i; k <= j - 1; k++)
            {
                var sb = new StringBuilder(new string(str));
                sb[i] = str[k];
                sb[k] = str[i];
                permute(sb.ToString().ToCharArray(), i + 1, j);
            }
        }
    }
}

class Program
{
    static void Main(string[] args)
    {
        var obj = new Permutation();
        char[] str = { 'A', 'B', 'C' };
        int n = str.Length;
        obj.permute(str, 0, n);
    }
}
