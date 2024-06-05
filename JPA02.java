import java.util.Scanner;

public class JPA02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 scn 為輸入清單

        for (int i = 0; i <= 1; i++) { // 重複兩次
            System.out.println("Input:"); // 輸出提示

            int num1 = scn.nextInt(); // 讀取第一個數字
            int num2 = scn.nextInt(); // 讀取第二個數字

            if (num1 > num2) { // 如果第一個數字大於第二個數字
                System.out.println(num1 + " is larger than " + num2); // 顯示第一個數字大於第二個數字的訊息
            } else { // 否則
                System.out.println(num2 + " is larger than " + num1); // 顯示第二個數字大於第一個數字的訊息
            }
        }

        scn.close(); // 關閉 Scanner 物件
    }
}
