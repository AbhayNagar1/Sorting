import java.util.Scanner;
public class NewSort9{
	public static void main(String[] args){
		try (Scanner scc = new Scanner(System.in)) {
			System.out.print("Enter first number = ");
			int a = scc.nextInt();
			int[] usa = new int[a];
			System.out.println("Enter the elements of the unsorted array: ");
			for (int i = 0; i < a; i++)
			{
				usa[i]=scc.nextInt(); 
			}  
			System.out.println("The elements of the sorted array: ");
			        for (int i = 0; i < usa.length; i++) 
			        {
			            for (int j = i + 1; j < usa.length; j++) 
			            {
			                int t = 0;
			                if (usa[j] < usa[i]) 
			                {
			                    t = usa[i];
			                    usa[i] = usa[j];
			                    usa[j] = t;
			                }
			            }
			            System.out.print(usa[i] + " ");
			        }
		}
		    }
	}