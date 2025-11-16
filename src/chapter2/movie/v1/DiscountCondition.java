package chapter2.movie.v1;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
