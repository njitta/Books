
public class BookFacade {
	
	
	private PrintingMachine pm ;
	private Details detail;
	private Binding bind;
	public BookFacade()
	{
		pm = new PrintingMachine();
		detail =new Details();
		bind = new Binding();
	}
	
	public void startPublish()
	{
		pm.on();
		detail.authorName();
		detail.edition();
		bind.startBinding();
	}
	
	public void stopPublish()
	{
		pm.off();
		bind.stopBinding();
	}
	
	

}
