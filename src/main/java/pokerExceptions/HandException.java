package pokerExceptions;
import pokerBase.Hand;
import pokerEnums.eHandExceptionType;

public class HandException extends Exception {
	private Hand h;
	private eHandExceptionType e;
	
	public HandException(Hand h,eHandExceptionType e){
		this.h = h;
		this.e = e;
	}

	public Hand getH() {
		return h;
	}

	public eHandExceptionType getE() {
		return e;
	}

}
