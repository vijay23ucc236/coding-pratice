import java.util.Scanner;

class BubbleSort 
{
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) 
		{
            a[i] = sc.nextInt();
        }

        int passes = 0;

        for (int i = 0; i < n - 1; i++) 
		{
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) 
			{
                if (a[j] > a[j + 1])
					{
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    swapped = true;
                }
            }

            passes++;

            if (!swapped)
				{
                break;
            }
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) 
		{
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Number of Passes: " + passes);
    }
}