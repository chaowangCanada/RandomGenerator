import java.util.Random;

public class RandomString {
	
	  private char[] symbols;
	
	  private final Random random = new Random();
	  private boolean needSpecialChar;
	  private final char[] buf;
	
	  public RandomString(int length, boolean isName) {
	    if (length < 1)
	      throw new IllegalArgumentException("length < 1: " + length);
	    buf = new char[length];
	    needSpecialChar = isName;
		  if(needSpecialChar == true){
			    StringBuilder tmp = new StringBuilder();
			    for (char ch = '0'; ch <= '9'; ++ch)
			      tmp.append(ch);
			    for (char ch = 'a'; ch <= 'z'; ++ch)
			      tmp.append(ch);
			    tmp.append('.');
			    tmp.append(' ');
			    tmp.append(',');
			    symbols = tmp.toString().toCharArray();
		  }
		  else{
			    StringBuilder tmp = new StringBuilder();
			    for (char ch = 'a'; ch <= 'z'; ++ch)
			      tmp.append(ch);
			    tmp.append('.');
			    symbols = tmp.toString().toCharArray();
			  }   
	}

	  public String nextString() {

		for (int idx = 0; idx < buf.length; ++idx) 
		  buf[idx] = symbols[random.nextInt(symbols.length)];
		return new String(buf);
	  }
}