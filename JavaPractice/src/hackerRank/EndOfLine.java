package hackerRank;

import java.util.Scanner;

public class EndOfLine
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String res = "";
        while(sc.hasNextLine())
        {
            res = count+" "+sc.nextLine();
            System.out.println(res);
            count++;
        }

    }
}
