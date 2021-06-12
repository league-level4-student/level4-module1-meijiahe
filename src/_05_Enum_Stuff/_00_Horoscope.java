package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscopes (Zodiac zodiacs) {
		
	switch (zodiacs) {
	case ARIES:{
		JOptionPane.showMessageDialog(null, "horoscopes for Aries");
		break;
	}
	case TAURUS:{
		JOptionPane.showMessageDialog(null, "horoscopes for Taurus");
		break;
	}
	case GEMINI:{
		JOptionPane.showMessageDialog(null, "horoscopes for Gemini");
		break;
	}
	case CANCER:{
		JOptionPane.showMessageDialog(null, "horoscopes for Cancer");
		break;
	}
	case LEO:{
		JOptionPane.showMessageDialog(null, "horoscopes for Leo");
		break;
	}
	case VIRGO:{
		JOptionPane.showMessageDialog(null, "horoscopes for Virgo");
		break;
	}
	case LIBRA:{
		JOptionPane.showMessageDialog(null, "horoscopes for Libra");
		break;
	}
	case SCORPIO:{
		JOptionPane.showMessageDialog(null, "horoscopes for Scorpio");
		break;
	}
	case SAGITTARIUS:{
		JOptionPane.showMessageDialog(null, "horoscopes for Sagittarius");
		break;
	}
	case CAPRICORN:{
		JOptionPane.showMessageDialog(null, "horoscopes for Capricorn");
		break;
	}
	case AQUARIUS:{
		JOptionPane.showMessageDialog(null, "horoscopes for Aquarius");
		break;
	}
	case PISCES:{
		JOptionPane.showMessageDialog(null, "horoscopes for Pisces");
		break;
	}
	
	}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		horoscopes(Zodiac.CANCER);
		horoscopes(Zodiac.AQUARIUS);
	}


}