
import java.util.Scanner;





    public class Studentmgmt{
        String roll="";
        String name="";
        int grade=0;
        char sec;
        String course="";
        int balance=0;
        Scanner inp = new Scanner(System.in);

        public void newStudent(int counting)
    {
        System.out.println("Enter the Following details:");
        
        System.out.println("Name: ");
        name = inp.nextLine();
        
        System.out.println("Grade ");
        grade = inp.nextInt();
        
        System.out.println("Section: ");
        sec = inp.next().charAt(0);
        
        System.out.println("Course: ");
        course = inp.next();
        
        roll = String.valueOf(grade) + String.valueOf(counting);
        counting++;
        balance = 0;
        System.out.println("Student " + name + " created");


    }

    public void showStudent()
    {
        System.out.println("Details of Student:   " + name);
        
        System.out.println("Name: "+name);
        
        
        System.out.println("Grade "+grade);
        
        
        System.out.println("Section: "+ sec);
        
        
        System.out.println("Course: "+ course);

        System.out.println("Enrollment No.: "+  roll);

        System.out.println("Balance "+ balance);
        

    }
    

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scr = new Scanner(System.in);
        Studentmgmt st1 = new Studentmgmt();
        Studentmgmt st2 = new Studentmgmt();
        Studentmgmt st3 = new Studentmgmt();
        Studentmgmt st4 = new Studentmgmt();
        Studentmgmt st5 = new Studentmgmt();
        
        
        int choice=0, q=1;
        int count = 100;
        System.out.println("Welcome to Student Management System");
        while(choice != 9)
        {
        
        System.out.println("1. View Names of each Student");
        System.out.println("2. View detail of a Student");
        System.out.println("3. Count No. of Student");
        System.out.println("4. Create a Student");
        System.out.println("9. Exit");
        
        
        choice = scr.nextInt();
        
        if(choice == 1)
        {
            System.out.println(st1.name + "#" + st2.name + "#" + st3.name + "#" + st4.name + "#" + st5.name );
        }
        
        else if(choice == 2)
        {
            while(choice != 0)
            {
            System.out.println("Enter Student No. [1-5]    {0 to Main Menu}");
            choice = 1;
            choice = scr.nextInt();
            if(choice == 1)
                st1.showStudent();

            else if(choice == 2)
                st2.showStudent();
            
            else if(choice == 3)
                st3.showStudent();

            else if(choice == 4)
                st4.showStudent();

            else if(choice == 5)
                st5.showStudent();

            else
                {System.out.println("Exiting");
                choice=0;}
            
            }
        }

        else if(choice == 4)
        {
            System.out.println("Detail Section ");
            
            
            if(q == 1)
                st1.newStudent(count);

            else if(q == 2)
                st2.newStudent(count);
            
            else if(q == 3)
                st3.newStudent(count);

            else if(q == 4)
                st4.newStudent(count);

            else if(q == 5)
                st5.newStudent(count);

            else
                System.out.println("wrong choice");
        
            q++;
            count++;
        }
    }
        
        
        
}


}

    
    



