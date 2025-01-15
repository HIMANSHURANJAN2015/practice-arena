package com.assignment.question;

//step-2: Create concrete strategies class
public class VolatilityStrategy implements TradingIndicatorStrategy {
    //Not making singleton because test cases are not passing as it needs public constructor
    final static TradingStrategyType type = TradingStrategyType.VOLATILITY;
    
    public Double calculateIndicator(Stock stock){
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }

    public Boolean isSupported(TradingStrategyType type){
        if(type == this.supportsType()) {
            return true;
        } else {
            return false;
        }
    }

    public TradingStrategyType supportsType(){
        return type;
    }
    
}