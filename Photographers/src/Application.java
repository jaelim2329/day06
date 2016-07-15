import com.picture.*;

public class Application {

	public static void main(String[] args) {
		Photographer[] photographers = {new ParentPhotographer(), new SecurityCamera(), new TrafficCamera()};
		
		for (Photographer p : photographers){
			p.prepareScene();
			System.out.println("Photo is: " + p.takePhotograph());
		}

	}

}
