/* */
public class OperationCancel implements Command 
{
    private Calculator cal;
	public OperationCancel(Calculator cal)
	{
		this.cal = cal;
	}
	
	@Override
	public void press() {
	   cal.cancel();
	}

}
