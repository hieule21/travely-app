package io.hieule.travelyapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Hieu Le on 6/2/2021
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity{
    private String lastName;
    private String firstName;
}
