package org.alan.spring.toby.respository;

import org.alan.spring.toby.chapterone.repository.AbcRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class StudentRepositoryTest {

    private final AbcRepository abcRepository;

    @Autowired
    public StudentRepositoryTest(AbcRepository abcRepository) {
        this.abcRepository = abcRepository;
    }

    @Test
    void init() {

    }
}
