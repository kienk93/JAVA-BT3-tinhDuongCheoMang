import java.util.Scanner;

public class tinhDuongCheoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng : ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột :");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("nhập giá trị " + i + "," + j + " :");
                array[i][j] = scanner.nextInt();
            }
        }
        int duongCheoChinh = 0, duongCheoPhu = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {// phần tử 0,0 1,1 2,2 3,3 ..... chéo chính
                    duongCheoChinh += array[i][j];
                }
                if (i + j == array.length - 1) {// phần từ 0,4 1,3 2,2 3,1 ...... chéo phụ
                    duongCheoPhu += array[i][j];
                }
            }
        }
        System.out.print("Tổng đường chéo chính là = "+duongCheoChinh);
        System.out.print("Tổng đương chéo phụ = "+duongCheoPhu);
    }
}