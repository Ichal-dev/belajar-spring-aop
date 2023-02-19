package com.chaldev.belajarspringaop;

import com.chaldev.belajarspringaop.aspect.MahasiswaCrudAspect;
import com.chaldev.belajarspringaop.model.Mahasiswa;
import com.chaldev.belajarspringaop.service.MahasiswaService;
import com.chaldev.belajarspringaop.service.MahasiswaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

public class MahasiswaAspectTest {

    @Configuration
    @EnableAspectJAutoProxy
    @Import({
            MahasiswaCrudAspect.class,
            MahasiswaServiceImpl.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;


    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testMahasiswa() throws Exception {
        MahasiswaService mahasiswaService = applicationContext.getBean(MahasiswaService.class);
        Mahasiswa mahasiswa  = new Mahasiswa();
        mahasiswa.setName("Faisal");
        mahasiswa.setAge(20);
        mahasiswa.setNim("777800383737");

        mahasiswaService.create(mahasiswa);

    }
}
