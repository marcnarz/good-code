package marcnarz.builder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Order {

    protected String id;

    protected LocalDateTime creationDate;

    protected String createdBy;

    protected LocalDateTime executionDate;

    protected String description;

    protected static abstract class BuilderBase<T> extends AbstractBuilderBase<T> {

        protected String id;

        protected LocalDateTime creationDate;

        protected String createdBy;

        protected LocalDateTime executionDate;

        protected String description;

        public T id(String id) {
            this.id = id;
            return getThis();
        }

        public T creationDate(LocalDateTime creationDate) {
            this.creationDate = creationDate;
            return getThis();
        }

        public T createdBy(String createdBy) {
            this.createdBy = createdBy;
            return getThis();
        }

        public T executionDate(LocalDateTime executionDate) {
            this.executionDate = executionDate;
            return getThis();
        }

        public T description(String description) {
            this.description = description;
            return getThis();
        }
    }

    public static final class Builder extends BuilderBase<Builder> {

        public Builder() {
        }

        public Builder(Order order) {
            this.id = order.id;
            this.creationDate = order.creationDate;
            this.createdBy = order.createdBy;
            this.executionDate = order.executionDate;
            this.description = order.description;
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        public Order build() {
            Order order = new Order();
            order.id = this.id;
            order.creationDate = this.creationDate;
            order.createdBy = this.createdBy;
            order.executionDate = this.executionDate;
            order.description = this.description;
            return order;
        }
    }
}
