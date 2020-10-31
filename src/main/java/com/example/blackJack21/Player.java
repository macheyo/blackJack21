package com.example.blackJack21;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private Hand hand;
    public Player() {
        this.hand = null;
    }

}
