package pokerEnums;

public enum eCardNo {

	FirstCard(0), SecondCard(1), ThirdCard(2), FourthCard(3), FifthCard(4), SixthCard(5);
	
	private eCardNo(final int CardNo){
		this.CardNo = CardNo;
	}

	private int CardNo;
	
	public int getCardNo(){
		return CardNo;
	}
	
}
