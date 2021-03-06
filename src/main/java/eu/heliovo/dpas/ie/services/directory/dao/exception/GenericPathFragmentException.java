package eu.heliovo.dpas.ie.services.directory.dao.exception;


public class GenericPathFragmentException extends Exception
{
	private static final long serialVersionUID = 5237896903254923902L;
	// added vy Vineeth
	String error="";
	public GenericPathFragmentException()
	{
		super();             
		error = "unknown";
	}

	public GenericPathFragmentException(String err)
	{
		super(err);   
		error = err;  
	}
	public GenericPathFragmentException(String err,Throwable tr)
	{
		super(err,tr);   
		error = err;  
	}	

	public String getError()
	{
		return error;
	}

}
