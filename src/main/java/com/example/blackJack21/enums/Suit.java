package com.example.blackJack21.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Suit {
    CLUBS('C'),
    SPADES('S'),
    DIAMONDS('D'),
    HEARTS('H');

    public final char symbol;
}