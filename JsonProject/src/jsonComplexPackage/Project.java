package jsonComplexPackage;

public class Project {
	private String projectId;
	private String projectName;
	private String role;

	public Project() {
	}

	public Project(String projectId, String projectName, String role) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.role = role;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Project {projectId=" + projectId + ", projectName=" + projectName + ", role=" + role + "]";
	}

}
