
public class StopPublishBooks implements CommandBooks {
	
	BookCommandControls control;
	public StopPublishBooks(BookCommandControls control)
	{
		this.control=control;
	}
	public void executeCommand()
	{
		control.stopPublish();
	}

}
