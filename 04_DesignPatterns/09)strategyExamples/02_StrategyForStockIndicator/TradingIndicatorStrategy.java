package com.assignment.question;

//Step-1: Create an abstract strategy interface
public interface TradingIndicatorStrategy {
    public Double calculateIndicator(Stock stock);
    public Boolean isSupported(TradingStrategyType type);
    TradingStrategyType supportsType();
}