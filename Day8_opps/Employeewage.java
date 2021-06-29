package wagchk;
public class  Employeewage {
     public static final int  IS_PART_TIME =1 ;
     public static final int  IS_FULL_TIME = 2;
     public static final int  Emp_Rate_Per_Hour = 20;
     public static final int  NUM_OF_WORK_DAYS = 20 ;
     public static final int  MAX_HRS_IN_MONTH = 100 ;
     
     
     
     public static int  empWage( int empRate , int numofDays ,int maxhrs) {
         int totalemphrs = 0;
         int totalEmpwage = 0 , totalworkingdays = 0 ;
         
      
         while (totalemphrs <= maxhrs && totalworkingdays < numofDays   ) {
        	    int emphrs = 0;
                totalworkingdays++; 
                int empcheck = (int) Math.floor(Math.random() * 10) % 3;
                switch ((int)empcheck) {
                   case IS_FULL_TIME:
                      emphrs = 8 ;
                      break;
                   case IS_PART_TIME:
                      emphrs = 4 ;
                      break;
                   default :
                      emphrs = 0 ; 
                }
                
          
          
              totalemphrs += emphrs;    
              System.out.println("Day#: " + totalworkingdays +  "emphrs : " + emphrs);
         }
         int totalempwage = totalemphrs * empRate;
         System.out.println(" Totalemployeewage :"   + totalempwage);
         
 		return totalempwage;
              
             
     
     }
     public static void main(String[] args) {
    	 int totalWage = empWage(100,2,10);
     }
     }
 