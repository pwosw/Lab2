import java.util.Scanner;

public class JPA01 {
    static Scanner scn = new Scanner(System.in); // 創建一個 Scanner 物件用於從控制台讀取輸入

    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) { // 重複執行三次
            System.out.println("Input: "); // 提示用戶輸入
            int score = scn.nextInt(); // 從控制台讀取輸入的分數

            if (score >= 60) { // 如果分數大於等於60
                System.out.println("You pass!"); // 顯示 "You pass!"
            }

            System.out.println("End"); // 顯示 "End"，表示輸入結束
        }
    }
}
