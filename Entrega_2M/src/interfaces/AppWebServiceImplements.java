package interfaces;

import clases.AppWeb;

public class AppWebServiceImplements implements AppWebService {

	@Override
	public AppWeb createApp() {
		AppWeb web1= new AppWeb();

		
		return web1;
	}

}
