package interfaces;
import clases.AppIoT;


public class ApploTServiceImplement implements ApploTService {

	@Override
	public AppIoT createApp() {
		
		AppIoT app = new AppIoT();
		return app;
	}

}




