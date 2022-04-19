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
    @LogRecord(
            modelName = "Test.handle.get",
            contentExpression = "金额变更: 金额从 `@testServiceImpl.getAmountById(#orderInfo.id)` 元变更为 `#orderInfo.newAmount` 元",
            operatorExpression = "@testServiceImpl.getUsernameById(#orderInfo.id)",
            timestampExpression = "#orderInfo.timestamp",
            nullFillWord = "空"
    )
    public void handle(OrderInfo orderInfo) {

    }

    @PostMapping
    @LogRecord(
            modelName = "Test.handle.post",
            contentExpression = "金额变更: 金额从 `#amount` 元变更为 `#_result.newAmount` 元"
    )
    public OrderInfo handle(BigDecimal amount) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setNewAmount(new BigDecimal(900));
        return orderInfo;
    }

}
