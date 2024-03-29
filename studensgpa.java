/*QUESTION - Develop a Java program to create a class Student with members usn, name, an array 
        credits and an array marks. Include methods to accept and display details and a 
        method to calculate SGPA of a student.*/

                                            // CODE

import java.util.Scanner;
class Student
{
    String usn,name;
    int n;
    int c[],m[];
    void acc()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the usn of the student : ");
        usn = s1.nextLine();
        System.out.println("Enter the name of the student : ");
        name = s1.nextLine();
        System.out.println("Enter the number of subjects : ");
        n = s1.nextInt();
        c = new int[n];
        m = new int [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the number of credits of subject " + (i+1) + " : ");
            c[i]=s1.nextInt();
            System.out.println("Enter the marks of subject " + (i+1) +" : ");
            m[i]=s1.nextInt();
        }
    }
    int gp(int marks)
    {
        if(marks>=90)
            return 10;
        else if (marks>= 80)
            return 9;
        else if (marks>=70)
            return 8;
        else if (marks>=60)
            return 7;
        else if (marks>=50)
            return 6;
        else
            return 0;
    }
    double sgpa()
    {
        int tc = 0,sum=0;
        for(int i=0;i<n;i++)
        {
            tc = tc + c[i];
            sum = sum + gp(m[i]) * c[i];
        }
        return (sum/tc);
    }
    void disp()
    {
        System.out.println("USN = "+usn);
        System.out.println("NAME = "+name);
    }
}
class Main
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.acc();
        s.disp();
        System.out.println("The SGPA = " +s.sgpa());
    }
}


                                    OUTPUT

Enter the usn of the student : 
1BM22CS082
Enter the name of the student : 
Deekshith B
Enter the number of subjects : 
4
Enter the number of credits of subject 1 : 
4
Enter the marks of subject 1 : 
93
Enter the number of credits of subject 2 : 
3
Enter the marks of subject 2 : 
85
Enter the number of credits of subject 3 : 
2
Enter the marks of subject 3 : 
96
Enter the number of credits of subject 4 : 
1
Enter the marks of subject 4 : 
82
USN = 1BM22CS082NAME = Deekshith B
The SGPA = 9.0
