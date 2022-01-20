package org.ranasoftcraft.com.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author sandeep.rana
 */
@Service
@Profile(value = "dev")
public class LocalFileService implements FileService {
    @Override
    public String readFile() {
        return "Reading from local file system";
    }
}
