package ru.chainichek.neoflex.demopushnotification.msanotification;

import org.springframework.boot.SpringApplication;

public class TestMsaNotificationApplication {

    public static void main(String[] args) {
        SpringApplication.from(MsaNotificationApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
