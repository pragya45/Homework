import java.util.Scanner;

//////WAP to print the first 10 multiplies.
    public class Hww4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            int a = scanner.nextInt();
            for(int i = 1; i<=10;i++)
            {
                System.out.println(a+"*"+i+"="+a*i);
            }
        }
    }


    //WAP to take your name and age as user input and print it 5 times using for loop.
    class times{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Name: ");
            String name=sc.nextLine();
            for (int i=0;i<5;i++){
                System.out.println(name);
            }
        }
    }

    //WAP to take the initialization and condition for the for loop and print the even
//numbers present in between it.
    class EvenNumber {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("enter the starting num");
            int start = scanner.nextInt();
            System.out.println("enter ending num");
            int end= scanner.nextInt();
            for (int i=start; i<=end;i+=2){
                System.out.println(i);
            }
        }
    }

    //WAP to take the initialization and condition for the for loop and print the sum
// of all the even numbers present in between it.
    class SumOfEven {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the starting number");
            int a = scanner.nextInt();
            System.out.println("Enter the ending number");
            int b = scanner.nextInt();
            int c = 0;
            for(int i=a; i<=b;i+=2) {
                c = c + i;
            }
            System.out.println("Sum of even number is:"+c);
        }
    }

