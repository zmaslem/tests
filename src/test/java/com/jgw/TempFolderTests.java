package com.jgw;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.codec.Encoder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by kdeveloper on 23.01.17.
 */
public class TempFolderTests {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void fileCreatedAndWrittenSuccessfully() throws IOException {
        //plik jest usuwany po skóńczeniu testu bez względu na powodzenie testu
        File file = temporaryFolder.newFile("sample.txt");
        FileUtils.writeStringToFile(file, "JUNIT ROCKS!", "UTF-8");

        String line = FileUtils.readFileToString(file, "UTF-8");
        assertEquals("msg", line, "JUNIT ROCKS!");
    }

    class A {
        int a =  2;

        int compute(){
            return a++;
        }


    }

    @Test
    public void test(){
        A a = new A();
        System.out.println(a.compute());
        System.out.println(a.compute());
    }
}
