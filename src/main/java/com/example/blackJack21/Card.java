package com.example.blackJack21;

import com.example.blackJack21.enums.Suit;
import com.example.blackJack21.enums.Value;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Card {
    private Suit suit;
    private Value value;
    public char getSuitCode() {
        return suit.symbol;
    }

    public int getValueCode() {
        return value.value;
    }
}
