import java.lang.Math.*;
import java.util.ArrayList;
public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	public PC(String p)
	{
		super(p);
	}
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return  "Platform: " + super.getPlatform() +
				"\nSerial #: " + super.getSerialNo() + 
				"\nController: " + systemInput();
	}
	
}