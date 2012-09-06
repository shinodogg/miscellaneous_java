import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTraceUtility {
  public static String getStackTraceStr(Exception e) {
    StringWriter stringWriter = new StringWriter();
    PrintWriter printWriter = new PrintWriter(stringWriter);
    e.printStackTrace(printWriter);
    return stringWriter.toString();
  }
}
