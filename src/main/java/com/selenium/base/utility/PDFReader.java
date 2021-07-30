package com.selenium.base.utility;

import com.selenium.base.BaseClass;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class PDFReader extends BaseClass {

    public PDDocument document = null;
    public URL url;
    String currentURL;

    public void pdfRead() throws IOException {
        currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        url = new URL(currentURL);

        InputStream is = url.openStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(is);

        document = PDDocument.load(bufferedInputStream);
        String pdfContent = new PDFTextStripper().getText(document);
        System.out.println(pdfContent);
    }
}
