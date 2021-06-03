package io.hieule.travelyapp.service;

import io.hieule.travelyapp.repository.TravelEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by Hieu Le on 6/2/2021
 */
@RequiredArgsConstructor
@Service
public class TravelEntityService {
    private final TravelEntityRepository travelEntityRepository;
}
