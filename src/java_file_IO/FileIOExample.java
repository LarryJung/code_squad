package java_file_IO;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/chaegyunjung/Desktop/out2.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\n";
            fw.write(data);
        }
        fw.close();
        
        FileWriter fw2 = new FileWriter("/Users/chaegyunjung/Desktop/out2.txt", true);
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\n";
            fw2.write(data);
        }
        fw2.close();

    }
}