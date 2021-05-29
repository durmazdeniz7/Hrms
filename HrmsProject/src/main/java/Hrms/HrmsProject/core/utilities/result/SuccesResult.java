package Hrms.HrmsProject.core.utilities.result;

public class SuccesResult extends Result {

	public SuccesResult(String message) {
		super(true, message);
	}

	public SuccesResult() {
		super(true);
	}
}
