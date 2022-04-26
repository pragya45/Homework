import jdk.swing.interop.SwingInterOpUtils;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

////1. Using switch statement Write a JAVA program to input marks of five subjects Physics,
////Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
////following:
////Percentage >= 90% : Grade A
////Percentage >= 80% : Grade B
////Percentage >= 70% : Grade C
////Percentage >= 60% : Grade D
////Percentage >= 40% : Grade E
////Percentage < 40% : Grade F
public class Hww3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.println("Enter Chemistry marks: ");
        int Chemistry = sc.nextInt();
        System.out.println("Enter Bio marks: ");
        int Bio = sc.nextInt();
        System.out.println("Enter Maths marks: ");
        int Maths = sc.nextInt();
        System.out.println("Enter Computer marks: ");
        int computer= sc.nextInt();
        int sum=physics+Chemistry+Bio+Maths+computer;
        int per=(sum*100)/500;

        switch ((per>=90&&per<=100)?0:(per>=80&&per<90)?1:(per>=70&&per<80)?2:(per>=60&&per<70)?3:(per>=40&&per<60)?4:(per<40)?5:6) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;
            case 4:
                System.out.println("E");
                break;
            case 5:
                System.out.println("F");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}


//2. JAVA Program to find the maximum between two numbers. Using the switch statement.

class maxi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println("Enter a number:");
        int b=sc.nextInt();
        switch ((a>b)?0:(b>a)?1:2) {
            case 0:
                System.out.println(a+ " is greater.");
                break;
            case 1:
                System.out.println(b+ " is  greater");
                break;
            default:
                System.out.println("Both are equal");
                break;
        }
    }
}


//3. JAVA Program to find the maximum between three numbers. Using the switch statement.
class three{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println("Enter a number: ");
        int b=sc.nextInt();
        System.out.println("Enter a number: ");
        int c=sc.nextInt();
        switch ((a>b)?0:(b>c)?1:(c>a)?2:3){
            case 0:
                System.out.println(a+" is greatest.");
                break;
            case 1:
                System.out.println(b+ " is greatest.");
                break;
            case 2:
                System.out.println(c+ " is greatest.");
                break;
            default:
                System.out.println("All are equal.");
                break;
        }
    }
}

//4. JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
//statement.
class Divisible{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int a=num%11;
        int b=num%5;
        switch(num%11){
            case 0:
                switch (num%5){
                    case 0:
                        System.out.println("Divisible by 5 and 11");
                        break;
                    default:
                        System.out.println("Not Divisible");
                        break;
                }break;
            default:
                System.out.println("Not divisible");
                break;

        }
    }
}

//5. JAVA Program to check whether a year is a leap year or not. Using switch statement
class Year{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Year:" );
        int year=sc.nextInt();
        boolean leap=false;
        switch (year%4){
            case 0:
                switch(year%100){
                    case 0:
                        switch (year%400){
                            case 0:
                                leap=true;
                                break;
                            default:
                                leap=false;
                        }break;
                    default:
                        leap=true;
                        break;
                }break;
            default:
                leap=false;
                break;
        }
//        switch (leap){
//            case 0:
//                System.out.println("Leap year");
//                break;
//            case 1:
//                System.out.println("NO year leap");
//                break;
//        }break
        if (leap) {
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");

        }
    }
}


//6. JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
class word{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word: ");
        char word=sc.next().charAt(0);
        switch ((word>='a'&& word<='z')?0:1){
            case 0:
                System.out.println(word+ " is character.");
                break;
            case 1:
                System.out.println(word+ " is not a character.");
                break;

        }
    }
}
//7. JAVA Program to take the value from the user as input any alphabet and check whether it is
//vowel or consonant. Using the switch statement.
class lphabet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word :");
        char a=sc.next().charAt(0);
        switch(a){
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println(a+" is vowel.");
                break;
            default:
                System.out.println(a+ " is consonant.");
                break;
        }

    }
}

//8. JAVA Program to take the value from the user as input any character and check whether it is
//the alphabet, digit or special character. Using the switch statement.
class checkk{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Character: ");
        char a=sc.next().charAt(0);
        switch((a>='a'&&a<='z')?0:1){
            case 0:
                System.out.println(a+ " is alphabet.");
                break;
            case 1:
                switch((a>='0'&&a<='9')?0:1){
                    case 0:
                        System.out.println(a+ " is Number.");
                        break;
                    default:
                        System.out.println(a+" is special number.");
                        break;

                }
        }
    }
}

//9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the
//switch statement.
class upperlower{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word: ");
        char a=sc.next().charAt(0);
        switch((a>='a'&&a<='z')?0:1){
            case 0:
                System.out.println(a+ " is lowercase.");
                break;
            case 1:
                switch ((a>='A'&&a<='Z')?0:1){
                    case 0:
                        System.out.println(a+ " is uppercase.");
                        break;
                    case 1:
                        System.out.println(a+ " is not alphabet.");
                        break;
                }
        }
    }
}
//10. JAVA Program to take the value from the user as an input week number and print weekday by
//using the switch statement.
class weekk{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Week Number(1-7): ");
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Error number");
                break;

        }
    }
}

//11. JAVA Program to take the value from the user as input the month number and print number of
// days in that month. Using switch statement.
class mobnth{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Month number(1-12): ");
        int a=sc.nextInt();
        switch (a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days.");
                break;
            case 2:
                System.out.println("Year:");
                int year=sc.nextInt();
                boolean leap=false;
                switch (year%4){
                    case 0:
                        switch(year%100){
                            case 0:
                                switch(year%400){
                                    case 0:
                                        leap=true;
                                        break;
                                    case 1:
                                        leap=false;
                                        break;
                                }break;
                            case 1:
                                leap=true;
                                break;
                        }break;
                    case 1:
                        leap=false;
                        break;
                }
                if (leap) {
                    System.out.println("28 Days");
                }else{
                    System.out.println("29 Days");
                }
        }
    }
}

//12. JAVA Program to count the total number of notes in a given amount. Using the switch
//statement.
class Count{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amt , value,note;
        System.out.print("Enter the amount of money:: ");
        amt = scanner.nextInt();
        System.out.print("Enter the value of each note:: ");
        value = scanner.nextInt();

        switch (value){
            case 5:
                note = amt/5;
                System.out.print("The number of notes are "+note+".");
                break;
            case 10:
                note = amt/10;
                System.out.print("The number of notes are "+note+".");
                break;
            case 20:
                note = amt/20;
                System.out.print("The number of notes are "+note+".");
                break;
            case 50:
                note = amt/50;
                System.out.print("The number of notes are "+note+".");
                break;
            case 100:
                note = amt/100;
                System.out.print("The number of notes are "+note+".");
                break;
            case 500:
                note = amt/500;
                System.out.print("The number of notes are "+note+".");
                break;
            case 1000:
                note = amt/1000;
                System.out.print("The number of notes are "+note+".");
                break;
            default:
                System.out.print("Invalid");
        }

    }
}



//13. JAVA Program to take the value from the user as input all sides of a triangle and check whether
//   the triangle is valid or not. Using switch statement

class trianglee{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a=sc.nextInt();
        System.out.println("Enter second side: ");
        int b=sc.nextInt();
        System.out.println("Enter third side: ");
        int c=sc.nextInt();
        switch (((a+b+c)!=180)?0:1){
            case 0:
                System.out.println("Not Valid");
                break;
            case 1:
                System.out.println("Valid");
                break;
        }
    }
}

//14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
//Using switch statement.
class tri{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a=sc.nextInt();
        System.out.println("Enter second side: ");
        int b=sc.nextInt();
        System.out.println("Enter third side: ");
        int c=sc.nextInt();
        switch(((a+b+c)==180)?0:1){
            case 0:
                switch((a==b&&b==c)?0:1){
                    case 0:
                        System.out.println("It is equilateral.");
                        break;
                    case 1:
                        switch ((a==b ||b==c||c==a)?0:1){
                            case 0:
                                System.out.println("It is isosceles.");
                                break;
                            case 1:
                                System.out.println("It is Scalene triangle.");
                        }break;
                }break;
            case 1:
                System.out.println("Invalid number.");
        }
    }
}


//15. JAVA Program to find all the roots of a quadratic equation. Using switch statement.

class equ{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b,c;
        double root1,root2;

        System.out.print("Enter the first number a: ");
        a=scanner.nextDouble();

        System.out.print("Enter the second number b: ");
        b = scanner.nextDouble();

        System.out.print("Enter the third number c: ");
        c = scanner.nextDouble();

        double determinant = b * b - 4 * a * c;

        switch ((determinant>0)?1:(determinant==0)?2:(determinant<0)?3:0){
            case 1:
                root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                root2 = (-b - Math.sqrt(determinant)) / (2 * a);
                System.out.print("The roots are real and different.\nroot1="+root1+"\nroot2="+root2);
                break;
            case 2:
                root1 = root2 = -b / (2 * a);
                System.out.print("The roots are real and equal.\nroot1 and root2 = "+root1);
                break;
            case 3:
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-determinant) / (2 * a);
                System.out.print("The roots are complex and distinct.\nreal = "+real+"\"" +"\nimaginary= "+imaginary);
                break;
            case 0:
                System.out.print("Invalid");
        }
    }
}
//16. JAVA Program to calculate profit or loss. Using switch statement.
class profit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Selling price: ");
        float sp=sc.nextFloat();
        System.out.println("Cost price: ");
        float cp=sc.nextFloat();
        switch ((sp>cp)?0:(cp>sp)?1:3){
            case 0:
                System.out.println("Profit: "+(sp-cp));
                break;
            case 1:
                System.out.println("Loss: "+(cp-sp));
        }
    }
}

//18. JAVA Program to take the value from the user as input the basic salary of an employee and
//calculate its Gross salary according to the following:
// Basic Salary <= 10000: HRA = 20%, DA =80%
// Basic Salary <= 20000 : HRA = 25%, DA =90%
// Basic Salary > 20000 : HRA = 30%, DA = 95%.

class input{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your basic salary: ");
        double salary=scan.nextDouble();

        double HRA,DA;

        switch ( (salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0 ){

            case 1:
                System.out.println("Gross salary is "+ (salary+(0.2*salary)+(0.8*salary)));
                break;

            case 2:
                System.out.println("Gross salary is "+ (salary+(0.25*salary)+(0.9*salary)));
                break;

            case 3:
                System.out.println("Gross salary is "+ (salary+(0.3*salary)+(0.95*salary)));
                break;

            case 0:
                System.out.println("no thing");
                break;

            default:
                System.out.println("invalid");

        }

    }
}


//19. JAVA Program to take the value from the user as input electricity unit charges and calculate total electricity bill according to the given condition: For the first 50 units Rs. 0.50/unit………….For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit ……………For unit above 250 units  Rs. 1.50/unit………An additional surcharge of 20% is added to the bill…….Using the switch statement.
class unit{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double amount,sur,bill;

        System.out.println("Enter the electricity unit charges:");
        double unit= scan.nextDouble();

        switch ( (unit<=50)?1:(unit<=150)?2:(unit<=250)?3:0){


            case 1:
                amount=unit*0.5;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("The total bill is "+ bill);
                break;

            case 2:
                amount=25+(unit-50)*0.75;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("the total bill is"+bill);
                break;

            case 3:
                amount=25+75+(unit-150)*1.20;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;

            case 4:
                amount=25+75+150+(unit-250)*1.50;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;

            default:
                System.out.println("invalid");






        }





    }
}
//20. Write a program that determines a student’s grade. The program will read three types of scores
//        (quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
//        average score =90% =>grade=A…………………..-if the average score >= 70% and <90% =>
//        grade=B……………………-if the average score>=50% and <70%`
//        =>grade=C……………………..-if the average score<50% =>grade=F
//        */

class Grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double quiz, mid, final_term,p;
        System.out.println("Enter the quiz_term marks: ");
        quiz=scanner.nextDouble();
        System.out.println("Enter the mid_term marks: ");
        mid=scanner.nextDouble();
        System.out.println("Enter the final_term marks: ");
        final_term=scanner.nextDouble();

        p=(quiz+mid+final_term)/3;
        System.out.println("the total percent is "+p);

        switch ((p>=90)? 0:(p>=70&& p<90)? 1:(p>=50&& p<70)?2:3){
            case 0:
                System.out.println("Grade A");
                break;
            case 1:
                System.out.println("Grade B");
                break;
            case 2:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("not valid");
        }

    }
}

/*
21. Program to take the hours and minutes as input by the user and the show that whether it is AM
or PM by using the switch statement.
*/
class Minute{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scan.nextDouble();
        System.out.println("enter the total minutes: ");
        minutes=scan.nextDouble();

        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;

        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24?2:3)){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;
            case 3:
                System.out.println("invalid input");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

/*
22. Program to convert a positive number into negative number and negative number into a positive
number using switch statement
*/
class Pos{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the number: ");
        double num=scanner.nextDouble();

        switch((num<0)?1:(num>0)?2:3){
            case 1:
                System.out.println("you enter the negative no ");
                System.out.println("so it positive no is "+(num*-1));
                break;
            case 2:
                System.out.println("you enter the positive no ");
                System.out.println("so its negative no is "+(num*-1));
                break;
            case 3:
                System.out.println("you enter the invalid no or zero ");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}

/*
23. Write a program to swap the values of two numbers if the values of both variables are not the
same using a switch statement.
*/
class Var{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        System.out.println("Enter the first no:");
        double a=scanner.nextDouble();
        System.out.println("Enter the second no:");
        double b=scanner.nextDouble();
        temp=a;
        a=b;
        b=temp;
        switch((a!=b)?1:(a==b)?2:3){
            case 1:
                System.out.println("a="+a);
                System.out.println("b="+b);
                break;
            case 2:
                System.out.println("Don't take two same no");
                break;
            case 3:
                System.out.println("invalid");
                break;
        }


    }
}
/*
24. Program to Convert even number into its upper nearest odd number Switch Statement*/
class Upper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println(num + " is an even number");
                System.out.println("And it's upper nearest odd number is " + (num + 1));
                break;
            case 1:
                System.out.println("Don't enter the odd number");
                break;
            default:
                System.out.println("invalid");
        }
    }
}