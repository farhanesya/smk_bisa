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
@Table(name = "Rails")
public class Rails {
    @id
    @GeneratedValue(strategy = GenetationType.IDENTITY)
    private Long railsId;
    private String railsName;
    private Long capcity;