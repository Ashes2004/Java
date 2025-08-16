package com.dsaPractice;
import java.util.Stack;
import java.util.Scanner;
public class problem1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        Stack<Character> st = new Stack<>();
        for(char c : str.toCharArray())
        {
            if(st.empty())
            {
                st.push(c);

            }else{
                if(st.peek() == c )
                {
                    st.pop();
                }else{
                    st.push(c);
                }
            }
        }

        StringBuffer sb = new StringBuffer();

       for(char c : st)
       {
           sb.append(c);
       }


        str = String.valueOf(sb);
        System.out.println(str);
    }

}
