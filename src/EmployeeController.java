// EmployeeController.java
public class EmployeeController {

	private EmployeeView employeeView;
	private Employee employeeModel;

	public EmployeeController(Employee employeeModel, EmployeeView employeeView) {
		this.employeeModel = employeeModel;
		this.employeeView = employeeView;
	}

	public void setEmployeeName(String fullName) {
		employeeModel.setFullName(fullName);
	}

	public String getEmployeeName() {
		return employeeModel.getFullName();
	}

	public void setEmployeeIDNumber(String IDNumber) {
		employeeModel.setIDNumber(IDNumber);
	}

	public String getEmployeeIDNumber() {
		return employeeModel.getIDNumber();
	}

	// update info
	public void viewUpdate() {
		employeeView.displayEmployeeInfo(employeeModel.getFullName(), employeeModel.getIDNumber());
	}
}
