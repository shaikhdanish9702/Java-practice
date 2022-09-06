import java.util.Scanner;

class GFG {
        static void allu(int test)
        {
            if (test < 1)
                return;
      
            else {
                System.out.printf("%d ", test);
      
                // Statement 2
                allu(test - 1);
      
                System.out.printf("%d ", test);
                return;
            }
        }
      
        public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        int allu = sc.nextInt();
        }
    }

