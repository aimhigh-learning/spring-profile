package org.ranasoftcraft.com.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sandeep.rana
 */
@RestController
public class Controller {

    @Autowired
    private FileService fileService;

    @GetMapping("/")
    public String fileReadFrom() {
        return fileService.readFile();
    }
}
