package exam;

public class UseAnimlas {

	public static void main(String[] args) {
		Dog d = new Dog(); 
		
		
         Animal a = (Animal)d;
         d.callme();
         a.callme();
         
        ((Dog) a).callme2();

	}

}
