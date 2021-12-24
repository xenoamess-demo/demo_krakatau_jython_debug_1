package io.xenoamess.krakatau.test.jython;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.xenoamess.krakatau_java_wrapper.util.KrakatauUtil;
import org.junit.jupiter.api.Test;

public class KrakatauJythonTest {

    @Test
    public void test1() throws IOException {
        String inputFilePath1 = new File(new File("").getAbsolutePath() + "/build/classes/java/main/io/xenoamess/krakatau/test/A.class").getAbsolutePath().replaceAll("\\\\", "/");
        String disassembleResult = KrakatauUtil.disassembleFromPath(inputFilePath1);
        System.out.println("disassembleResult : " + disassembleResult);
        byte[] assembleResult = KrakatauUtil.assemble(disassembleResult);
        System.out.println("assembleResult : " + Arrays.toString(assembleResult));
    }

}
