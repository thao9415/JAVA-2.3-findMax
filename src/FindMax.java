import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sizeArr;
        int[] arr;
        System.out.print("Enter size of array: ");
        sizeArr=input.nextInt();
        arr=new int[sizeArr];
        for (int i=0;i<sizeArr;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=input.nextInt();
        }
        System.out.println("Property list: ");
        int j=0;
        while (j<arr.length){
            System.out.print(arr[j]+"\t");
            j++;
        }
        int max=arr[0];
        int k=0;
        int index=0;
        while (k<arr.length){
            if (max<arr[k]){
                max=arr[k];
                index=k;
            }
            k++;
        }
        System.out.print("Max = "+max+" position = "+index);
    }
}
