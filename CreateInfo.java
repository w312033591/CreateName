import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateInfo {

    public static void main(String[] args) throws IOException {
        String s;
        CreateName name = new CreateName();
        FileWriter fw = new FileWriter("info.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        for (int i=0;i<100;i++){
            s = name.getInfo();
            System.out.println(s);
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

}
