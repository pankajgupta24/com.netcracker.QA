package selenium;

public class Demo {

	
	interface area
	{
	final int a = 10;
	public void areaMethod();
	}

	interface perimeter
	{
	final int b = 10;
	public void periMethod();
	}

	public class interfaceExample implements area, perimeter
	{
	public void areaMethod()
	{
	int area1;
	area1 = a*a ;
	System.out.println(area1);
	}

	public void periMethod()
	{
	int peri1;
	peri1 = 4*b;
	System.out.println(peri1);
	}

	public void main(String[] aaa) 
	{
	interfaceExample IE = new interfaceExample();
	IE.areaMethod();
	IE.periMethod();
	
	}
	}
	
	
}
