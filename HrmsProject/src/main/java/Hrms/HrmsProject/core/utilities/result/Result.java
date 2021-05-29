package Hrms.HrmsProject.core.utilities.result;

public class Result {
	private String message;
	private boolean succes;

	

	public Result(boolean succes) {
		this.succes = succes;
	}

	public Result(boolean succes, String message) {
		this(succes);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public boolean isSucces() {
		return this.succes;
	}

}
