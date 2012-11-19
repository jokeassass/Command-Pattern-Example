/* invoker*/
public class CancelButton {
	  
	private Command operationPluse;
	
     public CancelButton(Command operationPluse)
     {
    	 this.operationPluse = operationPluse;
     }
     
     public void press()
     {
    	 operationPluse.press();
     }
}
