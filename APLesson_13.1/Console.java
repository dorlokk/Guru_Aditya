import java.lang.Math.*;
import java.util.ArrayList;
public abstract class Console extends GameSystem
{
	public Console()
	{
		super();
	}
	public Console(String p)
	{
		super(p);
	}
	public abstract String getController();
	
	public String toString()
	{
		return  "Platform: " + super.getPlatform() +
				"\nSerial #: " + super.getSerialNo() + 
				"\nController: " + getController();
	}
	
}