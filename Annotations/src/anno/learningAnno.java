package anno;
import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

// META Annotation 

@interface cricketPlayer{
	
	String country()default "India";
	int age()default 20;
	
}
@cricketPlayer
class player{
	
	private int experience;
	private String Style;
	
	public int getexperience() {
		return experience;
	}
	public void setexperience(int experience) {
		this.experience = experience;
	}
	public String getStyle() {
		return Style;
	}
	public void setStyle(String style) {
		Style = style;
	}
	
	
}


public class learningAnno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		player virat = new player();
		virat.setexperience(15);
		virat.setStyle("Batsman");
		
		Class<? extends player> c=virat.getClass();
		Annotation a= c.getAnnotation(cricketPlayer.class);
		cricketPlayer cp=(cricketPlayer)a;
		
		System.out.println(cp.age());
		System.out.println(cp.country());

	}

}
