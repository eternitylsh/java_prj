package arrlist;

public class Test11_01 {
	
	// 타입에 상관없는 add함수 만들어보자.
	// 역시 이렇게 해서는 안된다.. 고로...
//	static Object add( Object n1, Object n2 ) {
//		return n1 + n2;
//	}
	
	// Function to add two elements of various types
    public static <T> T add(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            // If both elements are integers, perform addition
            return (T) Integer.valueOf((Integer) a + (Integer) b);
        } else if (a instanceof Float && b instanceof Float) {
            // If both elements are floats, perform addition
            return (T) Float.valueOf((Float) a + (Float) b);
        } else if (a instanceof Double && b instanceof Double) {
            // If both elements are doubles, perform addition
            return (T) Double.valueOf((Double) a + (Double) b);
        } else if (a instanceof String && b instanceof String) {
            // If both elements are strings, perform concatenation
            return (T) ((String) a + (String) b);
        } else {
            // Handle other types or mismatches as needed
            throw new IllegalArgumentException("Unsupported element types");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d + %d = %d\n", 3, 4, add(3, 4));
		System.out.printf("%f + %f = %f\n", 1.24f, 2.3f, add(1.24f, 2.3f));
		System.out.printf("%f + %f = %f\n", 1.24, 2.3, add(1.24, 2.3));
		System.out.printf("%s + %s = %s\n", "ABC", "EFG", add("ABC", "EFG"));
	}	

}
