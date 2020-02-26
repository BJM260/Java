package main.test;

import java.util.Scanner;

public class algorithm {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
        System.out.println(calCulate(30));
    }

    public static String calCulate(int num){
        if(num == 0)
            return "";

        String pre = null;
        StringBuilder now = null;

        for(int i = 1; i <= num; ++i){
            now = new StringBuilder();
            if(i == 1){
                now.append("1");
            } else{
                String[] temp = pre.split(" ");
                int count = 1;
                boolean flag = true;
                for(int j = 0; j < temp.length - 1; ++j){
                    if(temp[j].equals(temp[j + 1])){
                        ++count;
                    } else{
                        if(flag)
                            now.append(Integer.toString(count)).append(" ").append(temp[j]);
                        else
                            now.append(" ").append(Integer.toString(count)).append(" ").append(temp[j]);
                        count = 1;
                        flag = false;
                    }
                }

                if(flag)
                    now.append(Integer.toString(count)).append(" ").append(temp[temp.length - 1]);
                else
                    now.append(" ").append(Integer.toString(count)).append(" ").append(temp[temp.length - 1]);
            }
            pre = new String(now.toString());
//            System.out.println(pre);
        }

        return now.toString()/*.replace(" ", "")*/;
    }
}
