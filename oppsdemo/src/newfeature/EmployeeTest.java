package newfeature;
import java.util.Arrays;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] employees  = {
                new Employee("David"),
                new Employee("Naveen"),
                new Employee("Alex"),
                new Employee("Richard")};
             
            System.out.println("Before Sorting Names: "+Arrays.toString(employees));
           
            Arrays.sort(employees,Employee::nameCompare);
            System.out.println("fter sorting names:"+Arrays.toString(employees));
            
            
                     
	}

}
