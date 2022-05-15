package com.ena.myinsta.entity;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Data
@Entity
public class ImageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false)
    private String name;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] ImageBytes;

    @JsonIgnore
    private Long userId;

    @JsonIgnore
    private Long postId;
}
