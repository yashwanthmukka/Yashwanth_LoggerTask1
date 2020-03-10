package com.yashwanth;

class Depositor implements SimpleInterest, CompoundInterest{
    private Double principalAmount;
    private Double timeSpan;
    private Double rateOfInterest;

    Depositor(Double principalAmount, Double timeSpan, Double rateOfInterest) {
        this.principalAmount = principalAmount;
        this.timeSpan = timeSpan;
        this.rateOfInterest = rateOfInterest;
    }

    Double simpleInterest() {
        return ( principalAmount * timeSpan * rateOfInterest )/100;
     }

     Double compoundInterest() {
        return principalAmount * Math.pow(( 1+ rateOfInterest/100 ), timeSpan);
     }
}