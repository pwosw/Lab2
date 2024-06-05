package Lab02; // 將類放在 Lab02 包中

import java.util.Scanner;

public class JPA08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 scn 為輸入清單

        System.out.println("Input:"); // 輸出提示信息

        int score; // 宣告整數變數 score

        for (int i = 0; i <= 4; i++) { // 迴圈執行五次
            score = scn.nextInt(); // 讀取用戶輸入的成績

            if (score >= 90) { // 判斷成績是否大於等於90
                System.out.println("Your grade is A"); // 如果是，則顯示 "Your grade is A"
            } else if (80 <= score && score < 90) { // 判斷成績是否在80到89之間
                System.out.println("Your grade is B"); // 如果是，則顯示 "Your grade is B"
            } else if (70 <= score && score < 80) { // 判斷成績是否在70到79之間
                System.out.println("Your grade is C"); // 如果是，則顯示 "Your grade is C"
            } else if (60 <= score && score < 70) { // 判斷成績是否在60到69之間
                System.out.println("Your grade is D"); // 如果是，則顯示 "Your grade is D"
            } else if (score < 60) { // 判斷成績是否小於60
                System.out.println("Your grade is F"); // 如果是，則顯示 "Your grade is F"
            }
        }

        scn.close(); // 關閉 Scanner 物件 
    }
}
