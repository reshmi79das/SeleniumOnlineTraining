package webDriverConcepts;

public class stringExm {

	public static void main(String[] args) {

		String st="I live in toronto";
		int lengthSize=st.length();
		System.out.println("Length of the string is : "+lengthSize);
		/*System.out.println(st.substring(2));
		System.out.println(st.substring(2, 6));
		System.out.println(st.substring(0, 17));*/
		
		if (st.contains("live")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("F");
		}
	}

}
