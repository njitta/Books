
public class PublishButton {
	
	CommandBooks button;
	public PublishButton() {}
	public void setCommand(CommandBooks command)
	{
		button = command;
	}
	public void buttonPressed()
	{
		button.executeCommand();
	}

}
