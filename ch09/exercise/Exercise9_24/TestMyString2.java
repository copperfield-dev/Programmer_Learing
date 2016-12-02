public class TestMyString2 {
	public static void main(String[] args) {
		MyString2 s = new MyString2(new char[] {'a', 'b', 'c'});
        System.out.println(s.compare(new MyString2(new char[] {'a', 'd'})));
	    char[] chars1 = MyString2.valueOf(true).toChars();
        for (int i = 0; i < chars1.length; i++) {
            System.out.print(chars1[i]);
        }
        System.out.println();
        char[] chars2 = s.substring(2).toChars();
        for (int i = 0; i < chars2.length; i++) {
            System.out.print(chars2[i]);
        }
	}
}

class MyString2 {
    private char[] chars;

	public MyString2(char[] chars) {
		this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
	}

	public int compare(MyString2 s) {
		char[] temp = s.toChars();
		int len1 = chars.length;
		int len2 = s.length();
		int lim = Math.min(len1, len2);

        int i = 0;
		while (i < lim) {
			char c1 = chars[i];
			char c2 = temp[i];
			if (c1 != c2) {
				return c1 - c2;
			}
			i++;
		}
		return len1 - len2;
	}

	public int length() {
		return chars.length;
	}

	public MyString2 substring(int begin) {
		char[] temp = new char[chars.length - begin];
		for (int i = begin; i < chars.length; i++) {
			temp[i - begin] = chars[i];
		}

		return new MyString2(temp);
	}

	public MyString2 toUpperCase() {
		char[] temp = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
	        temp[i] = Character.toUpperCase(chars[i]);
		}

		return new MyString2(temp);
	}

	public static MyString2 valueOf(boolean b) {
		if (b)
            return new MyString2(new char[]{'t', 'r', 'u', 'e'});
        else
            return new MyString2(new char[]{'f', 'a', 'l', 's', 'e'});
	} 

	public char[] toChars() {
        return chars;
    }
}