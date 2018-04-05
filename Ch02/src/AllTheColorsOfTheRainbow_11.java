
public class AllTheColorsOfTheRainbow_11 {

	int anIntegerRepresentingColors;
	
	void changeTheHueOfTheColor(int newHue) {
		
		anIntegerRepresentingColors = newHue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllTheColorsOfTheRainbow_11 a = new AllTheColorsOfTheRainbow_11();
		a.changeTheHueOfTheColor(2);
		System.out.println(a.anIntegerRepresentingColors);
	}

}
