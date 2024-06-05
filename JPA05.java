package Lab02; // 將類放在 Lab02 包中

import java.util.Scanner;

public class JPA05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 創建一個 Scanner 物件用於從控制台讀取輸入

        for (int i = 0; i <= 3; i++) { // 迴圈執行四次
            int num = scn.nextInt(); // 讀取用戶輸入的整數

            if (num % 6 == 0) { // 判斷是否為2、3、6的倍數
                System.out.println(num + " 是2、3、6的倍數"); // 如果是，則顯示 "num 是2、3、6的倍數"
            } else if (num % 2 == 0) { // 如果不是2、3、6的倍數，再判斷是否為2的倍數
                System.out.println(num + " 是2的倍數"); // 如果是，則顯示 "num 是2的倍數"
            } else if (num % 3 == 0) { // 如果不是2的倍數，再判斷是否為3的倍數
                System.out.println(num + " 是3的倍數"); // 如果是，則顯示 "num 是3的倍數"
            } else { // 如果既不是2、3、6的倍數，也不是2的倍數和3的倍數
                System.out.println(num + " 不是2、3、6的倍數"); // 則顯示 "num 不是2、3、6的倍數"
            }
        }

        scn.close(); // 關閉 Scanner 物件 
    }
}
