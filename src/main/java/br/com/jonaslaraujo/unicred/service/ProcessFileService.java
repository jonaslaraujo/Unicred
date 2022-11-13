package br.com.jonaslaraujo.unicred.service;

import org.springframework.stereotype.Service;

import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Service
public class ProcessFileService {

    public void processFile(File file)  {
        
        XMLStreamReader reader = new StreamReaderDelegate();
    }
}
