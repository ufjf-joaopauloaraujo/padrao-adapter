package org.araujo;

import org.araujo.betjson.BetJSON;
import org.araujo.betxml.BetXML;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoBettingTest {

    @Test
    void validaBetJSON() {
        AutoBetting betting = new AutoBetting(new BetJSON(), new BetXML());

        assertTrue(betting.placeBet("JSON"));
    }

    @Test
    void validaBetXML() {
        AutoBetting betting = new AutoBetting(new BetJSON(), new BetXML());

        assertTrue(betting.placeBet("XML"));
    }

    @Test
    void validaBetOtherFormat() {
        AutoBetting betting = new AutoBetting(new BetJSON(), new BetXML());

        assertFalse(betting.placeBet("SMTP"));
    }
}