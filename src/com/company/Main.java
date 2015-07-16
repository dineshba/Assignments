package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt(), b1 = in.nextInt();
        int a0 = 0, b0 = 0, x=0, y=0;
        char z0,z1;
        System.out.println("Enter the number of rovers");
        int w=in.nextInt();
        int[] x3=new int[3*w];
        int t=0;
        String s3="";
        while(w>0) {
            String s1 = in.next();
            int len = s1.length();
            if (len == 3) {
                char z3, z4;
                String s;
                s = "" + s1.charAt(0);
                x = Integer.parseInt(s);
                y = Integer.parseInt("" + (s1.charAt(1)));
                z0 = s1.charAt(2);
            } else {
                System.out.print("Error in input pattern : Enter the value again");
                continue;
            }
            String s2 = in.next();
            len = s2.length();
            for (int p = 0; p < len; p++) {
                z1 = s2.charAt(p);
                if (z1 == 'M') {
                    if (z0 == 'N')
                        y++;
                    else if (z0 == 'S')
                        y--;
                    else if (z0 == 'W')
                        x--;
                    else if (z0 == 'E')
                        x++;
                } else if (z1 == 'R') {
                    if (z0 == 'N')
                        z0 = 'E';
                    else if (z0 == 'S')
                        z0 = 'W';
                    else if (z0 == 'E')
                        z0 = 'S';
                    else if (z0 == 'W')
                        z0 = 'N';
                } else if (z1 == 'L') {
                    if (z0 == 'N')
                        z0 = 'W';
                    else if (z0 == 'S')
                        z0 = 'E';
                    else if (z0 == 'E')
                        z0 = 'N';
                    else if (z0 == 'W')
                        z0 = 'S';
                }
            }
            if(x<0||y<0||x>a1||y>b1)
            {
                System.out.print("Error : trying to cross the border :Enter the correct value from the initial position");
                continue;
            }
            w--;
        s3=s3+Integer.toString(x) + Integer.toString(y) + Character.toString(z0);
        }
        for(int l=0;l<(s3.length());)
        System.out.println(s3.charAt(l++) + "" + s3.charAt(l++) + "" + s3.charAt(l++));
    }
}

