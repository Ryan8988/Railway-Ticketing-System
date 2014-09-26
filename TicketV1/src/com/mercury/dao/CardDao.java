package com.mercury.dao;

import java.util.List;

import com.mercury.beans.Card;

public interface CardDao {
	public void save(Card card);
	public List<Card> cardQuery();
	public void delete(Card card);
	public void update(Card card);
	public Card findByCardNum(int number);	
}
