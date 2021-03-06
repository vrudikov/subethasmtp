package org.subethamail.smtp.internal.server;

/**
 * @author Ian McFarland &lt;ian@neo.com&gt;
 */
@SuppressWarnings("serial")
public final class InvalidCommandNameException extends CommandException
{
	/** */
	public InvalidCommandNameException()
	{
		super();
	}

	/** */
	public InvalidCommandNameException(String string)
	{
		super(string);
	}

	/** */
	public InvalidCommandNameException(String string, Throwable throwable)
	{
		super(string, throwable);
	}

	/** */
	public InvalidCommandNameException(Throwable throwable)
	{
		super(throwable);
	}
}
