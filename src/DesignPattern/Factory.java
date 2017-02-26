package DesignPattern;

public class Factory<E> {
	
	Class obj=null;
	public Factory(Class obj)
	{
		this.obj=obj;
	}
	public E createObject() throws InstantiationException, IllegalAccessException
	{
		return (E) this.obj.newInstance();	
	}
}
