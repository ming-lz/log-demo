package top.futurenotfound.log.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.futurenotfound.log.annotation.LogRecord;

import java.math.BigDecimal;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    @LogRecord(contentExpression = "金额变更: 金额从 #orderInfo.amount 元变更为 #orderInfo.newAmount 元", operatorExpression = "@testServiceImpl.getUsernameById(#orderInfo.id)", timestampExpression = "#orderInfo.timestamp")
    public void handle(OrderInfo orderInfo) {

    }

    @PostMapping
    @LogRecord(contentExpression = "金额变更: 金额从 #amount 元变更为 #newAmount 元")
    public void handle(BigDecimal amount, BigDecimal newAmount) {

    }

}
