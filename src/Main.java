import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float n;
        int chon;
        int dem=0;
        float kq=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextFloat();
        System.out.println("nhap chon");
        chon= scanner.nextInt();
        switch (chon){
            case 1:
                for (int i=1;i<=n;i++){
                    if (n%i==0){
                        dem++;
                    }
                }if (dem==2){
                System.out.println("la so nguyen to");
            }else {
                System.out.println("khong phai la so nguyen to");
            }
                break;
            case 2:
                for (int i=1;i<n;i++){
                    if (n%i==0){
                        kq=kq+i;
                    }
                }
                if (kq==n){
                    System.out.println("la so hoan chinh");
                }else {
                    System.out.println("khong phai so hoan chinh");
                }
                break;
            case 3:
                double i=Math.sqrt(n);
                if (n==Math.pow(i,2)){
                    System.out.println("la so chinh phuong");
                }
                else {
                    System.out.println("khong phai so chinh phuong");
                }
                break;
        }
    }
}