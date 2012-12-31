package org.saga.messages;

import org.bukkit.Material;
import org.saga.config.EconomyConfiguration;
import org.saga.dependencies.EconomyDependency;
import org.saga.dependencies.Trader;
import org.saga.factions.Faction;
import org.saga.messages.colours.Colour;
import org.saga.player.SagaPlayer;
import org.saga.utility.text.TextUtil;


public class EconomyMessages {


	// Commands:
	public static String invalidMaterial(String material) {
		return Colour.negative + "Item " + material + " is invalid.";
	}
	
	
	
	// Coins:
	public static String spent(Double coins) {
		
		return Colour.positive + "Spent " + coins(coins) + ".";
		
	}
	
	public static String earned(Double coins) {
		
		return Colour.positive + "Earned " + coins(coins) + ".";
		
	}
	
	public static String insufficient(Double coinsRequired) {
		
		return Colour.negative + coins(coinsRequired) + " required.";
		
	}

	public static String insufficient() {

		return Colour.negative + "Insufficient " + EconomyMessages.coins() + ".";
		
	}
	
	
	
	// Pay:
	public static String paid(SagaPlayer paidPlayer, Double amount) {
		return Colour.positive + "Paid " + coins(amount) + "s to " + paidPlayer.getName() + ".";
	}
	
	public static String gotPaid(SagaPlayer payerPlayer, Double amount) {
		return Colour.positive + "Got paid " + coins(amount) + "s by " + payerPlayer.getName() + ".";
	}
	
	public static String tooFarPay(Double maximumDistance) {
		return Colour.negative + "Need to be within " + maximumDistance.intValue() + "blocks to pay.";
	}
	
	public static String tooFarPay() {
		return Colour.negative + "Too far to pay.";
	}
	
	public static String walletModified(SagaPlayer targetPlayer, Double amount) {
		
		if(amount >= 0) return Colour.positive + "Added " + EconomyMessages.coins(amount) + " to players " + targetPlayer.getName() + " wallet.";
		
		return Colour.positive + "Removed " + EconomyMessages.coins(amount) + " from players " + targetPlayer.getName() + " wallet.";
		
	}
	
	public static String walletModified(Double amount) {
	
		if(amount >= 0) return Colour.positive + "Added " + EconomyMessages.coins(amount) + " to wallet.";
		
		return Colour.positive + "Removed " + EconomyMessages.coins(amount) + " from wallet.";
		
	}
	
	
	
	// Sell/buy signs:
	public static String insufItems(Material items) {
		
		return Colour.negative + "You don't have enough " + GeneralMessages.material(items) + ".";
		
	}
	
	public static String insufItems(Trader trader, Material items) {
		
		return Colour.negative + TextUtil.capitalize(trader.getName()) + " doesn't have enough " + GeneralMessages.material(items) + ".";
		
	}
	
	public static String insufCoins() {
		
		return Colour.negative + "You don't have enough " + coins() + ".";
		
	}
	
	public static String insufCoins(Trader trader) {
		
		return Colour.negative + TextUtil.capitalize(trader.getName()) + " doesn't have enough " + coins() + ".";
		
	}
	
	public static String sold(Material item, Integer amount, Double price) {
		
		return Colour.positive + "Sold " + amount + " " + GeneralMessages.material(item) + " for " + coins(price * amount) + ".";
		
	}
	
	public static String bought(Material item, Integer amount, Double price) {
	
	return Colour.positive + "Bought " + amount + " " + GeneralMessages.material(item) + " for " + coins(price * amount) + ".";
	
}
	
	
	
	// Wages:
	public static String gotPaid(Faction faction, Double amount) {
		
		return faction.getColour2() + "Received " + coins(amount) + " in wages.";
		
	}
	
	public static String gotKillReward(SagaPlayer attakerPlayer, SagaPlayer defenderPlayer, Faction faction, Double amount) {
		return faction.getColour2() + attakerPlayer.getName() + " received " + coins(amount) + " for killing " + defenderPlayer.getName() + ".";
	}
	
	
	
	// Naming:
	public static String coins(Double amount) {
		return TextUtil.displayDouble(amount) + "" + coins();
	}
	
	public static String coins(){
		return EconomyConfiguration.config().coinName;
	}

	

	// User:
	public static String wallet(SagaPlayer sagaPlayer) {
		return Colour.positive + "Wallet: " + EconomyMessages.coins(EconomyDependency.getCoins(sagaPlayer)) + ".";
	}
	
	
}
