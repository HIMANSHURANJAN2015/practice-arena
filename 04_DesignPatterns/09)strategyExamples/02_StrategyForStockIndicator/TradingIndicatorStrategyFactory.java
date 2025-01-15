package com.assignment.question;

//step-3: create simple Factory DP to choose strategy based on mode
public class TradingIndicatorStrategyFactory {

    public static TradingIndicatorStrategy getStrategy(TradingStrategyType type) {
        switch(type) {
            case MOVING_AVERAGES: return new MovingAveragesStrategy();
            case MOMENTUM: return new MomentumStrategy();
            case VOLATILITY: return new VolatilityStrategy();
            default: throw new IllegalArgumentException("Invalid trading indicatorn strategy type"+type.toString());
        }

    }

}
