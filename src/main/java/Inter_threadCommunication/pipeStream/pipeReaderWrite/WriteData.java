package Inter_threadCommunication.pipeStream.pipeReaderWrite;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 21:15
 */
public class WriteData {

    public void writeMethod(PipedWriter out) {
        try {
            System.out.println("write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData);
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
