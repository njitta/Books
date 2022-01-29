
public class TestCommandFacade {

	public static void main(String[] args) {
		
		
		
		PublishButton cbutton = new PublishButton();
		BookCommandControls book = new BookCommandControls();
		BookFacade bookfacade = new BookFacade();
		
		cbutton.setCommand(new StartPublishBooks(book));
		cbutton.buttonPressed();
		bookfacade.startPublish();
		
		cbutton.setCommand(new StopPublishBooks(book));
		cbutton.buttonPressed();		
		bookfacade.stopPublish();
		

	}

}
