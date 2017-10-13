/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRS_Driver;

import java.util.ArrayList;
import studentregistrationsystem.Student;
import studentregistrationsystem.Module;
import studentregistrationsystem.Course;
/**
 *
 * @author Marta
 */
public class SRS_Driver {
            
    private static int IDcount = 17100001;

    public static void main(final String... args) {
        
        final ArrayList<Student> studentIntake = new ArrayList<>();
        final Student john = new Student("John Maven", "01-10-1982", IDcount++);

        studentIntake.add(john);
        studentIntake.add(new Student("Dell O'Connor", "10-03-1982", IDcount++));
        studentIntake.add(new Student("Java Flemming", "12-05-1982", IDcount++));
        studentIntake.add(new Student("Node Jayess", "19-02-1982", IDcount++));
        studentIntake.add(new Student("Raquel Jenkins", "02-07-1982", IDcount++));
        studentIntake.add(new Student("Sam Git", "11-11-1982", IDcount++));
        studentIntake.add(new Student("Juno Python", "29-04-1982", IDcount++));
        studentIntake.add(new Student("Hera Kibana", "23-06-1982", IDcount++));
        studentIntake.add(new Student("Jit Pack", "17-12-1982", IDcount++));
        studentIntake.add(new Student("Jupiter Angular", "31-10-1982", IDcount++));
        studentIntake.add(new Student("Power Shell", "07-07-1982", IDcount++));
        studentIntake.add(new Student("Pascal Duran", "31-08-1982", IDcount++));
        studentIntake.add(new Student("Delphi Murphy", "21-10-1982", IDcount++));
        studentIntake.add(new Student("Jessica C Sharp", "09-01-1982", IDcount++));
        studentIntake.add(new Student("Marta Fortran", "07-09-1982", IDcount++));

        final Module module1 = new Module("Software Engineering", "CT111");
        final Module module2 = new Module("Professional Skills", "CT222");
        final Module module3 = new Module("Networks & Communication", "CT333");
        final Module module4 = new Module("Programming VI", "CT444");
        final Module module5 = new Module("Next Generation Technology", "CT555");
        final Module module6 = new Module("Mathematics", "MA111");
        final Module module7 = new Module("Artificial Intelligence", "CT666");

        final Course course1 = new Course("Computer Science & IT", "01-09-2017", "30-05-2021");

        //Add individual Student to several modules
        module1.addStudent(john);
        module2.addStudent(john);
        module3.addStudent(john);
        module4.addStudent(john);
        module5.addStudent(john);
        module6.addStudent(john);
        module7.addStudent(john);
        
        //multiple students to one module
        for (final Student student : studentIntake) {
            
            module2.addStudent(student);
            //module3.addStudent(student);
            module4.addStudent(student);
            //module5.addStudent(student);
            module6.addStudent(student);
            //module7.addStudent(student);
        }


        course1.addModule(module1);
        course1.addModule(module2);
        course1.addModule(module3);
        course1.addModule(module4);
        course1.addModule(module5);
        course1.addModule(module6);
        course1.addModule(module7);

        for (final Student student : course1.getStudents()) {
            System.out.println("--------------- STUDENT ---------------");
            System.out.println("Name:\t" + student.getStudentName());
            System.out.println("DOB:\t" + student.getDOB());
            System.out.println("Age:\t" + student.getAge());
            System.out.println("Student ID:\t" + student.getStudentID());            
            System.out.println("Username:\t" + student.getUsername());
            System.out.println("Course:\t" + student.getCourse());
            System.out.println("Modules:");
            for (final Module module : student.getModules()) {
                System.out.println(module.toString());
            }
            System.out.println("---------------------------------------");
        }
    
    }
}
