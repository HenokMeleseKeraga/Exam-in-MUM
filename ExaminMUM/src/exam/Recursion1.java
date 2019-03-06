package exam;

public class Recursion1 {

	public static void main(String[] args) {
		Recursion1.test("Quiz");
	}
   public static void test(String s) {
	   
	   if(s==null||s.equals(""))
		   return;
	   else {
		   test(s.substring(1));
		   System.out.print(s.charAt(0));
	   }
   
	   
   }
}
