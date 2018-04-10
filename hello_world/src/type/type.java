package type;


public class type {

	public static void main(String[] args)
	{
		// hello_string
		//hello_string();
        
        // data type 
        //data_type();
		
		// if else for while
		ifelse();
		
	}
	
	private static void ifelse()
	{
		int i, sum;
		sum = 0;
		for(i = 1;i <=10; i++)
		{

			if(i % 2 == 0 )
			{
				sum +=i;
				System.out.print(sum);
				System.out.print(": sum is so large\n");
				
			}
			else
			{
				System.out.print(sum);
				System.out.print(": sum is so small\n");
			}
		}
		while(sum>0)
		{
			prt("sum is not 0");
			sum--;
			if(sum < 10)
			{   
				prt("sum chage 0");
				sum = 0;
				break;
				
			}
			else
				continue;
				
		}
		
	}
	
	private static void data_type()
	{
		prt("data_type");
		
	    byte a = 0;
	    int b = 0 ;
	    short c = 0;
	    long d = 0;
	    
	    System.out.println("c:"+ (c-1));  
	    System.out.println("b:"+ (b-1));
	    System.out.println("a:"+ (a-1));
	    	
	    char e = 'a';
	    float f = 0.1f;
	    double g = 0.1;
	    boolean h = false;
	    System.out.println(e);
	    System.out.println(f);
	    System.out.println(g);
	    System.out.println(h);
	    
	}
	
	private static void hello_string()
	{
		
		String s = "hello world";
		String s2 = "hello world";
		System.out.print(s == s2 );
		
		System.out.print("hello world");
		
		String str = "I like";//---------1--------
		System.out.print(str);

        System.out.println(System.identityHashCode(str));  

        str = str + "java";//--------2---------  
        
        System.out.print(str);
        System.out.println(System.identityHashCode(str)); 
        prt(str);
		
	}
	
	 private static void prt(String s)
	 {
		    System.out.println(s);
	 }

	


}
