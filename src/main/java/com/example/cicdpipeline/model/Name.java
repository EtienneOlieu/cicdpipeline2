package com.example.cicdpipeline.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
    @Getter
    @Setter
    @Table(name = "name")

    public class Name {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long id;

        private String f_name;

        private String l_name;

        public Name(){}
    }
