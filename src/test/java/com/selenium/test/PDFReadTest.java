package com.selenium.test;

import com.selenium.base.BaseClass;
import com.selenium.base.utility.PDFReader;
import org.testng.annotations.Test;

import java.io.IOException;

public class PDFReadTest extends BaseClass {
    PDFReader pdfReader=new PDFReader();
    @Test
    public void pdf_read_test() throws IOException {
        pdfReader.pdfRead();
    }

}
