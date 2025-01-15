package com.assignment.question;

//step-2: Create concrete strategies class
public class MomentumStrategy implements TradingIndicatorStrategy {
    //Not making singleton because test cases are not passing as it needs public constructor
    final static TradingStrategyType type = TradingStrategyType.MOMENTUM;
    
    public Double calculateIndicator(Stock stock){
        return stock.getPrice() - stock.getPreviousPrice();
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
