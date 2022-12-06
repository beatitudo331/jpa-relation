package com.example.jparelation;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@RequiredArgsConstructor
public class TestRunner implements ApplicationRunner {

    private final ManagerRepository managerRepository;
    private final StudentRepository studentRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
