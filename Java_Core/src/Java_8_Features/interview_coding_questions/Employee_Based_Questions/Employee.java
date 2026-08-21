package Java_8_Features.interview_coding_questions.Employee_Based_Questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Employee {

    int empId;
    String empName;
    String empDepartment;
    int empSalary;

    public Employee(int id, String name, String dept,int salary){
        this.empId = id;
        this.empName = name;
        this.empDepartment = dept;
        this.empSalary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}

class Demo{
    static void main() {

        Map<Integer,Employee> empDetails = new HashMap<>();
        empDetails.put(1,new Employee(101,"Sneha","IT",75000));
        empDetails.put(2,new Employee(102,"Suhas","ME",70000));
        empDetails.put(3,new Employee(103,"Janu","IT",45000));
        empDetails.put(4,new Employee(103,"Basu","IT",85000));


        empDetails.forEach(
                (i,emp) -> {
                    System.out.println(i+" - "+emp);
                }
        );

        System.out.println("----------------");
        // Find employees with salary > 50000
        List<Employee> emp = empDetails.values()
                .stream()
                .filter(n -> n.empSalary>50000)
                .toList();

        System.out.println(emp);

        //to get only names
        System.out.println("---fetch only emp names---");
       Iterator<Employee> it = emp.iterator();
       while(it.hasNext()){
           System.out.println(it.next().empName);
       }

       //fetch all emp names
        System.out.println("---fetch all emp names---");
        List<Employee> empList = empDetails.values()
                .stream()
                .toList();

        Iterator<Employee> e = empList.iterator();
        while (e.hasNext()){
            System.out.println(e.next().empName);
        }
    }
}