package marcnarz.builder;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentOrderTest {

    @Test
    public void test() {
        String id = "1";
        LocalDateTime creationDate = LocalDateTime.of(2019, 2, 22, 0, 0);
        String createdBy = "Jan Kowalski";
        LocalDateTime executionDate = LocalDateTime.of(2019, 2, 22, 12, 0);
        String description = "description";

        String sourceAccountNumber = "sourceAccountNumber";
        String destinationAccountNumber = "destinationAccountNumber";
        BigDecimal amount = BigDecimal.ONE;
        String currency = "USD";

        PaymentOrder order = new PaymentOrder.Builder()
                .id(id)
                .creationDate(creationDate)
                .createdBy(createdBy)
                .executionDate(executionDate)
                .description(description)
                .sourceAccountNumber(sourceAccountNumber)
                .destinationAccountNumber(destinationAccountNumber)
                .amount(amount)
                .currency(currency)
                .build();

        Assert.assertEquals(order.getId(), id);
        Assert.assertEquals(order.getCreationDate(), creationDate);
        Assert.assertEquals(order.getCreatedBy(), createdBy);
        Assert.assertEquals(order.getExecutionDate(), executionDate);
        Assert.assertEquals(order.getDescription(), description);
        Assert.assertEquals(order.getSourceAccountNumber(), sourceAccountNumber);
        Assert.assertEquals(order.getDestinationAccountNumber(), destinationAccountNumber);
        Assert.assertEquals(order.getAmount(), amount);
        Assert.assertEquals(order.getCurrency(), currency);
    }
}
