package exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ChainingException {
    public static void main(String[] args){
        System.out.println("输入两个整数:");
        try{
            System.out.println("res:" + add());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static List<Integer> getInputNumbers(){
        List<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {
            nums.add(sc.nextInt());
            nums.add(sc.nextInt());
        }catch (InputMismatchException e){
            throw e;
        }finally {
            sc.close();
        }

        return nums;
    }

    private static int add() throws Exception{
        int res;
        try {
            List<Integer> nums = getInputNumbers();
            res = nums.get(0) + nums.get(1);
        }catch (InputMismatchException e){
//            throw new Exception("计算失败~", e);
            throw e;
        }

        return res;
    }
}
