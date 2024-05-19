package jsonMoreComplex;

import java.util.List;

public class Project {
	private String projectId;
	private String projectName;
	private String role;
	private List<String> technologies;
	private String deadline;

	public Project() {
	}

	public Project(String projectId, String projectName, String role, List<String> technologies, String deadline) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.role = role;
		this.technologies = technologies;
		this.deadline = deadline;
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

	public List<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", role=" + role + ", technologies="
				+ technologies + ", deadline=" + deadline + "]";
	}

}
