class Project1 extends Thread
{
	public Project1(String str)
	{
		super(str);
	}
	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+ getTime());
			try{
				sleep((int)Math.random()*1000));
			}
			catch(InterruptedExecution e){}
		}
		System.out.println("done!" + getTime());
		
			}
		}
	}
}