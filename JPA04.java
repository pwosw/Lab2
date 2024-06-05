import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 scn 為輸入清單

        for (int i = 0; i <= 1; i++) { // 重複兩次
            System.out.println("Input:"); // 提示用戶輸入

            int num = scn.nextInt(); // 讀取用戶輸入的整數

            if (num % 5 == 0 && num % 9 == 0) { // 判斷數字是否同時為5和9的倍數
                System.out.println("Yes"); // 如果是，則顯示 "Yes"
            } else {
                System.out.println("No"); // 否則顯示 "No"
            }
        }

        scn.close(); // 關閉 Scanner 物件 
    }
}
