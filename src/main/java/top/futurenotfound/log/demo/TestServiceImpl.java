package top.futurenotfound.log.demo;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    public String getUsernameById(String id) {
        return "maozhijie-" + id;
    }
}
