package io.hieule.travelyapp.dto;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created by Hieu Le on 6/3/2021
 */
public class TravelEntityDTO {
    @NotEmpty
    private String title;
    @NotNull
    private String description;
}
