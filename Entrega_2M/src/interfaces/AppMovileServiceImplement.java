package interfaces;

import clases.AppMobile;

public class AppMovileServiceImplement implements AppMovileService {

	@Override
	public AppMobile createApp() {

		
		AppMobile Mobile = new AppMobile();

		
		return Mobile; 
	}

}
