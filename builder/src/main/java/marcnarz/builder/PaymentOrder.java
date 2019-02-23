package marcnarz.builder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class PaymentOrder extends Order {

    private String sourceAccountNumber;

    private String destinationAccountNumber;

    private BigDecimal amount;

    private String currency;

    protected static abstract class BuilderBase<T> extends Order.BuilderBase<T> {

        protected String sourceAccountNumber;

        protected String destinationAccountNumber;

        protected BigDecimal amount;

        protected String currency;

        public T sourceAccountNumber(String sourceAccountNumber) {
            this.sourceAccountNumber = sourceAccountNumber;
            return getThis();
        }

        public T destinationAccountNumber(String destinationAccountNumber) {
            this.destinationAccountNumber = destinationAccountNumber;
            return getThis();
        }

        public T amount(BigDecimal amount) {
            this.amount = amount;
            return getThis();
        }

        public T currency(String currency) {
            this.currency = currency;
            return getThis();
        }

    }

    public static final class Builder extends BuilderBase<Builder> {

        public Builder() {
        }

        public Builder(PaymentOrder order) {
            this.id = order.id;
            this.creationDate = order.creationDate;
            this.createdBy = order.createdBy;
            this.executionDate = order.executionDate;
            this.description = order.description;
            this.sourceAccountNumber = order.sourceAccountNumber;
            this.destinationAccountNumber = order.destinationAccountNumber;
            this.amount = order.amount;
            this.currency = order.currency;
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        public PaymentOrder build() {
            PaymentOrder order = new PaymentOrder();
            order.id = this.id;
            order.creationDate = this.creationDate;
            order.createdBy = this.createdBy;
            order.executionDate = this.executionDate;
            order.description = this.description;
            order.sourceAccountNumber = this.sourceAccountNumber;
            order.destinationAccountNumber = this.destinationAccountNumber;
            order.amount = this.amount;
            order.currency = this.currency;
            return order;
        }
    }
}
