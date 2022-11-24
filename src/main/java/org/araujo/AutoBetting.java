package org.araujo;

import org.araujo.betjson.IBetJSON;
import org.araujo.betxml.IBetXML;

public class AutoBetting {

    private BettingAdapter bettingAdapter;

    public AutoBetting(IBetJSON betJSON, IBetXML betXML) {
        this.bettingAdapter = new BettingAdapter(betJSON, betXML);
    }

    public boolean placeBet(String data) {
        return bettingAdapter.placeBet(data);
    }
}
