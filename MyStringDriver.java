import java.util.*;
class MyStringDriver{
	public static void main(String[] args) {
        char[] arr = new char[26];
        for (char ch = 'a'; ch <= 'z'; ch++) {
            arr[ch - 'a'] = ch;
        }

        MyString s1 = new MyString(arr);                    // full array
        MyString s2 = new MyString(arr, 0, 5);              // first 5 chars
        MyString s3 = new MyString("Hello World!");         // from String
        MyString s4 = new MyString(new StringBuffer("Buffer"));
        MyString s5 = new MyString(new StringBuilder("Builder"));

        System.out.println("Full:    " + s1);
        System.out.println("Subset:  " + s2);
        System.out.println("String:  " + s3);
        System.out.println("Buffer:  " + s4);
        System.out.println("Builder: " + s5);
    }

	
}

class MyStringIndexOutOfBoundException extends RuntimeException {
    public MyStringIndexOutOfBoundException(String message) {
        super(message);
    }
}

final class MyString {
    char[] arr;

    public MyString() {
        arr = new char[0];
    }

    public MyString(String str) {
        arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i);
    }

    public MyString(StringBuffer sb) {
        this(sb.toString());
    }

    public MyString(StringBuilder sb) {
        this(sb.toString());
    }

    public MyString(char[] arr) {
        this.arr = new char[arr.length];
        for (int i = 0; i < arr.length; i++)
            this.arr[i] = arr[i];
    }

    public MyString(char[] arr, int start, int count) {
        if ((start + count) > arr.length)
            throw new MyStringIndexOutOfBoundException("INVALID [" + start + "," + (start + count) + "] out of bound for length " + arr.length);
        this.arr = new char[count];
        for (int i = 0; i < count; i++) {
            this.arr[i] = arr[start + i];
        }
    }

    @Override
    public String toString() {
        return new String(arr);
    }
}

