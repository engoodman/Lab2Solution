package pokerEnums;

public enum eHandExceptionType {
	ShortHand(1);
	
	private int iHandExceptionType;
	
	private eHandExceptionType(int iHandExceptionType){
		this.iHandExceptionType = iHandExceptionType;
		
	}
	public int getiHandExceptionType(){
		return iHandExceptionType;
	}

}
