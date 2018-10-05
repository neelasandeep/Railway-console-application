

import java.util.*;
import java.lang.*;

class Mistake extends Exception{
	public String getMessage() {try {
		return " heyyyy! you selected invalid option";
	}catch(Exception e) {return e.getMessage();}
	}
}

public class Railway{
	public static String name[]=new String[100];	public static int agee[]=new int[100];           public static String gender[]=new String[100];   public static String phone[]=new String[100];
	public static String status[]=new String[100];     public static int RACAS[]=new int[100];    public static int RACAA[]=new int[100];        public static String seat[]=new String[100]; 
	   public static int Waitas[]=new int[50];            public static int Waitaa[]=new int[50]; static int fare=0;
	static int res=0;static int ress=0;static int pend=0;static int pends=0;String pnr="Sec";static int p=0;
    static int Ac[]=new int[9];static int sleeper[]=new int[9];static int general[]=new int[9];
	String username;  int temp;  static int l=0; static int z;  int k;  static int y=0;  static  int  ind=0; static int g=0;
	static int sum=0; static int avail=Ac.length;  static int avail1=sleeper.length; static int avail2=general.length;
	public int n;  public int f; private int type; static int wait[]=new int[3]; static int wait1[]=new int[3]; static int pending; static int loop;
	static int loop1; static int fareamounta=0; static int fareamounts=0; static int fareamount;
	static int tempp; static int m=1; static int b=0; static int waiting=0; static int wnum=3; static int waiting1=0; static int wnum1=3; 
	
	public static boolean verify(String input) {
		if(input.matches("[a-zA-Z]+")) {
			return true;
		}else {return false;}
		}
	public static boolean verifynumber(String input) {
		if(input.matches("[0-9]+")) {
			return true;
		}else {return false;}
		}
	
	public static void main(String args[])throws Exception{
		System.out.println("WELCOME TO RAILWAY PORTAL");
		System.out.println("*****************************");
		while(true) {
			int selected=0;
		System.out.println("choose your service");
		System.out.println("1.book ticket \n 2.Cancellation\n3.PNR status\n4.Fare\n5.Reserved Ticket Details\n6.exit");
		 Scanner sc = new Scanner(System.in);
		Railway  r=new Railway();
		String option=sc.next(); boolean report;
		report =verifynumber(option); 
		
		if(report==true) {
			selected=Integer.parseInt(option);
		}else {
			throw new Mistake();
		
		}
			
		switch(selected){
			case 1: //System.out.println("WELCOME TO TICKET BOOKING");
			         r.book();
		           break;
			case 2: System.out.println("PROCEED TO CANCEL");
			        System.out.println("enter PNR number");
			        String stat=(String) sc.next();    String stat2[]=stat.split("-");
				     int h1 = Integer.parseInt(stat2[1]);   int h3 = Integer.parseInt(stat2[4]);
				     if(h1==1) { r.status(stat);}else if(h1==2) { r.status(stat);}else if(h1==3) { r.status(stat);}else {System.out.println("please check your PNR number ");}
				     System.out.println("enter ticket number that you want to cancel");
				     int tick=sc.nextInt();
				     status[tick]="cancelled"; seat[tick]="de-allocated";
				      if(h1==1) {fareamounta=0;   fareamounta++; System.out.println(fareamounta);
				    	 if(wnum1>=3) {avail++;}   loop=h3;
				    	 for(int i=1;i<=2;i++) {     int	tickett =RACAA[i];  	System.out.println(tickett);
				    	if(tickett==0) {
				    		System.out.println("problem occured");
				    		break;}else {System.out.println("swapping RAC");
				    	if(i>=2) {
				    		status[tickett]="RAC";
				    		int re= --tickett;System.out.println(tickett);System.out.println(re);
				    		seat[++tickett]="AC"+re;  loop--;
				    	}else if(i==1) {  System.out.println("swapping RAC to confirm");
				    		 System.out.println(tickett);  status[tickett]="confirmed";
				    		seat[tickett]="AC"+tick;  loop--;} }}
				    	 for(int j=1;j<=loop;j++) {  int tickett=Waitaa[j];   pending=tickett;
				    		 if(tickett==0) {System.out.println("problem at AC waiting list");break;}else {System.out.println("swapping AC waiting list");
				    		 if(j>=2) {  status[tickett]="waiting";   seat[tickett]="not allocated";
				    		 }else if(j==1) {   System.out.println("swapping waiting to RAC");
				    			  status[tickett]="RAC";  pending--;
				    			 seat[tickett]="AC"+pending; wnum1++;
				    		 } }}
				     }else if(h1==2) {fareamounts=0;
				     fareamounts++; System.out.println(fareamounts);
				     if(wnum>=3) {	avail1++;}loop1=h3;
				    	 for(int i=1;i<=2;i++) {  int	tickett =RACAS[i];
						    	if(tickett==0) {System.out.println("problem at sleeper rac");break;}else {System.out.println("swapping slepper rac");
						    	if(i>=2) {   status[tickett]="RAC";   int re= --tickett;   seat[++tickett]="S"+re; 	loop1--;
						    	}else if(i==1) {
						    		System.out.println("swapping sleeper rac to confirm");
						    		 pending=tickett;  status[tickett]="confirmed";  seat[tickett]="S"+tick;  loop1--;
						    	} }}
						    	 for(int j=1;j<=loop1;j++) {  int tickett=Waitas[j];
						    		 if(tickett==0) {System.out.println(" waiting list is empty");break;}else {System.out.println("swapping slepper wait list");
						    		 if(j>=2) { status[tickett]="waiting";   seat[tickett]="not allocated";
						    			  }else if(j==1) {System.out.println("swapping slepper waiting to pending");
						    			 status[tickett]="RAC";  seat[tickett]="S"+pending;  wnum++;
						    		 }}}  }else {   System.out.println("no such booking exists");  }
				     System.out.println("your cancellation sucessfully completed");   break;
			case 3: System.out.println("YOUR PNR STATUS ");
			 String sta=(String) sc.next();   String stat1[]=sta.split("-");
		     int h = Integer.parseInt(stat1[1]);
		     if(h==1) { r.status(sta);}else if(h==2) { r.status(sta);}else if(h==3) { r.status(sta);}else {System.out.println("please check your PNR number ");}  break;
			case 4: System.out.println("fare amount details");
			         r.fare();  break;           
			case 5: System.out.println("RESERVED TICKET INFORMATION");
			          r.seats();   break;
			case 6:    System.exit(0);
            default : System.out.println("choose valid option");
			           break;
			}}}
	 void book() throws Exception {
		 int selected = 0;
		 System.out.println("WELCOME TO BOOKINGS");
			Scanner sc = new Scanner(System.in);
			System.out.println("which type of booking you want");
			System.out.println("1.AC/n 2.sleeper/n3.general");
			String option=sc.next(); boolean report;
			report =verifynumber(option); 
			
			if(report==true) {
				selected=Integer.parseInt(option);
			}else {
				try {
					throw new Mistake();
				} catch (Mistake e) {
					
					System.out.println(e.getMessage());
				}
				
			}
			
			switch(selected) {
			case 1:    if(avail>2) {
				       System.out.println("Available seats in A/c coach are"+avail+"  and "+wnum1+" waiting tickets"); int l=01;
						Railway r=new Railway();  avail=r.booking(avail,l);
			             }else if(avail<=2 && avail>0) {
			            	 System.out.println("reservation tickets completed!  you have 2 RAC tickets and 3 waiting tickets  ");
			            	 System.out.println(" to continue   enter  1 \n ");
			            	 int select=sc.nextInt();	if(select!=1) {break;}else {
			            		 Railway r=new Railway();
			            		 System.out.println("enter how many tickets you want to book");
			            		 Scanner scs = new Scanner(System.in); int num=scs.nextInt();
			        			 if(num>2) {System.out.println("you selected more than 2 tickets they will be added to waiting list");}
			        			 int o=avail+wait.length;     if(num>avail+wait.length) {System.out.println("only"+o+"available");}else {
			            		 avail=r.rac(avail,num,ind,1,1);}
			        			 System.out.println(pnr+"-"+1+"-"+ind+"-"+z+"-"+num+"-"+p);
			        			 ind=z;
			            		 }  }else if(avail<=0) {
		       				 if(waiting1<3) {  System.out.println("you can book only"+wnum1+" waiting tickets ");
		    					 System.out.println(" to continue   enter  1  ");
		    					 int select=sc.nextInt();  if(select!=1) {break;}else {
		    					 System.out.println("enter how many you want to book");
		    					int wn= sc.nextInt();    if(wn>wnum1) {System.out.println("please select valid number of tickets");   break;
		    					}else { int per=1;String namee; String age;  String phn[]=new String[100];
		    						for(int i=ind+1;i<=ind+wn;i++) {pend++;
		    						 System.out.println("enter "+per+ "person details"); 
		    						 for( k=0;k<1;) {	  System.out.println("enter username");     namee=sc.next(); report=verify(namee);
		    							if(report==true) { name[m]=namee; k++;   Waitaa[pend]=m;} else { System.out.println("enter a valid name"); k=0;}}
		    							for( k=0;k<1;) {	  System.out.println("enter age");        age=sc.next(); report=verifynumber(age);
		    							if(report==true) {int agei=Integer.parseInt(age); agee[m]=agei; k++; }else{System.out.println("age must be a numeric"); k=0;}}	
		    							for(k=0;k<1;) {	System.out.println("enter gender(male/female)"); namee=sc.next(); report=verify(namee); 
		    							if(report==true) { gender[m]=namee; k++;}else {System.out.println("enter a valid gender"); k=0;} }
		    							for( k=0;k<1;) {	  System.out.println("ph.no");			phn[1]=sc.next();	report=verifynumber(phn[1]);
		    							if(report==true) {phone[m]=phn[1];k++;}else{System.out.println("enter a valid number");k=0;}status[i]="waiting";seat[i]="not allowcated";}
		    							pend++;
		    						z++;sum++; per++;
		    						System.out.println(name[i]+"added to waiting list"); }
		    					 waiting1=wn;   wnum1=wnum1-wn;   }
		    					System.out.println("your pnr num is"); 	p++;
		           				 System.out.println(pnr+"-"+1+"-"+ind+"-"+z+"-"+waiting1+"-"+p);   ind=z;	
		    					} } }
			             else {System.out.println("no tickets available now ");}   break;
		    case 2:	     if(avail1>2) {
		    	          System.out.println("Available seats in Sleeper coach are"+avail1+"  and "+wnum+" waiting tickets");
			              int l1=02;
			              Railway r1=new Railway();    avail1=r1.booking(avail1,l1);
		                 }else if(avail1<=2 && avail1>0) {
			            	 System.out.println("reservation tickets completed! you have 2 RAC tickets and 3 waiting tickets  ");
			            	 System.out.println(" to continue   enter  1 ");
				            	int select=sc.nextInt();  if(select!=1) {break;}else {	 Railway r=new Railway();
		            		 System.out.println("enter how many tickets you want to book");
		            		 Scanner scs = new Scanner(System.in);	 int num=scs.nextInt();
		        			 int o=avail1+wait1.length;
		        			 if(num>2) {System.out.println("you selected more than 2 tickets they will be added to waiting list");}
		        			 if(num>avail1+wait1.length) {System.out.println("only"+o+"available");}else {
		            		 avail1=r.rac(avail1,num,ind,2,1);}
		        			 System.out.println(pnr+"-"+2+"-"+ind+"-"+z+"-"+num+"-"+p);   ind=z;
		            		 }  }else if(avail1<=0) {
       				 if(waiting<3) {    System.out.println("you can book only"+wnum+" waiting tickets  ");
    					 System.out.println(" to continue   enter  1  ");
    					 int select=sc.nextInt(); 	if(select!=1) {   break;}else {
    					 System.out.println("enter how many you want to book");
    					int wn= sc.nextInt();  if(wn>wnum) {System.out.println("please select valid number of tickets");	break;
    					}else { int per=1; String namee; String age;  String phn[]=new String[100];
    						for(int i=ind+1;i<=ind+wn;i++) {pends++;
       					 System.out.println("enter "+per+ "person details");  System.out.println("enter username");
       					 for( k=0;k<1;) {	  System.out.println("enter username");     namee=sc.next(); report=verify(namee);
							if(report==true) { name[m]=namee; k++;   Waitas[pend]=m;} else { System.out.println("enter a valid name"); k=0;}}
							for( k=0;k<1;) {	  System.out.println("enter age");        age=sc.next(); report=verifynumber(age);
							if(report==true) {int agei=Integer.parseInt(age); agee[m]=agei; k++; }else{System.out.println("age must be a numeric"); k=0;}}	
							for(k=0;k<1;) {	System.out.println("enter gender(male/female)"); namee=sc.next(); report=verify(namee); 
							if(report==true) { gender[m]=namee; k++;}else {System.out.println("enter a valid gender"); k=0;} }
							for( k=0;k<1;) {	  System.out.println("ph.no");			phn[1]=sc.next();	report=verifynumber(phn[1]);
							if(report==true) {phone[m]=phn[1];k++;}else{System.out.println("enter a valid number");k=0;}status[i]="waiting";seat[i]="not allowcated";}
							 z++;pends++;sum++; per++; 	System.out.println(name[i]+"added to waiting list");
    							} 
    					 waiting=wn;   wnum=wnum-wn; }
    					System.out.println("your pnr num is"); p++;
           				 System.out.println(pnr+"-"+2+"-"+ind+"-"+z+"-"+waiting+"-"+p);  ind=z;	  }}
       			       }else {System.out.println("no tickits available now");}    break;
			case 3:	      if(avail2>0) {   System.out.println("Available seats in General coach are"+avail2);
			              int l2=03;  Railway r2=new Railway();   avail2=r2.general(avail2,l2);}else {  System.out.println("no tickets avaible"); }     break;	   
		}}
	  public int booking(int t,int u) throws Exception{  int book=t-2;
		 System.out.println("you have  "+book+" reservation tickets and "+2+" RAC tickets and"+3+"waiting tickets ");
		 System.out.println(" to continue   enter  1 \n ");
		 Scanner sc = new Scanner(System.in); 
		 int select=0;
		 String option=sc.next(); boolean report;
		 report=verifynumber(option);
		 if(report==true) {
		  select=Integer.parseInt(option);}else {try {	throw new Mistake();}catch(Mistake m) {m.getMessage();} }
		  if(select!=1) {   return t;}else { 	System.out.println("enter how many tickets you want to book");
			 temp=t;  int max;   max=sc.nextInt();  tempp=max;  	sum=sum+max;
		if(max>t-2 && max<=t) { System.out.println(+max-t+" tickets will be added to RAC list");}
		if(max>t && max<t+3) {System.out.println("you are having only "+t+" tickets but you selected"+max+"tickets"
				+ " so after "+t+"tickects remaining will be added to waiting list" );}
		    if( max>t+3) {
		    	System.out.println("sorry "+max+" tickets not available please book avilable tickets only");
		    Scanner sc4=new Scanner(System.in);
		    System.out.println("Do you want to book available number of tickets? (y/n)");
		   String v =sc4.next();
		    } else {   int m=ind+1;
		   int per=1; String namee; String age;  String phn[]=new String[100]; 
		   for(; m<=sum;m++) {    System.out.println("enter "+per+"  person details ac"); 
			for( k=0;k<1;) {	  System.out.println("enter username");     namee=sc.next(); report=verify(namee);
			if(report==true) { name[m]=namee; k++;}else { System.out.println("enter a valid name"); k=0;}}
			for( k=0;k<1;) {	  System.out.println("enter age");        age=sc.next(); report=verifynumber(age);
			if(report==true) {int agei=Integer.parseInt(age); agee[m]=agei; k++; }else{System.out.println("age must be a numeric"); k=0;}}	
			for(k=0;k<1;) {	System.out.println("enter gender(male/female)"); namee=sc.next(); report=verify(namee); 
			if(report==true) { gender[m]=namee; k++;}else {System.out.println("enter a valid gender"); k=0;} }
			for( k=0;k<1;) {	  System.out.println("ph.no");			phn[1]=sc.next();	report=verifynumber(phn[1]);
			if(report==true) {phone[m]=phn[1];k++;}else{System.out.println("enter a valid number");k=0;}}	
			System.out.println("booking for "+name[m]+"  succesfully completed");
			b++; t--; tempp--; z++;  per++;   if(tempp==0) {break;}
			if(t<=2){	Railway r=new Railway();  t=	r.rac(t,tempp,m,u,per);   p++;
		    System.out.println(pnr+"-"+u+"-"+ind+"-"+z+"-"+max+"-"+p);
		    ind=z;  break;}  	 }sum++;
			}
		    if(t>0) {
		   if(max>temp+3) {
			   String y="y";
		   }else {
		   if(t>2 ||tempp==0) {
			System.out.println(" your booking succesfully completed ");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("TNO      |"+"NAME        | "+" AGE        |" + " gender        |"+"phonenumber       | "+"status"+"     seat no      |");
			System.out.println("-------------------------------------------------------------------------");
			for( int r=ind+1;r<=max+ind;r++) {
					status[r]="confirmed";
					if(u==1) { seat[r]="AC"+r;}else if(u==2) { seat[r]="S"+r;}
					System.out.println(r+"      |"+name[r]+"         |"+agee[r]+"        | "+gender[r]+"         |"+phone[r]+"|       "+status[r]+"|   "+seat[r]);
					System.out.println("----------------------------------------------------------------------------");
				} 
				System.out.println("Your PNR number is");	temp=ind;   p++;
				 System.out.println(pnr+"-"+u+"-"+ind+"-"+z+"-"+max+"-"+p);	Railway.ind=z; return t;  }else {
			   System.out.println("Your PNR number is");	temp=ind;  p++;
				 System.out.println(pnr+"-"+u+"-"+ind+"-"+z+"-"+max+"-"+p); Railway.ind=z;
				 } }} }return t;}
	    public int general(int t, int u) {
		   System.out.println("you can book  "+t+" no of tickets");
			System.out.println("enter how many tickets you want to book");
			 Scanner sc = new Scanner(System.in);
			 temp=t; int max1;   max1=sc.nextInt(); int ty=1;
			m=max1+1; int per=1;
			String namee; String age;  String phn[]=new String[100]; boolean report; 
		  while(ty<=max1) {
			  System.out.println("enter general "+per+ "person details");
			  
			      
				for( k=0;k<1;) {	  System.out.println("enter username");     namee=sc.next(); report=verify(namee);
				if(report==true) { name[m]=namee; k++;}else { System.out.println("enter a valid name"); k=0;}}
				for( k=0;k<1;) {	  System.out.println("enter age");        age=sc.next(); report=verifynumber(age);
				if(report==true) {int agei=Integer.parseInt(age); agee[m]=agei; k++; }else{System.out.println("age must be a numeric"); k=0;}}	
				for(k=0;k<1;) {	System.out.println("enter gender(male/female)"); namee=sc.next(); report=verify(namee); 
				if(report==true) { gender[m]=namee; k++;}else {System.out.println("enter a valid gender"); k=0;} }
				for( k=0;k<1;) {	  System.out.println("ph.no");			phn[1]=sc.next();	report=verifynumber(phn[1]);
				if(report==true) {phone[m]=phn[1];k++;}else{System.out.println("enter a valid number");k=0;}}
			  t--;  m++;   z++;  ty++; per++;
			 }
		   System.out.println("your pnr number is");
	      System.out.println(pnr+"-"+u+"-"+ind+"-"+z+"-"+max1+"-"+p);
	      ind=z;  return t;}
	    
	     public int rac(int rc,int num,int y,int u, int per) throws Exception{
		     int s=y-1;   	Scanner sc=new Scanner(System.in);
				int vb=num;  int rac[]=new int[rc];     int i=0; int hamla=0;
			int k=y;   int m=y+1;
			System.out.println("reservation tickets hasbeen completed now first 2 will be added to RAC");
			String namee; String age;  String phn[]=new String[100]; boolean report; 
			 while(i<rac.length) {         
				 
				 System.out.println("enter "+per+ "person details");
				 if(u==1) { res++;}   if(u==2) {ress++;}
				 for( k=0;k<1;) {	  System.out.println("enter username");     namee=sc.next(); report=verify(namee);
					if(report==true) { name[m]=namee; k++; if(u==1) {   RACAA[res]=m;}else if(u==2) {  RACAS[ress]=m;}}else { System.out.println("enter a valid name"); k=0;} }
					for( k=0;k<1;) {	  System.out.println("enter age");        age=sc.next(); report=verifynumber(age);
					if(report==true) {int agei=Integer.parseInt(age); agee[m]=agei; k++; }else{System.out.println("age must be a numeric"); k=0;}}	
					for(k=0;k<1;) {	System.out.println("enter gender(male/female)"); namee=sc.next(); report=verify(namee); 
					if(report==true) { gender[m]=namee; k++;}else {System.out.println("enter a valid gender"); k=0;} }
					for( k=0;k<1;) {	  System.out.println("ph.no");			phn[1]=sc.next();	report=verifynumber(phn[1]);
					if(report==true) {phone[m]=phn[1];k++;}else{System.out.println("enter a valid number");k=0;}}
					System.out.println("booking for "+name[m]+"  succesfully completed");
					i++; m++; z++; sum++;  num--; rc--; per++;}
					tempp--;    s++; 
			 System.out.println("-------------------------------------------------------------------------");
				System.out.println("TNO    "+"NAME        | "+" AGE        |" + " gender        |"+"phonenumber       | "+"status     |"+"seat no  |");
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(ind+1);  
					for( int r=ind+1;r<=rac.length+y;r++) {
						if(r<=s) {status[r]="confirmed";
							if(u==1) { seat[r]="AC"+r;}else if(u==2) { seat[r]="S"+r;}
							System.out.println(r+"     |"+name[r]+"         |"+agee[r]+"        | "+gender[r]+"         |"+phone[r]+"|    "+status[r]+" "  +seat[r]);
							System.out.println("----------------------------------------------------------------------------");
						}else {	status[r]="RAC";
						if(u==1) { seat[r]="AC"+r;}else if(u==2) { seat[r]="S"+r;}
						System.out.println(r+"     |"+name[r]+"         |"+agee[r]+"        | "+gender[r]+"         |"+phone[r]+"|    "+status[r]+"      "+seat[r]);
						System.out.println("----------------------------------------------------------------------------");
						}}
						 if(vb==1) {   System.out.println("Your PNR number is");  temp=ind; 		p++;
							           System.out.println(pnr+"-"+u+"-"+ind+"-"+z+"-"+vb+"-"+p); ind=z;}
			if(num<0) {if(vb==2) {     System.out.println("Your PNR number is");  temp=ind; 	p++;
			 System.out.println(pnr+"-"+u+"-"+ind+"-"+z+"-"+vb+"-"+p); ind=z;}}
			 if(num>0) {    System.out.println("RAC tickets hasbeen completed now remaininig will be added to waiting list");
			 System.out.println("if you want to continue enter (1) else enter (0)");
				String h=sc.next(); 	report =verifynumber(h); 
				
				if(report==true) {
					g=Integer.parseInt(h);
				}else {
					try {
						throw new Mistake();
					} catch (Mistake e) {
						
						System.out.println(e.getMessage());
					}
					
				}  if(g==1){ System.out.println(num);
			 while(num>0) {    System.out.println("enter "+per+ "person details");
			 
				 if(u==1) { pend++; wnum1--;}	 if(u==2) {pends++; wnum--;}
				 for( k=0;k<1;) {	  System.out.println("enter username");     namee=sc.next(); report=verify(namee);
					if(report==true) { name[m]=namee; k++; if(u==1) {  Waitaa[pend]=m;   }else if(u==2) {  Waitas[pends]=m;}}else { System.out.println("enter a valid name"); k=0;}}
					for( k=0;k<1;) {	  System.out.println("enter age");        age=sc.next(); report=verifynumber(age);
					if(report==true) {int agei=Integer.parseInt(age); agee[m]=agei; k++; }else{System.out.println("age must be a numeric"); k=0;}}	
					for(k=0;k<1;) {	System.out.println("enter gender(male/female)"); namee=sc.next(); report=verify(namee); 
					if(report==true) { gender[m]=namee; k++;}else {System.out.println("enter a valid gender"); k=0;} }
					for( k=0;k<1;) {	  System.out.println("ph.no");			phn[1]=sc.next();	report=verifynumber(phn[1]);
					if(report==true) {phone[m]=phn[1];k++;}else{System.out.println("enter a valid number");k=0;}}	z++;m++;sum++; per++;
				System.out.println("added to waiting list"); num--;hamla++;  }
			 if(hamla>0) {     System.out.println("Your PNR number is");  p++;  
			            System.out.println("-------------------------------------------------------------------------");
						System.out.println("TNO        | "+"NAME        | "+" AGE        |" + " gender        |"+"phonenumber       | "+"status|      "+"seat no");
						System.out.println("-------------------------------------------------------------------------");
						 int dou=z-2; 
							for( int r=dou;r<dou+hamla;r++) { 
							status[r]="waiting";  seat[r]="not allowcated";
								System.out.println(r+"         |"+name[r]+"         |"+agee[r]+"        | "+gender[r]+"         |"+phone[r]+"      | "+status[r]+""+seat[r]);
								System.out.println("----------------------------------------------------------------------------");
								}  }}else {return 0;} }else {
					String k1="y";}
				 return rc;   }
	  public void status(String sta) {
		   String stat[]=sta.split("-");
		      System.out.println("Your Status Report is->");
		      type=Integer.parseInt(stat[1]);   n = Integer.parseInt(stat[2]);    f = Integer.parseInt(stat[3]);
		    if(type==1) {	String train="AC coach";  }else if(type==2){	String train="sleeper coach";
		    }else if(type==3) {  String train="general";  }else { System.out.println("No such booking exist");}
		      System.out.println("-------------------------------------------------------------------------");
				System.out.println("TNO        | "+"NAME        | "+" AGE        |" + " gender        |"+"phonenumber       | "+"status          |"+"seat no  ");
				System.out.println("-------------------------------------------------------------------------");
					for( int r=n+1;r<=f;r++) {
						System.out.println(r+"         |"+name[r]+"         |"+agee[r]+"        | "+gender[r]+"         |"+phone[r]+"      |"+status[r]+  "        |"+seat[r]);
						System.out.println("----------------------------------------------------------------------------");
					}}
	   public void fare() {
		  System.out.println("YOUR PNR STATUS ");
		  Scanner sc3=new Scanner(System.in);
			 String amt=(String) sc3.next();
			 String amount[]=amt.split("-");
			 int trn=Integer.parseInt(amount[1]);  int nper=Integer.parseInt(amount[4]);
			 	 if(trn==1) {  int fareamount=nper*1000;
			if(fareamounta==1) {  fareamount=fareamount-500;	}
			System.out.println("your total fare amount of PNR number  "+amt+" is "+fareamount);     }
			  else if(trn==2) { fareamount=nper*800;    if(fareamounts==1) {   fareamount=fareamount-400; 	}
			 System.out.println("your total fare amount of PNR number  "+amt+" is "+fareamount);    }
			  else if(trn==3) {System.out.println("your total fare amount of PNR number "+amt+" is "+nper*500);}
			 else {System.out.println("PNR number that you have entered is wrong please check your PNR number weather "+amt+" or not?");}
			  }
	  public void seats() {
		  System.out.println("YOUR PNR STATUS ");
		  Scanner sc4=new Scanner(System.in);
			 String amt=(String) sc4.next();
			 String info[]=amt.split("-");
			 int trn=Integer.parseInt(info[1]);   int nper=Integer.parseInt(info[4]);	 int trn1=Integer.parseInt(info[2]);
				 if(trn==1) {   while(l<nper) {  System.out.println("your seat numbers allocated are "+seat[trn1]);  l++; trn1++;   } }
			 else if(trn==2) {   while(l<nper) {  System.out.println("your seat numbers allocated are "+seat[trn1]);  l++; trn1++;	 } }
			 else if(trn==3) {	 	 while(l<nper) {  System.out.println("your seat numbers allocated are GE"+trn1); l++;  trn1++;	 } }
			 else {System.out.println("PNR number that you have entered is wrong please check your PNR number weather "+amt+" or not?");}
	  }
	 
		
	
}
	