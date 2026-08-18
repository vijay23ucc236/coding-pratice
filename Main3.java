import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1. Insert elements");
            System.out.println("2. Display elements");
            System.out.println("3. Count Even numbers");
            System.out.println("4. Count Odd numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter number of elements: ");
                    int n = sc.nextInt();

                    System.out.println("Enter elements:");

                    for (int i = 0; i < n; i++) {
                        arr[count++] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Array elements:");

                    for (int i = 0; i < count; i++) 
					{
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int even = 0;

                    for (int i = 0; i < count; i++) 
					{
                        if (arr[i] % 2 == 0) 
						{
                            even++;
                        }
                    }

                    System.out.println("Even numbers: " + even);
                    break;

                case 4:
                    int odd = 0;

                    for (int i = 0; i < count; i++) 
					{
                        if (arr[i] % 2 != 0) 
						{
                            odd++;
                        }
                    }

                    System.out.println("Odd numbers: " + odd);
                    break;

                case 5:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}