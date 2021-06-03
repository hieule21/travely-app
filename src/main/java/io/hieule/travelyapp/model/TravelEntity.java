package io.hieule.travelyapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Hieu Le on 6/2/2021
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TravelEntity extends BaseEntity{
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
