package marcnarz.builder;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class OrderTest {

    @Test
    public void test() {
        String id = "1";
        LocalDateTime creationDate = LocalDateTime.of(2019, 2, 22, 0, 0);
        String createdBy = "Jan Kowalski";
        LocalDateTime executionDate = LocalDateTime.of(2019, 2, 22, 12, 0);
        String description = "description";

        Order order = new Order.Builder()
                .id(id)
                .creationDate(creationDate)
                .createdBy(createdBy)
                .executionDate(executionDate)
                .description(description)
                .build();

        Assert.assertEquals(order.getId(), id);
        Assert.assertEquals(order.getCreationDate(), creationDate);
        Assert.assertEquals(order.getCreatedBy(), createdBy);
        Assert.assertEquals(order.getExecutionDate(), executionDate);
        Assert.assertEquals(order.getDescription(), description);
    }

}
