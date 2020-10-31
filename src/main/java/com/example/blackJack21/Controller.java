package com.example.blackJack21;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @PostMapping("/player")
    private ApiResponse<Player> player(@RequestBody Player player){
        String message;
        if(playBlackjack(player))message=player.getName()+" wins this round";
        else message=player.getName()+" loses this round";
        return new ApiResponse<>(HttpStatus.OK.value(),message, player);
    }

    @PostMapping("/hand")
    private ApiResponse<Player> hand(@RequestBody Player player){
        String message;
        if(playBlackjack(player))message=player.getName()+" wins this round";
        else message=player.getName()+" loses this round";
        return new ApiResponse<>(HttpStatus.OK.value(),message, player);
    }

    Boolean playBlackjack(Player player) {
        Deck deck = new Deck();
        Hand dealerHand = new Hand();
        Hand playerHand = new Hand();
        deck.shuffle();
        dealerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        playerHand.getBlackJackValue();
        player.setHand(playerHand);
        if(playerHand.getBlackJackValue()==21&&dealerHand.getBlackJackValue()!=21)return true;
        else if(dealerHand.getBlackJackValue() == playerHand.getBlackJackValue())return false;
        else if(dealerHand.getBlackJackValue() > playerHand.getBlackJackValue())return false;
        else return true;
    }
}
