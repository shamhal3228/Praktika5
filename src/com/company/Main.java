package com.company;

import java.util.Scanner;

public class Main {

    public static void rec12()
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if (n==0)
        {
            return;
        }
        else
        {
            if (n%2!=0)
            {
                System.out.println(n);
            }
            rec12();
        }
    }

    public static void rec13()
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if (n==0)
        {
            return;
        }
        else
        {
            System.out.println(n);
            int m=in.nextInt();
            if (m==0)
            {
                return;
            }
            rec13();
        }
    }

    public static void rec14(int num)
    {
        if (num==0)
            return;
        else
        {
            rec14(num/10);
            System.out.print(num%10+" ");
        }
    }

    public static void rec15(int num)
    {
        if (num==0)
            return;
        else
        {
            System.out.print(num%10+" ");
            rec15(num/10);
        }
    }

    public static void rec16(int max, int count)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num != 0)
        {
            if (num > max)
                rec16(num, 1);
            else
            if (num == max)
                rec16(max, ++count);
            else
                rec16(max, count);
        }
        else
            System.out.println(count);
    }

    public static void rec17(int max)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num != 0)
        {
            if (num > max)
                rec17(num);
            else rec17(max);
        }
        else
        {
            System.out.println(max);
            return;
        }
    }

    public static void main(String[] args) {
	
    }
}
