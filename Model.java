package kalkulator;

public class Model {
 public float kalkulacje(long liczba1, long liczba2, String operator ) {
	//deycdujemy co dany opeartor np minus robi, zwraca
	 switch (operator) {
	case "/" :
		if (liczba2 == 0)
			return 0; // jesli liczba druga bedzie rowna zero zwroci nam zero
		return liczba1/liczba2;
	case "*" :
		return liczba1*liczba2;
	case "-" :
		return liczba1-liczba2;
	case "+" :
		return liczba1+liczba2;
		
		default:
			return 0;
			
	}
	 
 }
}
