import java.util.*;

public class Main {
    public static void main(String[] args) {
        int value = 0;
        List<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        do{
            System.out.println("Enter 1 for Insert");
            System.out.println("Enter 2 for Display");
            System.out.println("Enter 3 for search");
            System.out.println("Enter 4 for delete");
            System.out.println("Enter 5 for update");
            System.out.println("Enter 0 for exit");
            value = sc.nextInt();

            try {

                switch (value) {
                    case 1:
                        System.out.println("-------------------------");
                        System.out.println("Enter Employee Details");
                        System.out.print("Enter employee id : ");
                        int empno = sc.nextInt();
                        System.out.print("Enter employee name : ");
                        String empname = sc1.nextLine();
                        System.out.print("Enter employee department : ");
                        String empdpt = sc1.nextLine();
                        System.out.print("Enter employee salary : ");
                        int empsalary = sc.nextInt();

                        list.add(new Employee(empno, empname, empdpt, empsalary));
                        System.out.println("Employee details add successfully");
                        System.out.println("--------------------------------");
                        break;
                    case 2:
                        System.out.println("=======================================");
                        Iterator<Employee> i = list.iterator();
                        while (i.hasNext()) {
                            Employee e = i.next();
                            System.out.println(e);
                        }

//                    for(Employee e : list){
//                        System.out.println(e);
//                    }
                        System.out.println("=======================================");
                        break;
                    case 3:
                        System.out.println("------------------------------------");
                        boolean found = false;
                        System.out.println("Enter employee details for search");
                        System.out.print("Eneter employee id : ");
                        int id = sc.nextInt();
                        i = list.iterator();
                        while (i.hasNext()) {
                            Employee e = i.next();
                            if (e.getEmpno() == id) {
                                System.out.println(e);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Record not found");
                        }
                        System.out.println("------------------------------------");
                        break;
                    case 4:
                        System.out.println("-------------------------------------");
                        found = false;
                        System.out.println("Enter employee details for delete ");
                        System.out.print("Eneter employee id : ");
                        id = sc.nextInt();
//
                        i = list.iterator();
                        while (i.hasNext()) {
                            Employee e = i.next();
                            if (e.getEmpno() == id) {
                                i.remove();
                                found = true;
                                System.out.println("Record delete successfully");
                            }
                        }
                        if (!found) {
                            System.out.println("Record not found");
                        }
                        break;
                    case 5:
                        System.out.println("-------------------------------------");
                        found = false;
                        System.out.println("Enter employee details for update");
                        System.out.print("Eneter employee id : ");
                        id = sc.nextInt();
//
                        ListIterator<Employee> li = list.listIterator();
                        while (li.hasNext()) {
                            Employee e = li.next();
                            if (e.getEmpno() == id) {
                                System.out.print("Enter employee name : ");
                                empname = sc1.nextLine();
                                System.out.print("Enter employee department");
                                empdpt = sc1.nextLine();
                                System.out.print("Enter employee new salary : ");
                                empsalary = sc.nextInt();

                                li.set(new Employee(id,empname,empdpt,empsalary));
                                found = true;
                                System.out.println("Record Updated successfully");
                            }

                        }
                        if (!found) {
                            System.out.println("Record not found");
                        }
                        System.out.println("-------------------------------");
                        break;
                }
            }
            catch (InputMismatchException e){
                throw new InputMismatchException("Incorrect input");
            }
        }while (value!=0);
    }
}