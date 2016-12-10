
public final class utils {
public static void validateID(int Product_ID){
	if (Product_ID == 0){
		throw new IllegalArgumentException("ID can't be empty");
	}
	
}
private utils(){};
}
