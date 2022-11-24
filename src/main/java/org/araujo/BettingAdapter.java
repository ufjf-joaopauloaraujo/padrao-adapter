package org.araujo;

import org.araujo.betjson.IBetJSON;
import org.araujo.betxml.IBetXML;

public class BettingAdapter {

    IBetJSON betJSON;
    IBetXML betXML;

    public BettingAdapter(IBetJSON betJSON, IBetXML betXML) {
        this.betJSON = betJSON;
        this.betXML = betXML;
    }

    public boolean placeBet(String data) {
        // Simulando verificação de XML e JSON
        if (data.equals("XML")) return betXML.realizarApostaXML(data);
        if (data.equals("JSON")) return betJSON.realizarApostaJSON(data);
        return false;
    }
}
