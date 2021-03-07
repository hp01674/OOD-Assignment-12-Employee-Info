public class MVCDriver {
	public static void main(String[] args) {

		// retrieves the employee's name based on his employee ID
		Employee model = retrieveEmployee();
		EmployeeView view = new EmployeeView();

		EmployeeController controller = new EmployeeController(model, view);

		controller.viewUpdate();
		// declare employee name
		controller.setEmployeeName("Maddie Timpton");
		controller.viewUpdate();
	}

	private static Employee retrieveEmployee() {
		Employee employee = new Employee();
		// declare employee name
		employee.setFullName("Jackson Wright");
		// declare employee ID
		employee.setIDNumber("673435");
		return employee;
	}
}
