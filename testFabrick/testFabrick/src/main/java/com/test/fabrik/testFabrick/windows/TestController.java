package com.test.fabrik.testFabrick.windows;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

@PostMapping("/two")
public ResponseEntity<Two> two(@Valid @Requestbody Two)


}
