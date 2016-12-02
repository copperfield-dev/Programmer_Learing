public class TestMyStringBuilder {
	public static void main(String[] args) {
	    MyStringBuilder s1 =
            new MyStringBuilder(new char[]{'a', 'b', 'c', 'd', 'p'});
        MyStringBuilder s2 = new MyStringBuilder("xyz");	
        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        
        s2.append(123456789);
        System.out.println(s2.toString());
        System.out.println(s1.substring(1, 4));

        s1.reverse();
        System.out.println(s1.toString());
        System.out.println(s1.toUpperCase().toString());
        System.out.println(s1.toLowerCase().toString());
        s2.insert(3, new MyStringBuilder("abcde"));
        System.out.println(s2.toString());
	}
}

class MyStringBuilder {
	private int size = 0;
    private int capacity = 0;
    private char[] buffer;

    public MyStringBuilder() {
    }

    public MyStringBuilder(String s) {
    	capacity = size = s.length();
        buffer = new char[capacity];

        for (int i = 0; i < s.length(); i++) {
        	buffer[i] = s.charAt(i);
        }
    }

    public MyStringBuilder(char[] chars) {
    	capacity = size = chars.length;
    	buffer = new char[chars.length];
        System.arraycopy(chars, 0, buffer, 0, chars.length);
    }

    public int length() {
    	return size;
    }

    public char charAt(int index) {
    	return buffer[index];
    }

    public MyStringBuilder toLowerCase() {
        for (int i = 0; i < size; i++) {
        	buffer[i] = Character.toLowerCase(buffer[i]);
        }

        return this;
    }

    public MyStringBuilder toUpperCase() {
        for (int i = 0; i < size; i++) {
        	buffer[i] = Character.toUpperCase(buffer[i]);
        }

        return this;
    }

    public MyStringBuilder append(MyStringBuilder s) {
        if (capacity < size + s.length()) {
        	char[] temp = new char[size + s.length()];
        	System.arraycopy(buffer, 0, temp, 0, size);
        	capacity = size + s.length();
        	buffer = temp;
        }

        for (int i = 0; i < s.length(); i++) {
        	buffer[i + size] = s.charAt(i);
        }
        size += s.length();

        return this;
    }

    public MyStringBuilder append(int i) {
        return append(new MyStringBuilder(String.valueOf(i)));
    }

    public MyStringBuilder substring(int begin, int end) {
        char[] temp = new char[end - begin];
        for (int i = begin; i < end; i++) {
        	temp[i - begin] = buffer[i];
        }

        return new MyStringBuilder(temp);
    }

    public MyStringBuilder substring(int begin) {
        char[] temp = new char[buffer.length - begin];
        for (int i = begin; i < buffer.length; i++) {
        	temp[i - begin] = buffer[i];
        }

        return new MyStringBuilder(temp);
    }

    public MyStringBuilder insert(int offset, MyStringBuilder s) {
        if (capacity < size + s.length()) {
        	char[] temp = new char[size + s.length()];
        	System.arraycopy(buffer, 0, temp, 0, offset);
        	System.arraycopy(buffer, offset, temp, offset + s.length(), size - offset);
        	capacity = size + s.length();
        	buffer = temp;
        }

        for (int i = 0; i < s.length(); i++) {
        	buffer[i + offset] = s.charAt(i);
        }
        size += s.length();

        return this;
    }

    public MyStringBuilder reverse() {
        for (int i = 0; i < size / 2; i++) {
        	char temp = buffer[i];
        	buffer[i] = buffer[size - 1 - i];
        	buffer[size - 1 - i] = temp;
        }

        return this;
    }

    public String toString() {
    	char[] temp = new char[size];
    	for (int i = 0; i < size; i++) {
    		temp[i] = buffer[i];
    	}

    	return new String(temp);
    }
}