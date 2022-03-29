package top.futurenotfound.log.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.futurenotfound.log.LogRecord;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    @LogRecord(contentExpression = "测试spEL: name=#user.name,namespace=#user.namespace 操作日志", operatorExpression = "@testController.getNamespace(#user.name)")
    public void handle(User user) {

    }

    @PostMapping
    @LogRecord(contentExpression = "测试spEL: name=#name,namespace=#namespace 操作日志")
    public void handle(String name, Integer namespace) {

    }

    public String getNamespace(String name) {
        return "test";
    }

}
