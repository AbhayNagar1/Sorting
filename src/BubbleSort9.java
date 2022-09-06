import java.util.Scanner;
public class BubbleSort9 {
	void bsorting(int arr[]){
        int p = arr.length;
        for (int i = 0; i < p - 1; i++)
            for (int j = 0; j < p - i - 1; j++)
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    void show_array(int arr[]){
        int k = arr.length;
        for (int i = 0; i < k; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	@SuppressWarnings("null")
	public static void main(String[] args){
		BubbleSort9 bs = new BubbleSort9();
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		int a;
		System.out.print("Enter the number = ");
		a = s.nextInt();
		int[] usa = new int[a];
        System.out.println("Enter the elements of the unsorted array: ");
        for (int i = 0; i < a; i++)
        	usa[i]=s.nextInt();  
        bs.bsorting(usa);
        System.out.println("Sorted array");
        bs.show_array(usa);
	}
}
