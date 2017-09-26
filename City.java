package com.smk.bi.ticketing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * // TODO Comment
 */
// Nama Farhan Esya Ardhana
// NIS 16101069
    @Entity
    @Table (name ="City")
public class City {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;
    private String cityName;
    private String isValid;
}