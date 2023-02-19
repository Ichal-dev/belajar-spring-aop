package com.chaldev.belajarspringaop.service;

import com.chaldev.belajarspringaop.model.Mahasiswa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MahasiswaServiceImpl implements MahasiswaService{
    @Override
    public void create(Mahasiswa mahasiswa) throws Exception {
        log.info("Do Process Save Data Mahasiswa" );
    }
}
