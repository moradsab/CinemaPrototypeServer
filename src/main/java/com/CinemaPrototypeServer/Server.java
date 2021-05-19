

package com.CinemaPrototypeServer;

import java.io.IOException;

import com.CinemaPrototypeServer.ocsf.AbstractServer;
import com.CinemaPrototypeServer.ocsf.ConnectionToClient;




public class Server extends AbstractServer {

	public Server(int port) {
		super(port);
		
	}

	@Override
	protected void handleMessageFromClient(Object getMovies, ConnectionToClient client) {
		String[] actors= {"actor1","actor2","actor3"};
		String[] branches= {"branch1","branch2","branch3"};
		Movie[] movies= {new Movie("Movie1","Director1",actors,branches),
						new Movie("Movie2","Director2",actors,branches),
						new Movie("Movie3","Director3",actors,branches),
						new Movie("Movie4","Director4",actors,branches),
						new Movie("Movie5","Director5",actors,branches)};
		
		try {
			client.sendToClient(movies);
			System.out.format("Sent movies to client %s\n", client.getInetAddress().getHostAddress());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}