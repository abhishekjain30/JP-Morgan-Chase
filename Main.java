package main.java;

public class Main {
    public static void main(String[] args) {
        // Example usage
        RewardValue cashReward = new RewardValue(100.0); // Cash reward
        System.out.println("Cash Reward: $" + cashReward.getCashValue());
        System.out.println("Equivalent in Miles: " + cashReward.getMilesValue() + " miles");

        RewardValue milesReward = new RewardValue(50000, true); // Miles reward
        System.out.println("Miles Reward: " + milesReward.getMilesValue() + " miles");
        System.out.println("Equivalent in Cash: $" + milesReward.getCashValue());
    }
}
