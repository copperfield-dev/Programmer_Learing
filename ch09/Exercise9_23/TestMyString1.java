public class TestMyString1 {
	public static void main(String[] args) {
		MyString1 s = new MyString1(new char[] {'a', 'b', 'c'});
	    System.out.println(s.length());
	    System.out.println(s.charAt(1));
	    System.out.println(s.equals(new MyString1(new char[] {'a', 's', 'c'})));
	    char[] chars = MyString1.valueOf(345).toChars();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
	}
}

class MyString1 {
    private char[] chars;

	public MyString1(char[] chars) {
		this.chars = new char[chars.length];
		System.arraycopy(chars, 0, this.chars, 0, chars.length);
	}

	public char charAt(int index) {
		return chars[index];
	}

	public int length() {
		return chars.length;
	}

	public MyString1 substring(int begin, int end) {
		char[] temp = new char[end - begin];
		for (int i = begin; i < end; i++) {
			temp[i - begin] = chars[i];
		}

		return new MyString1(temp);
	}

	public MyString1 toLowerCase() {
		char[] temp = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
	        temp[i] = Character.toLowerCase(chars[i]);
		}

		return new MyString1(temp);
	}

	public boolean equals(MyString1 s) {
        int n = chars.length;
        char[] temp = s.toChars(); 
		if (n == s.length()) {
			int i = 0;
			while (n-- != 0) {
				if (chars[i] != temp[i])
					return  false;
				i++;
			}
			return true;
		}
		return false;
	} 

	public static MyString1 valueOf(int i) {
		char[] temp = new char[40];
		int size = 0;
		while (i != 0) {
			int number = i % 10;
			i = i / 10;
			temp[size] = (char)(number + '0');
			size++;
		}

		char[] temp2 = new char[size];
		for (int j = size - 1; j >= 0; j--) {
			temp2[j] = temp[size - j - 1];
		}

		return new MyString1(temp2);
	} 

	public char[] toChars() {
        return chars;
    }
}