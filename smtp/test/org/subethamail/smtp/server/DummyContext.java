package org.subethamail.smtp.server;

import java.io.IOException;
import java.net.Socket;

public class DummyContext implements ConnectionContext
{
	String response;
	Session session;
	SMTPServer server;

	public DummyContext(Session session, SMTPServer server)
	{
		this.session = session;
		this.server = server;
	}

	public ConnectionHandler getConnection()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public SMTPServer getServer()
	{
		return this.server;
	}

	public Session getSession()
	{
		return this.session;
	}

	public Socket getSocket()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void sendResponse(String response) throws IOException
	{
		this.response = response;
	}
	
	public String getResponse()
	{
		String tmp = new String(this.response);
		this.response = null;
		return tmp;
	}
}