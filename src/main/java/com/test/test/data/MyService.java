package com.test.test.data;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MyService {

    private final MyRepository myRepository;

    @Transactional
    public List<Parent> get2Entity(String name) throws InterruptedException {

        var result = myRepository.findByName(name, PageRequest.of(0, 2));
        return result;
    }
}
