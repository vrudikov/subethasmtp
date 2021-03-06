package org.subethamail.smtp.internal.server;

/**
 * @author Ian McFarland &lt;ian@neo.com&gt;
 */
@SuppressWarnings("serial")
public class CommandException extends Exception
{
	/** */
	public CommandException(String string, Throwable throwable)
	{
		super(string, throwable);
	}

	/** */
	public CommandException(String string)
	{
		super(string);
	}

	/** */
	public CommandException()
	{
		super();
	}

	/** */
	public CommandException(Throwable throwable)
	{
		super(throwable);
	}
}
