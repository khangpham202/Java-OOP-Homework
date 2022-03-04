import java.util.Scanner;

public class order {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j< n; j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
         }
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}
