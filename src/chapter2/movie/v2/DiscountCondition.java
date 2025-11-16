package chapter2.movie.v2;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
