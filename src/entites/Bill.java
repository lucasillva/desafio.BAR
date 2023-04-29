package entites;

public class Bill {

    static final double BEER_PRICE = 5.0;
    static final double SOFT_DRINK_PRICE = 3.0;
    static final double BARBECUE_PRICE = 7.0;
    static final double MAN_TICKET = 10.0;
    static final double WORMAN_TICKET = 8.0;
    static final double FEEDING_MIN = 30.0;
    static final double COVER_PRICE = 4.0;
	
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	
	
	
	
	public double cover(){
	if(feeding() >  FEEDING_MIN ) {
		return 0;
}else 
  return COVER_PRICE;
	}

	public String toString() {
		if(cover() == 0) {
			return "Insento de Cover";
		}else {
			return "Couvert = R$ %.2f%n" + cover();
	}
	}
	
	public double feeding() {
		return  beer * 5.0 + barbecue * 7.0 + softDrink * 3.0;
	}
	
	public  double ticket() {
		if(gender == 'M') {
			gender = (char)MAN_TICKET;
		}else if(gender == 'F') {
			gender = (char)WORMAN_TICKET;
		}
		return gender;
		}
	
	
	public double total() {
		
		return feeding() + ticket() + cover();
	}
	
	
	}
		
		
	
	
	
	
