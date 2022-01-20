package org.ranasoftcraft.com.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "prod")
public class CloudFileService implements FileService {
    @Override
    public String readFile() {
        return "Reading from cloud file system";
    }
}
