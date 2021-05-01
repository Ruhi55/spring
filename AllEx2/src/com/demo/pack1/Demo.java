package com.demo.pack1;
//import java.l.InterruptedException;
import java.util.*;
import java.util.stream.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("is it u");
		List<Emp> emp=new ArrayList<Emp>();
		emp.add(new Emp(1101,"Wahab", 100000));
		
		emp.add(new Emp(1102,"Mom", 90000));
		emp.add(new Emp(1103,"Mumpy", 50000));
		emp.add(new Emp(1104,"Kutus", 20000));
		emp.add(new Emp(1105,"Alik", 80000));
		System.out.println(emp.toString());
		
		Collections.sort(emp);
		//System.out.println(emp);
		emp.forEach(s->System.out.println(s));
		EmpName ename=new EmpName();
		Collections.sort(emp,ename);
		//System.out.println(emp);
		emp.forEach(s->System.out.println(s));
		EmpId eid=new EmpId();
		Collections.sort(emp,eid);
		//System.out.println(emp);
		emp.forEach(s->System.out.println(s));
		
		
	
		
		
		
	}
	
	
}
class EmpName implements Comparator<Emp>
{
	@Override
	public int compare(Emp e1,Emp e2)
	{
		return e1.getName().compareTo(e2.getName());
	}
}

class EmpId implements Comparator<Emp>
{
	public int compare(Emp e1,Emp e2)
	{
		if(e1.getId()>(e2.getId()))
	      return 1;
		else if(e1.getId()<(e2.getId()))
			return -1;
		else
			return 0;
			
	}
}

class Emp implements Comparable<Emp>
{
	 public Emp(long id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	long id;
	 String name;
	 int sal;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	@Override
	public int compareTo(Emp e1)
	{
		if(this.getSal()>e1.getSal())
			return 1;
		else 
			return -1;
	}
	
	
	 
}


		/*List<Emp> emp=new ArrayList<Emp>();
		emp.add(new Emp(11000001,"Mom", 100000));
		
		emp.add(new Emp(11000002,"Ra", 90000));
		emp.add(new Emp(11000003,"ma", 50000));
		emp.add(new Emp(11000041,"Ru", 20000));
		emp.add(new Emp(11000005,"wa", 80000));
		System.out.println(emp.toString());
		
	    int total = emp.stream().filter(f->(f.getSal()>50000 && f.getSal()<100000))
                 .collect(Collectors.summingInt(Emp::getSal));
	    System.out.println("total salary --"+total);
	     
	    //System.out.println(emp.stream());
	    emp.stream().filter(s->s.sal<90000).forEach(s->System.out.println(s));
	    
	    


		
	
		
		
		
	}
}
 class Emp
 {
	 public Emp(long id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	long id;
	 String name;
	 int sal;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	 
 }

/*interface I
{
	int add(int a,int b);
	
}
		//Runnable r=new Demo1();
		/*Demo1 t1=new Demo1();
		t1.start();
		
	
		for(int j=1;j<=5;j++)
		{
		System.out.println("MAIN THREAD RUNNING--"+j);
		}
		
	}
	
	
}
class Demo1 extends Thread
{
	public void run()
	{
		int a =10;
		for(int i=1;i<=5;i++)
		{
			a=a+i;
			System.out.println("child thrEAD RUNNING--" +a);
			//a=a+i;
			//System.out.println(a);
		}
	}
}
 

		/*D d=new D();
		d.start();
		synchronized(d)
		{
			System.out.println("main thread is running");
			d.wait();
			System.out.println("main thread going to sleep");
			System.out.println(d.a);
		}
		
	
	
		
	}
	
	
}
class D extends Thread
{
	int a=0;
	public void run()
	{
	synchronized(this)
	{
	for(int i=1;i<=10;i++)
	{
	try {
		a=a+i;
		this.notify();
		
	}
	catch(Exception e) {}
	}
	}
	System.out.println("child running");
	
	}
	
}*/

	

		/*Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(11, "A");
		map.put(12, "B");
		map.put(15,"Z");
		map.put(18,"C");
		map.put(13,"P");
		map.put(19,"B");
		map.put(16,"H");
		map.putIfAbsent(22,"X");
		map.put(11,"K");
		//map.replace(12,"M");
		map.replace(13,"P","O");
		map.put(77,null);
		
		System.out.println(map);
		System.out.println(map.containsValue("C"));
		map.remove(11,"K");
		Map<Integer,String> map1=new LinkedHashMap<Integer,String>();
		map1.put(44,"W");
		map1.put(55,"S");
		map1.put(17,"R");
		map1.putAll(map);
		map1.put(29,"N");
		//map1.merge(key, value, remappingFunction)
		
		
		System.out.println(map.entrySet());
		
		for(Map.Entry<Integer,String> me:map1.entrySet())
		{
			System.out.println(me.getKey()+" --"+me.getValue());
		}
		
		 
	
		

	}
}
class Demo1{
	
	public void check()
	{
	System.out.println("just have a look");
	}
}*/
 
