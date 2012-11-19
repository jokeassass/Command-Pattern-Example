
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Command cancel = new OperationCancel(cal);
		CancelButton cancelBtn = new CancelButton(cancel);
		cancelBtn.press();
		

	}

}
