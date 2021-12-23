package constructors;

public class Rope {

	public static void swing() {
		System.out.println("swing ");
	}
	public void climb() {	// yada bunu static yapacagiz
		System.out.println("climb ");
	}
	public static void play()
	{
		swing();
		//climb();	bu metot static olmadigi icin buradan cagiramiyoruz
					//ya silece yada bu metodu static yapicaz
		
	}
	
	public static void main(String[] args) {
		
		Rope rope  = new Rope();
		rope.play();
		
		Rope rope2= null;
		rope2.play();
		
		
		
	}

}
