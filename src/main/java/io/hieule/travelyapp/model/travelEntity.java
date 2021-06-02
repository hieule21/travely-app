package io.hieule.travelyapp.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Hieu Le on 6/2/2021
 */
@Entity
@Data
public class travelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
