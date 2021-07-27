package src.src.bankapp;

public interface InterestBaseRate {
    default double getBaseRate() {
        return 2.5;
    }
}
