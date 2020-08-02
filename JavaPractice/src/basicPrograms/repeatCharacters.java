package basicPrograms;

public class repeatCharacters {
    public static void main(String []args){
    String test="5A4B3C";
    
    String printvalue="";
    
    int currentnumber=0;
    
    for(int i=0;i<test.length();i++)
    {
       String atr=Character.toString(test.charAt(i));
       Integer x=null;
       try
       {
       x=Integer.parseInt(atr);
       }
       catch(Exception ex)
       {
             
       }
       if(x!=null)
       { 
             
             if(currentnumber==0)
             {
                   System.out.println(""+printvalue);
             }
             else
             {
                   for(int i1=0;i1<currentnumber;i1++)
                   {
                         
                         System.out.print(""+printvalue);
                   }
                   System.out.println();
             }
             
       currentnumber=x;
       
       printvalue="";
       
       
       }
       else
       {
             printvalue=printvalue+atr;
             
             
             if(i==test.length()-1)
             {
                   for(int i1=0;i1<currentnumber;i1++)
                   {
                         
                         System.out.print(printvalue);
                   }
             }
       }
       
    }
        
        
       
    }

}
