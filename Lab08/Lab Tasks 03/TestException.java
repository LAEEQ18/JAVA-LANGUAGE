import java.io.File;
import java.io.FileReader;
public class TestException {
public static void main(String arg[]){
try{
File file = new File("D://test.txt");
FileReader fr = new FileReader(file);
}
catch(Exception e){
	System.out.println("The file you have requested cannot found");
}
}
}