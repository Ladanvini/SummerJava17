package entities;

public class Student {
	private String _name;
	private int _age;
	private boolean _isFemale;
	
	public Student()
	{
		_name = "";
		_age = 0;
		_isFemale = false;
	}
	public Student(String name, int age, boolean isFemale)
	{
		_name = name;
		_age = age;
		_isFemale = isFemale;
	}
	public String toString()
	{
		return _name + _age + (_isFemale?"female":"male");
	}

}
