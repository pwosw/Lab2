package Lab02; // 將類放在 Lab02 包中

import java.util.Scanner;

public class JPA07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 scn 為輸入清單

        for (int i = 0; i <= 3; i++) { // 迴圈執行四次
            System.out.println("請輸入三個整數:"); // 提示用戶輸入三個整數

            int a = scn.nextInt(); // 讀取第一個邊的長度
            int b = scn.nextInt(); // 讀取第二個邊的長度
            int c = scn.nextInt(); // 讀取第三個邊的長度

            if (a == 0 || b == 0 || c == 0 || a + b <= c || b + c <= a || a + c <= b) { // 判斷是否可以構成三角形
                System.out.println("不可以構成三角形"); // 如果不能構成三角形，則顯示 "不可以構成三角形"
            } else { // 如果可以構成三角形
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || // 判斷是否為直角三角形
                    Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) ||
                    Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
                    System.out.println("直角三角形"); // 如果是直角三角形，則顯示 "直角三角形"
                } else if (Math.pow(a, 2) + Math.pow(b, 2) < Math.pow(c, 2) || // 判斷是否為鈍角三角形
                           Math.pow(a, 2) + Math.pow(c, 2) < Math.pow(b, 2) ||
                           Math.pow(b, 2) + Math.pow(c, 2) < Math.pow(a, 2)) {
                    System.out.println("鈍角三角形"); // 如果是鈍角三角形，則顯示 "鈍角三角形"
                } else if (Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2) || // 判斷是否為銳角三角形
                           Math.pow(a, 2) + Math.pow(c, 2) > Math.pow(b, 2) ||
                           Math.pow(b, 2) + Math.pow(c, 2) > Math.pow(a, 2)) {
                    System.out.println("銳角三角形"); // 如果是銳角三角形，則顯示 "銳角三角形"
                }
            }
        }

        scn.close(); // 關閉 Scanner 物件 
    }
}
