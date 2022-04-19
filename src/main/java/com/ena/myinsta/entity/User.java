package com.ena.myinsta.entity;

import com.ena.myinsta.entity.enums.ERole;
import jdk.dynalink.linker.LinkerServices;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    private Long id;
    private String name;
    private String username;
    private String lastname;
    private String bio;
    private String password;

    private Set<ERole> role = new HashSet<>();
    private List<Post> posts = new ArrayList<>();
    private LocalDateTime localDateTime;

    @PrePersist
    protected void onCreate() {
        this.localDateTime = LocalDateTime.now();
    }
}
