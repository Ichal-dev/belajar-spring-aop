package com.chaldev.belajarspringaop.service;

import com.chaldev.belajarspringaop.model.Mahasiswa;
import org.springframework.stereotype.Component;

public interface MahasiswaService {

    void create (Mahasiswa mahasiswa) throws Exception;
}
