import java.util.Scanner;

class Search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[100];
        int n = 0;
        int choice;

        do
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.print("Enter number of elements: ");
                n = sc.nextInt();

                System.out.println("Enter elements:");
                for (int i = 0; i < n; i++)
                {
                    a[i] = sc.nextInt();
                }
            }

            else if (choice == 2)
            {
                System.out.println("Array elements are:");

                for (int i = 0; i < n; i++)
                {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }

            else if (choice == 3)
            {
                System.out.print("Enter element to search: ");
                int key = sc.nextInt();

                int found = 0;

                for (int i = 0; i < n; i++)
                {
                    if (a[i] == key)
                    {
                        System.out.println("Element found at position " + (i + 1));
                        found = 1;
                        break;
                    }
                }

                if (found == 0)
                {
                    System.out.println("Element not found");
                }
            }

            else if (choice == 4)
            {
                System.out.print("Enter element to search: ");
                int key = sc.nextInt();

                int low = 0;
                int high = n - 1;
                int found = 0;

                while (low <= high)
                {
                    int mid = (low + high) / 2;

                    if (a[mid] == key)
                    {
                        System.out.println("Element found at position " + (mid + 1));
                        found = 1;
                        break;
                    }
                    else if (a[mid] < key)
                    {
                        low = mid + 1;
                    }
                    else
                    {
                        high = mid - 1;
                    }
                }

                if (found == 0)
                {
                    System.out.println("Element not found");
                }
            }

            else if (choice == 5)
            {
                System.out.println("Program exited.");
            }

            else
            {
                System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}