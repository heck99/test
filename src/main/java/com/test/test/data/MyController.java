package com.test.test.data;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MyController {

    private final MyService service;

    @GetMapping("/{name}")
    public List<Parent> patchParent(@PathVariable String name) throws InterruptedException {
        return service.get2Entity(name);
    }
}
