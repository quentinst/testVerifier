package testVerifier;

import java.nio.ByteBuffer;
import java.util.Formatter;

public class Log {

	public static void i(String info) {
		System.out.println(info);
	}
	
	public static void p(byte[] msg) {
        for (int j = 1; j < msg.length+1; j++) {
            if (j % 16 == 1 || j == 0) {
               if( j != 0){
                System.out.println();
               }
               System.out.format("0x%03x\t|\t", j / 16);
            }
            System.out.format("%02X", msg[j-1]);
            //if (j % 4 == 0) 
            {
                System.out.print(" ");
            }
        }
        System.out.println();
	}
	

	
	public static void p(ByteBuffer inbuf) {
        byte[] tmp = new byte[inbuf.limit()];
        System.arraycopy(inbuf.array(), inbuf.arrayOffset(), tmp, 0, inbuf.limit());
        Log.p(tmp);
	}
	
	  /**
	   * Formats Hex view of a byte array<br/>
	   * Example : DebugUtil.prettyHexView(testString.getBytes())<br/>
	   * testString = "Test1234567890"<br/>
	   * output : <pre>00   |   54657374 31323334 
	01  |   35363738 3930</pre>
	   * @param ba the byte array to format
	   * @return String representation "pretty Hex View" of input parameter
	   */
	  public static String prettyHexView(byte[] ba) {
	    StringBuilder sb = new StringBuilder();
	    Formatter formatter = new Formatter(sb);
	    for (int j = 1; j < ba.length+1; j++) {
	      if (j % 8 == 1 || j == 0) {
	        if( j != 0){
	          sb.append("\n");
	        }
	        formatter.format("0%d\t|\t", j / 8);
	      }
	      formatter.format("%02X", ba[j-1]);
	      if (j % 4 == 0) {
	          sb.append(" ");
	      }
	    }
	    sb.append("\n");
	    return sb.toString();
	  }
	
	public static String byteArrayToHex(byte[] a) {
		   StringBuilder sb = new StringBuilder(a.length * 2);
		   for (int i = 0; i < a.length; i ++) {
			   
		   }
		   
		   for(byte b: a)
		      sb.append(String.format("%02x", b & 0xff));
		   return sb.toString();
		}
}
