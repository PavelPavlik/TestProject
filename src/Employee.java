public class Employee {
	private String fio;
	private String dateOfBirth;
	private String dateOfJob;

	public Employee(String fio, String dateOfBirth, String dateOfJob) {
		this.fio = fio;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJob = dateOfJob;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfJob() {
		return dateOfJob;
	}

	public void setDateOfJob(String dateOfJob) {
		this.dateOfJob = dateOfJob;
	}
}
