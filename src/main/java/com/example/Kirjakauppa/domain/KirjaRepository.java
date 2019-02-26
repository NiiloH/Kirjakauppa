package com.example.Kirjakauppa.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties;


public interface KirjaRepository extends CrudRepository<Kirja, Long>{

}
