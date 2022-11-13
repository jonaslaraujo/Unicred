package br.com.jonaslaraujo.unicred.schedule;

import br.com.jonaslaraujo.unicred.service.ProcessFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.InputStream;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class SearchFileSchedule {
    private final ProcessFileService service;
    private final String path = ""; //Apenas para fins de projeto, estou assumindo que o arquivo terá sempre o mesmo nome.

    @Scheduled(cron = "0 0/1 * * * *")
    public void runSchedule(){
        var localFile = new File(path);
        if (localFile.exists()) {
            service.processFile(localFile);
        }
    }
}
