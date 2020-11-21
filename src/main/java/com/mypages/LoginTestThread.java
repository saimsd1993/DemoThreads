package com.mypages;

public class LoginTestThread extends Thread{
	
	public String browsername;
	Loginpage lp;
	Homepage hm;
	public LoginTestThread(String threadname,String browsername)
	{
		super(threadname);
		this.browsername=browsername;
		lp=new Loginpage();
		
	}
	@Override
	public void run()
	{
		System.out.println("thread--started " +Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			lp.setup(this.browsername);
			lp.dologin();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			lp.teardown();
			
		}
		System.out.println("Thread---ended "+Thread.currentThread().getName());
	}

}
