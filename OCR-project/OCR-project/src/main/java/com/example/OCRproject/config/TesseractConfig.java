package com.example.OCRproject.config;

import net.sourceforge.tess4j.Tesseract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TesseractConfig {


    @Bean
    Tesseract tesseract() {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("E:\\kafka project\\OCR-project\\OCR-project\\src\\main\\resources\\tessdata"); //files of the example : https://github.com/tesseract-ocr/tessdata  tessdata
        return tesseract;
    }
}
