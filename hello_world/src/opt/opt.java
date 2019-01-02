package opt;

public class opt {
	
	public static void main(String[] args)
	{
	int x,y;
	x = 1001;
	y = 11;
	
	intTest(x,y);
	System.out.print(x);
		
	}

	static void dis() {
		    int i = -1;
		    i >>>= 10;
		    System.out.println(i);
		    long l = -1;
		    l >>>= 10;
		    System.out.println(l);
		    short s = -1;
		    s >>>= 10;
		    System.out.println(s);
		    byte b = -1;
		    b >>>= 10;
		    System.out.println(b);
		    
		    i = 1;
		    i >>= 10;
		    System.out.println(i);
		    l = 1;
		    l >>= 10;
		    System.out.println(l);
		    s = -1;
		    s <<= 10;
		    System.out.println(s);
		    b = -1;
		    b >>= 10;
		    System.out.println(b);
		  }
		 ///:~
		// To accept the results of a boolean test:
	 static void f(boolean b) {
	 }
	 static	void boolTest(boolean x, boolean y) {
		 // Arithmetic operators:
		 //! x = x * y;
		 //! x = x / y;
		 //! x = x % y;
		 //! x = x + y;
		 //! x = x - y;
		 //! x++;
		 //! x--;
		 //! x = +y;
		 //! x = -y;
		 // Relational and logical:
		 //! f(x > y);
		 //! f(x >= y);
		 //! f(x < y);
		 //! f(x <= y);
		 f(x == y);
		 f(x != y);
		 f(!y);
		 x = x && y;
		 x = x || y;
		 // Bitwise operators:
		 //! x = ~y;
		 x = x & y;
		 x = x | y;
		 x = x ^ y;
		 //! x = x << 1;
		 //! x = x >> 1;
		 //! x = x >>> 1;
		 // Compound assignment:
		 //! x += y;
		 //! x -= y;
		 //! x *= y;
		 //! x /= y;
		 //! x %= y;
		 //! x <<= 1;
		 //! x >>= 1;
		 //! x >>>= 1;
		 x &= y;
		 x ^= y;
		 x |= y;
		 // Casting:
		 //! char c = (char)x;
		 //! byte B = (byte)x;
		 //! short s = (short)x;
		 //! int i = (int)x;
		 //! long l = (long)x;
		 //! float f = (float)x;
		 //! double d = (double)x;
		}
	 static	void charTest(char x, char y) {
		 // Arithmetic operators:
		 x = (char)(x * y);
		 x = (char)(x / y);
		 x = (char)(x % y);
		 x = (char)(x + y);
		 x = (char)(x - y);
		 x++;
		 x--;
		 x = (char)+y;
		 x = (char)-y;
		 // Relational and logical:
		 f(x > y);
		 f(x >= y);
		 f(x < y);
		 f(x <= y);
		 f(x == y);
		 f(x != y);
		 //! f(!x);
		 //! f(x && y);
		 //! f(x || y);
		 // Bitwise operators:
		 x= (char)~y;
		 x = (char)(x & y);
		 x  = (char)(x | y);
		 x = (char)(x ^ y);
		 x = (char)(x << 1);
		 x = (char)(x >> 1);
		 x = (char)(x >>> 1);
		 // Compound assignment:
		 x += y;
		 x -= y;
		 x *= y;
		 x /= y;
		 x %= y;
		 x <<= 1;
		 x >>= 1;
		 x >>>= 1;
		 x &= y;
		 x ^= y;
		 x |= y;
		 // Casting:
		 //! boolean b = (boolean)x;
		 byte B = (byte)x;
		 short s = (short)x;
		 int i = (int)x;
		 long l = (long)x;
		 float f = (float)x;
		 double d = (double)x;
		}
	 static void byteTest(byte x, byte y) {
		 // Arithmetic operators:
		 x = (byte)(x* y);
		 x = (byte)(x / y);
		 x = (byte)(x % y);
		 x = (byte)(x + y);
		 x = (byte)(x - y);
		 x++;
		 x--;
		 x = (byte)+ y;
		 x = (byte)- y;
		 // Relational and logical:
		 f(x > y);
		 f(x >= y);
		 f(x < y);
		 f(x <= y);
		 f(x == y);
		 f(x != y);
		 //! f(!x);
		 //! f(x && y);
		 //! f(x || y);
		 // Bitwise operators:
		 x = (byte)~y;
		 x = (byte)(x & y);
		 x = (byte)(x | y);
		 x = (byte)(x ^ y);
		 x = (byte)(x << 1);
		 x = (byte)(x >> 1);
		 x = (byte)(x >>> 1);
		 // Compound assignment:
		 x += y;
		 x -= y;
		 x *= y;
		 x /= y;
		 x %= y;
		 x <<= 1;
		 x >>= 1;
		 x >>>= 1;
		 x &= y;
		 x ^= y;
		 x |= y;
		 // Casting:
		 //! boolean b = (boolean)x;
		 char c = (char)x;
		 short s = (short)x;
		 int i = (int)x;
		 long l = (long)x;
		 float f = (float)x;
		 double d = (double)x;
		}
	 static	void shortTest(short x, short y) {
		 // Arithmetic operators:
		 x = (short)(x * y);
		 x = (short)(x / y);
		 x = (short)(x % y);
		 x = (short)(x + y);
		 x = (short)(x - y);
		 x++;
		 x--;
		 x = (short)+y;
		 x = (short)-y;
		 // Relational and logical:
		 f(x > y);
		 f(x >= y);
		 f(x < y);
		 f(x <= y);
		 f(x == y);
		 f(x != y);
		 //! f(!x);
		 //! f(x && y);
		 //! f(x || y);
		 // Bitwise operators:
		 x = (short)~y;
		 x = (short)(x & y);
		 x = (short)(x | y);
		 x = (short)(x ^ y);
		 x = (short)(x << 1);
		 x = (short)(x >> 1);
		 x = (short)(x >>> 1);
		 // Compound assignment:
		 x += y;
		 x -= y;
		 x *= y;
		 x /= y;
		 x %= y;
		 x <<= 1;
		 x >>= 1;
		 x >>>= 1;
		 x &= y;
		 x ^= y;
		 x |= y;
		 // Casting:
		 //! boolean b = (boolean)x;
		 char c = (char)x;
		 byte B = (byte)x;
		 int i = (int)x;
		 long l = (long)x;
		 float f = (float)x;
		 double d = (double)x;
		}
	 static void intTest(int x, int y) {
		 // Arithmetic operators:
		 x = x * y;
		 x = x / y;
		 x = x % y;
		 x = x + y;
		 x = x - y;
		 x++;
		 x--;
		 x = +y;
		 x = -y;
		 // Relational and logical:
		 f(x > y);
		 f(x >= y);
		 f(x < y);
		 f(x <= y);
		 f(x == y);
		 f(x != y);
		 //! f(!x);
		 //! f(x && y);
		 //! f(x || y);
		 // Bitwise operators:
		 x = ~y;
		 x = x & y;
		 x = x | y;
		 x = x ^ y;
		 x = x << 1;
		 x=11;
		 x = x >> 1;
		 x = x >>> 1;
		 // Compound assignment:
		 x += y;
		 x -= y;
		 x *= y;
		 x /= y;
		 x %= y;
		 x <<= 1;
		 x >>= 1;
		 x >>>= 1;
		 x &= y;
		 x ^= y;
		 x |= y;
		 // Casting:
		 //! boolean b = (boolean)x;
		 char c = (char)x;
		 byte B = (byte)x;
		 short s = (short)x;
		 long l = (long)x;
		 float f = (float)x;
		 double d = (double)x;
		}
	 static	void longTest(long x, long y) {
		 // Arithmetic operators:
		 x = x * y;
		 x = x / y;
		 x = x % y;
		 x = x + y;
		 x = x - y;
		 x++;
		 x--;
		 x = +y;
		 x = -y;
		 // Relational and logical:
		 f(x > y);
		 f(x >= y);
		 f(x < y);
		 f(x <= y);
		 f(x == y);
		 f(x != y);
		 //! f(!x);
		 //! f(x && y);
		 //! f(x || y);
		 // Bitwise operators:
		 x = ~y;
		 x = x & y;
		 x = x | y;
		 x = x ^ y;
		 x = x << 1;
		 x = x >> 1;
		 x = x >>> 1;
		 // Compound assignment:
		 x += y;
		 x -= y;
		 x *= y;
		 x /= y;
		 x %= y;
		 x <<= 1;
		 x >>= 1;
		 x >>>= 1;
		 x &= y;
		 x ^= y;
		 x |= y;
		 // Casting:
		 //! boolean b = (boolean)x;
		 char c = (char)x;
		 byte B = (byte)x;
		 short s = (short)x;
		 int i = (int)x;
		 float f = (float)x;
		 double d = (double)x;
		}
	 static	void floatTest(float x, float y) {
		 // Arithmetic operators:
		 x = x * y;
		 x = x / y;
		 x = x % y;
		 x = x + y;
		 x = x - y;
		 x++;
		 x--;
		 x = +y;
		 x = -y;
		 // Relational and logical:
		 f(x > y);
		 f(x >= y);
		 f(x < y);
		 f(x <= y);
		 f(x == y);
		 f(x != y);
		 //! f(!x);
		 //! f(x && y);
		 //! f(x || y);
		 // Bitwise operators:
		 //! x = ~y;
		 //! x = x & y;
		 //! x = x | y;
		 //! x = x ^ y;
		 //! x = x << 1;
		 //! x = x >> 1;
		 //! x = x >>> 1;
		 // Compound assignment:
		 x += y;
		 x -= y;
		 x *= y;
		 x /= y;
		 x %= y;
		 //! x <<= 1;
		 //! x >>= 1;
		 //! x >>>= 1;
		 //! x &= y;
		 //! x ^= y;
		 //! x |= y;
		 // Casting:
		 //! boolean b = (boolean)x;
		 char c = (char)x;
		 byte B = (byte)x;
		 short s = (short)x;
		 int i = (int)x;
		 long l = (long)x;
		 double d = (double)x;
		}
	 static	void doubleTest(double x, double y) {
		 // Arithmetic operators:
		 x = x * y;
		 x = x / y;
		 x = x % y;
		 x = x + y;
		 x = x - y;
		 x++;
		 x--;
		 x = +y;
		 x = -y;
		 // Relational and logical:
		 f(x > y);
		 f(x >= y);
		 f(x < y);
		 f(x <= y);
		 f(x == y);
		 f(x != y);
		 //! f(!x);
		 //! f(x && y);
		 //! f(x || y);
		 // Bitwise operators:
		 //! x = ~y;
		 //! x = x & y;
		 //! x = x | y;
		 //! x = x ^ y;
		 //! x = x << 1;
		 //! x = x >> 1;
		 //! x = x >>> 1;
		 // Compound assignment:
		 x += y;
		 x -= y;
		 x *= y;
		 x /= y;
		 x %= y;
		 //! x <<= 1;
		 //! x >>= 1;
		 //! x >>>= 1;
		 //! x &= y;
		 //! x ^= y;
		 //! x |= y;
		 // Casting:
		 //! boolean b = (boolean)x;
		 char c = (char)x;
		 byte B = (byte)x;
		 short s = (short)x;
		 int i = (int)x;
		 long l = (long)x;
		 float f = (float)x;
		 
		}
} ///:~
