package com.artrium.webservices.test;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Tester, Long> {

    public Tester findByUsername(String username);

}
