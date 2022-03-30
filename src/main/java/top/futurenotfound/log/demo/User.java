package top.futurenotfound.log.demo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class User {
    private String id;
    private BigDecimal amount;
    private BigDecimal newAmount;
}
