package top.futurenotfound.log.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.futurenotfound.log.LogRecord;

import java.math.BigDecimal;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    @LogRecord(
            contentExpression = "金额变更: 金额从 #user.amount 元变更为 #user.newAmount 元",
            operatorExpression = "@testServiceImpl.getUsernameById(#user.id)"
    )
    public void handle(User user) {

    }

    @PostMapping
    @LogRecord(contentExpression = "金额变更: 金额从 #amount 元变更为 #newAmount 元")
    public void handle(BigDecimal amount, BigDecimal newAmount) {

    }

}
