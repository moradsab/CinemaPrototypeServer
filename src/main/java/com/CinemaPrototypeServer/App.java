package com.CinemaPrototypeServer;

import java.io.IOException;


public class App 
{
	
	private static Server server;
    public static void main( String[] args ) throws IOException
    {
        server = new Server(3000);
        server.listen();
    }
}