import java.util.Scanner;

public class JPA03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 scn 為輸入清單

        for (int i = 0; i <= 1; i++) { // 重複兩次
            System.out.println("Input an integer:");

            int num = scn.nextInt(); // 讀取輸入

            if (num % 2 == 0) { // 判斷數字的奇偶性，當餘數為0時表示是偶數
                System.out.println("The number is even."); // 如果是偶數，則顯示 "The number is even."
            } else { // 否則為奇數
                System.out.println("The number is odd."); // 如果是奇數，則顯示 "The number is odd."
            }
        }

        scn.close(); // 關閉 Scanner 物件
    }
}
