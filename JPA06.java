import java.util.Scanner;

public class JPA06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 創建一個 Scanner 物件用於從控制台讀取輸入

        for (int i = 0; i <= 3; i++) { // 迴圈執行四次
            System.out.println("Input Chinese score:"); // 提示用戶輸入中文成績
            int score1 = scn.nextInt(); // 讀取用戶輸入的中文成績

            System.err.println("Input English score:"); // 提示用戶輸入英文成績
            int score2 = scn.nextInt(); // 讀取用戶輸入的英文成績

            System.err.println("Input Math score:"); // 提示用戶輸入數學成績
            int score3 = scn.nextInt(); // 讀取用戶輸入的數學成績

            if (score1 < 60) { // 判斷中文成績是否不及格
                System.out.println("Chinese failed"); // 如果不及格，則顯示 "Chinese failed"
            }
            if (score2 < 60) { // 判斷英文成績是否不及格
                System.out.println("English failed"); // 如果不及格，則顯示 "English failed"
            }
            if (score3 < 60) { // 判斷數學成績是否不及格
                System.out.println("Math failed"); // 如果不及格，則顯示 "Math failed"
            }
            if (score1 >= 60 && score2 >= 60 && score3 >= 60) { // 判斷三科成績是否都及格
                System.out.println("All pass"); // 如果都及格，則顯示 "All pass"
            }
        }

        scn.close(); // 關閉 Scanner 物件 
    }
}
