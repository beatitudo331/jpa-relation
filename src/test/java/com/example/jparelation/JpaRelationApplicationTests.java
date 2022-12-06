package com.example.jparelation;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
class JpaRelationApplicationTests {


    @Resource
    ManagerRepository managerRepository;
    @Resource
    StudentRepository studentRepository;

    @BeforeEach
    public void init() {
        managerRepository.saveAndFlush(new Manager("고승유"));
        managerRepository.saveAndFlush(new Manager("김예지"));
        managerRepository.saveAndFlush(new Manager("윤지용"));
        studentRepository.saveAndFlush(new Student("최원빈"));
        studentRepository.saveAndFlush(new Student("강준규"));
        studentRepository.saveAndFlush(new Student("김영철"));
        studentRepository.saveAndFlush(new Student("예상기"));
        studentRepository.saveAndFlush(new Student("안지현"));
    }

    @Nested
    @DisplayName("")
    class ManagerTest{

        @Test
        @DisplayName("")
        public void test1(){

        }

    }

    @Nested
    @DisplayName("")
    class StudentTest{

        @Test
        @DisplayName("")
        public void test1(){

        }

    }
}
