package top.futurenotfound.log.demo;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    public String getUsernameById(String id) {
        return "maozhijie-" + id;
    }

    @Override
    public String getAmountById(String id) {
        return "100";
    }
}
