import java.util.Scanner;

public class CollegeList {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Person person = new Person();
		Faculty faculty = new Faculty();
		Employee employee = new Employee();
		
		System.out.print("Press 'E' for Employee, 'F' for Faculty, and 'S' for Student: ");
		String user = input.nextLine();
		
		while(true){
			if(user.equalsIgnoreCase("E")){
				System.out.println("Type Employee's name, contact number, salary and department. \nPress Enter after every input");
				person.setName(input.nextLine());
				person.setContactNum(input.next());
				employee.setSalary(input.nextDouble());
				employee.setDepartment(input.next());
				
				System.out.println("------------------------------------------------------");
				System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() + "\nSalary: " + employee.getSalary() + "\nDepartment: " + employee.getDepartment());
				break;	
			}
			else if(user.equalsIgnoreCase("F")){
				System.out.println("Print 'Y' if the faculty member is regular/tenured or 'N' if not: ");
				String tenure = input.nextLine();
				
				while(true){
					if(faculty.isRegular() == tenure.equalsIgnoreCase("Y")){
						System.out.println("Type faculty's name, contact number, salary and department. \nPress Enter after every input");
						
						person.setName(input.nextLine());
						person.setContactNum(input.next());
						employee.setSalary(input.nextDouble());
						employee.setDepartment(input.next());
						
						System.out.println("------------------------------------------------------");
						System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() + "\nSalary: " + employee.getSalary() + "\nDepartment: "  + employee.getDepartment() + "\nStatus: Regular");
						break;
					}
					else if(faculty.isRegular() == tenure.equalsIgnoreCase("N")){
						System.out.println("Type faculty's name, contact number, salary and department. \nPress Enter after every input");
						
						person.setName(input.nextLine());
						person.setContactNum(input.next());
						employee.setSalary(input.nextDouble());
						employee.setDepartment(input.next());
						
						System.out.println("------------------------------------------------------");
						System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() + "\nSalary: " + employee.getSalary() + "\nDepartment: "  + employee.getDepartment() + "\nStatus: Not Regular");
						break;
					}
				}
				break;
			}
			else if(user.equalsIgnoreCase("S")){
				Student student = new Student();
				
				System.out.println("Type Student's name, contact number, enrolled program, and year level. \nPress Enter after every input");
				
				person.setName(input.nextLine());
				person.setContactNum(input.next());
				student.setProgram(input.next());
				student.setYearLevel(input.next());
				
				System.out.println("------------------------------------------------------");
				System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() + "\nProgram: " + student.getProgram() + "\nYear Level: " + student.getYearLevel());
				break;
			}
		}
	}
}