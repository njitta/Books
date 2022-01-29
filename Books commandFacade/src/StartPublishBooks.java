
public class StartPublishBooks implements CommandBooks {
	
	BookCommandControls control;
	public StartPublishBooks(BookCommandControls control)
	{
		this.control=control;
	}
	public void executeCommand()
	{
		control.startPublish();
	}

}
